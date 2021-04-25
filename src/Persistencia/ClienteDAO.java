package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelos.Cliente;

public class ClienteDAO {
	//instruções sql
	private Conexao minhaConexao;
	
	private final String INCLUIRCLIENTE = "insert into \"Cliente\" (\"nome\", \"endereco\", "
            + "\"cpfCli\", \"telefone\") values (?, ?, ?, ?)";
	
	private final String BUSCARCLIENTE = "select * from \"Cliente\" where \"cpfCli\"=?";
	
	private final String CLIENTEGERAL = "select * from \"Cliente\"";
	
	public ClienteDAO(){
        minhaConexao = new Conexao("jdbc:postgresql://localhost:5432/DBPetShop","postgres","090506");
    }
	//metodos 
	//inclui o cliente
	public void inclusaocliente(Cliente c){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = 
                    minhaConexao.getConexao().prepareStatement(INCLUIRCLIENTE);
            instrucao.setString(1, c.getNome());
            instrucao.setString(2, c.getEndereco());
            instrucao.setInt(3, c.getCpf());
            instrucao.setInt(4, c.getTelefone());
            instrucao.execute();
            minhaConexao.desconectar();
        }catch(Exception e){
            System.out.println("Erro na inclusao: "+e.getMessage());
        }
        
    }

	//buscar o cliente
	public Cliente buscarcliente(int cpf){
		Cliente c = null;
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = 
                    minhaConexao.getConexao().prepareStatement(BUSCARCLIENTE);
            instrucao.setInt(1, cpf);
            ResultSet rs = instrucao.executeQuery();
            if(rs.next()){
                c = new Cliente(rs.getString("nome"),rs.getString("endereco"),
                        rs.getInt("cpfCli"),rs.getInt("telefone"));
            }
            minhaConexao.desconectar();
        }catch(SQLException e){
            System.out.println("Erro na busca: "+e.getMessage());
        }
        return c;
    }
	//cliente geral
	public ArrayList<Cliente> ClienteGeral (){
		   ArrayList<Cliente> lista = new ArrayList<>();
		try {
			minhaConexao.conectar();
			Statement instrucao = minhaConexao.getConexao().createStatement();
			ResultSet rs = instrucao.executeQuery(CLIENTEGERAL);
			while(rs.next()) {
				Cliente c = new Cliente(rs.getString("nome"), rs.getString("endereco"),
	            rs.getInt("cpfCli"), rs.getInt("telefone")); 
				lista.add(c);
			}
			minhaConexao.desconectar();
		}catch(SQLException e) {
			System.out.println("ERRO NO RELATORIO"+ e.getMessage());
		}
		return lista;
	}
	public ArrayList<String> ClienteGeral2(){
		   ArrayList<String> lista = new ArrayList<>();
		try {
			minhaConexao.conectar();
			Statement instrucao = minhaConexao.getConexao().createStatement();
			ResultSet rs = instrucao.executeQuery(CLIENTEGERAL);
			while(rs.next()) {
				//Cliente c = new Cliente(rs.getString("nome"), rs.getString("endereco"),
	            //rs.getInt("cpfCli"), rs.getInt("telefone")); 
				lista.add(rs.getString("nome"));
			}
			minhaConexao.desconectar();
		}catch(SQLException e) {
			System.out.println("ERRO NO RELATORIO"+ e.getMessage());
		}
		return lista;
	}
}
