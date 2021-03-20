package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Modelos.ArrayListClientes;
import Modelos.ArrayListConsultas;
import Modelos.Cliente;
import Modelos.Consulta;
import Modelos.Funcionario;

public class Principal {
	
	public static String opcao;

	private static ArrayListClientes cli;
	private static ArrayListConsultas con;
	
	public static void main(String[] args) {
		
		cli = new ArrayListClientes();
		con = new ArrayListConsultas();
		
		Scanner teclado1 = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
		
		String nome;
		String endereco;
		String cpf;
		String telefone;

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
			System.out.println("Digite a opção:");
			
			opcao = teclado1.nextLine();
			
			switch(opcao) {
			
			case "1":
				System.out.println("");
				System.out.println("");
				System.out.println("---------CADASTRO CLIENTE---------");

				
				System.out.println("Digite o nome");
				nome = teclado2.nextLine();
				
				System.out.println("Digite o endere�o");
				endereco = teclado2.nextLine();
				
				System.out.println("Digite o cpf");
				cpf = teclado2.nextLine();
				
				System.out.println("Digite o telefone");
				telefone = teclado2.nextLine();
				
				
				cli.adicionar(new Cliente(nome, endereco, cpf, telefone));
				
				System.out.println("");
				System.out.println("");
				
				break;
			
			case "2":
				System.out.println("");
				System.out.println("");
				System.out.println("---------CLIENTES CADASTRADOS---------");
				
				System.out.println(cli.listar());
				
				System.out.println("");
				System.out.println("");
				
				break;
				
			case "3":
				System.out.println("");
				System.out.println("");
				System.out.println("---------MARCAR CONSULTA---------");

				
				System.out.println("Digite o nome do pet");
				nomePet = teclado2.nextLine();
				
				System.out.println("Digite a especie");
				especie = teclado2.nextLine();
				
				System.out.println("Digite o ra�a");
				raca = teclado2.nextLine();
				
				System.out.println("Digite o sexo");
				sexo = teclado2.nextLine();
				
				System.out.println("Qual o atendimento");
				atendimento = teclado2.nextLine();
			
				
				con.colocar(new Consulta(nomePet, especie, raca, sexo, atendimento));
				
				System.out.println("");
				System.out.println("Consulta marcada com sucesso!");
				System.out.println("");
				System.out.println("");
				
				break;
				
			case "4":
				System.out.println("");
				System.out.println("");
				System.out.println("---------CONSULTAS MARCADAS---------");
				
				System.out.println(con.listar());
				
				System.out.println("");
				System.out.println("");
				
				break;
			case "5":
				System.out.println("");
				System.out.println("");
				System.out.println("---------REMOVER CONSULTA---------");
				System.out.println("Insira o nome do pet");
				nomePet = teclado2.nextLine();
				
//				System.out.println(con.listar());
				if(!(ArrayListConsultas.listar().isEmpty())) {
					if(ArrayListConsultas.remove(nomePet)) {
						System.out.println("");
						System.out.println("Consulta removida com sucesso!");
					}else {
						System.out.println("");
						System.out.println("Não tem consulta cadastrada com esse nome.");
					}
				}
				else
				{
					System.out.println("Não tem consulta cadastrada.");
				}
				
				System.out.println("");
				System.out.println("");
				
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
	}
	
}
