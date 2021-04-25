package Visao;

import java.util.ArrayList;
import java.util.Scanner;

import Modelos.ArrayListConsultas;
import Modelos.Cliente;
import Modelos.Consulta;
import Modelos.Funcionario;
import Persistencia.ClienteDAO;
import Persistencia.ConsultaDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


	public class Principal extends Application {
		@Override
		public void start(Stage stagePrincipal) throws Exception {
	        
	        
	        Parent root = FXMLLoader.load(getClass().getResource("FXMLLoginPetShop.fxml"));
	        Scene scene = new Scene(root);
	        stagePrincipal.setScene(scene);
	        stagePrincipal.setTitle("Pet Shop Pata de Gorila - Login");
	        stagePrincipal.show();
		}
		
		public static void main(String[] args) {
			launch(args);
		}
}
	
	/*
	public static String opcao;

	
	private static ArrayListConsultas con;
	
	
	public static void main(String[] args) {
		
		
		con = new ArrayListConsultas();
		ClienteDAO cliDAO = new ClienteDAO();
		ConsultaDAO conDAO = new ConsultaDAO();
		ArrayList<Cliente> lista;
		ArrayList<Consulta> lista1;
		int i, e;
		
		Scanner ler = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
		
		String nome;
		String endereco;
		int cpf;
		int telefone;

		ArrayListConsultas lc1;
		String nomePet;
		String especie;
		String raca;
		String sexo;
		String atendimento;
		
		do {
			
			System.out.println("BEM VINDO AO PETSHOP PATA DE GORILA");
			System.out.println("---------MENU---------");
			System.out.println("1 - CADASTRAR CLIENTE");
			System.out.println("2 - VER CLIENTE");
			System.out.println("3 - MARCAR CONSULTA");
			System.out.println("4 - VER CONSULTA");
			System.out.println("5 - REMOVER CONSULTA");
			System.out.println("6 - SAIR");
			System.out.println("");
			System.out.println("");
			System.out.println("Digite a opcao:");
			
			opcao = teclado1.nextLine();
			
			switch(opcao) {
			
			case "1":
				System.out.println("Inclusao de Cliente");
                Cliente c = new Cliente(); 
                System.out.println("Digite o cpf do novo cliente: ");
                c.setCpf(ler.nextInt());
                if(cliDAO.buscarcliente(c.getCpf())==null){
                    ler.nextLine();
                    System.out.println("Digite o nome: ");
                    c.setNome(ler.nextLine());
                    System.out.println("Digite o endereco: ");
                    c.setEndereco(ler.nextLine());
                    System.out.println("Digite o telefone: ");
                    c.setTelefone(ler.nextInt());
                    cliDAO.inclusaocliente(c);
                    System.out.println("Contato cadastrado com sucesso!");
                }else
                    System.out.println("O cliente ja esta cadastrado!");
				break;
			
			case "2":
				System.out.println("Clientes Geral");
                lista = new ArrayList<>();    
                lista = cliDAO.ClienteGeral();
                for(i=0; i<lista.size(); i++){
                    System.out.println("--------------------------------------");
                    System.out.println("Nome: "+lista.get(i).getNome());
                    System.out.println("Endereco: "+lista.get(i).getEndereco());
                    System.out.println("Cpf: "+lista.get(i).getCpf());
                    System.out.println("Telefone: "+lista.get(i).getTelefone());
                }
                System.out.println("Relatorio finalizado com sucesso");
                break;
				
			case "3":
				System.out.println("Inclusao de Consulta");
                Consulta c1 = new Consulta(); 
                System.out.println("Digite o cpf do novo cliente: ");
                c1.setIdPet(ler.nextInt());
                if(conDAO.buscarconsulta(c1.getIdPet())==null){
                    ler.nextLine();
                    System.out.println("Digite o nomePet: ");
                    c1.setNomePet(ler.nextLine());
                    System.out.println("Digite a especie: ");
                    c1.setEspecie(ler.nextLine());
                    System.out.println("Digite o raca: ");
                    c1.setRaca(ler.nextLine());
                    System.out.println("Digite o sexo: ");
                    c1.setSexo(ler.nextLine());
                    System.out.println("Digite o atendimento: ");
                    c1.setAtendimendo(ler.nextLine());
                    System.out.println("Digite o id");
                    c1.setIdPet(ler.nextInt());
                    conDAO.inclusao(c1);
                    System.out.println("Consulta cadastrado com sucesso!");
                }else
                    System.out.println("A Consulta ja esta cadastrado!");
				break;
				
			case "4":
				System.out.println("Consultas Geral");
                lista1 = new ArrayList<>();    
                lista1 = conDAO.ConsultaGeral();
                for(i=0; i<lista1.size(); i++){
                    System.out.println("--------------------------------------");
                    System.out.println("NomePet: "+lista1.get(i).getNomePet());
                    System.out.println("Especie: "+lista1.get(i).getEspecie());
                    System.out.println("Raca: "+lista1.get(i).getRaca());
                    System.out.println("Sexo: "+lista1.get(i).getSexo());
                    System.out.println("Atendimento: "+lista1.get(i).getAtendimendo());
                    System.out.println("IdPet: "+lista1.get(i).getIdPet());
                }
                System.out.println("Relatorio finalizado com sucesso");
                break;
                
			case "5":
				System.out.println("Exclusao de Consulta");
                c1 = new Consulta();
                System.out.println("Digite o Id do pet que deseja excluir: ");
                c1.setIdPet(ler.nextInt());
                if(conDAO.buscarconsulta(c1.getIdPet())==null){
                    System.out.println("O pet nao esta cadastrado!");
                }else{
                       conDAO.exclusao(c1.getIdPet());
                        System.out.println("Exclusao realizada!");
                }
				break;
				
			case "6":
				System.out.println("");
				System.out.println("");
				System.out.println("Volte sempre!");
				
				break;
				
			default:
				System.out.println("");
				System.out.println("Opcao invalida!");
				System.out.println("");
			}
		} while (!opcao.equals("6"));
	}*/
	

