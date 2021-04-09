package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelos.Consulta;

public class ConsultaDAO {
	private Conexao minhaConexao;
	
	//instruçoes sql
	private final String INCLUIRCONSULTA = "insert into \"Consulta\" (\"idPet\", \"nomePet\", "
            + "\"especie\", \"raca\", \"sexo\", \"atendimento\") values (?, ?, ?, ?, ?, ?)";
	
	private final String BUSCARCONSULTA = "select * from \"Consulta\" where \"idPet\"=?";
	
	private final String EXCLUIR = "delete from \"Consulta\" where \"idPet\"=?";
	
	private final String CONSULTAGERAL = "select * from \"Consulta\"";
	
	public ConsultaDAO(){
        minhaConexao = new Conexao("jdbc:postgresql://localhost:5432/DBPetShop","postgres","090506");
    }
	// metodos 
	//incluir consulta
	public void inclusao(Consulta c1){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = 
                    minhaConexao.getConexao().prepareStatement(INCLUIRCONSULTA);
            instrucao.setInt(1, c1.getIdPet());
            instrucao.setString(2, c1.getNomePet());
            instrucao.setString(3, c1.getEspecie());
            instrucao.setString(4, c1.getRaca());
            instrucao.setString(5, c1.getSexo());
            instrucao.setString(6, c1.getAtendimendo());
            instrucao.execute();
            minhaConexao.desconectar();
        }catch(Exception e){
            System.out.println("Erro na inclusao: "+e.getMessage());
        }
    }
	
	//buscar a consulta
	public Consulta buscarconsulta(int idPet){
		Consulta c1 = null;
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = 
                    minhaConexao.getConexao().prepareStatement(BUSCARCONSULTA);
            instrucao.setInt(1, idPet);
            ResultSet rs = instrucao.executeQuery();
            if(rs.next()){
                c1 = new Consulta(rs.getString("nomePet"),
                        rs.getString("especie"),rs.getString("raca"),rs.getString("sexo"),
                        rs.getString("atendimento"),rs.getInt("idPet"));
            }
            minhaConexao.desconectar();
        }catch(SQLException e){
            System.out.println("Erro na busca: "+e.getMessage());
        }
        return c1;
    }
	
	//excluir a consulta
	public void exclusao(int idPet){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = 
                    minhaConexao.getConexao().prepareStatement(EXCLUIR);
            instrucao.setInt(1, idPet);
            instrucao.execute();
            minhaConexao.desconectar();
        }catch(Exception e){
            System.out.println("Erro na exclus�o: "+e.getMessage());
        }
    }
	//consulta geral
	public ArrayList<Consulta> ConsultaGeral (){
		   ArrayList<Consulta> lista = new ArrayList<>();
		try {
			minhaConexao.conectar();
			Statement instrucao = minhaConexao.getConexao().createStatement();
			ResultSet rs = instrucao.executeQuery(CONSULTAGERAL);
			while(rs.next()) {
				Consulta c1 = new Consulta(rs.getString("nomePet"),
	            rs.getString("especie"), rs.getString("raca"), rs.getString("sexo"),
	            rs.getString("atendimento"),rs.getInt("idPet")); 
				lista.add(c1);
			}
			minhaConexao.desconectar();
		}catch(SQLException e) {
			System.out.println("ERRO NO RELATORIO"+ e.getMessage());
		}
		return lista;
	}
	
}
