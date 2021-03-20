package Modelos;

import java.util.Scanner;

public class Funcionario {

	private String usuario;
	private String senha;
	private String nome;
	private int cpf;
	
	public Funcionario(String usuario, String senha, String nome, int cpf) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public void cadastrarCliente() {
		System.out.println("Informe seu nome, endereco, cpf e telefone");
		Scanner teclado = new Scanner (System.in);
		
		Cliente c1 = new Cliente(teclado.nextLine(), teclado.nextLine(), teclado.nextLine(),teclado.nextLine());
		
		 System.out.println("nome: " + c1.getNome());
         System.out.println("endereco: " + c1.getEndereco());
         System.out.println("cpf: " + c1.getCpf());
         System.out.println("celular: " + c1.getTelefone());   
		
	}
	public void cadastrarConsulta() {
		Scanner teclado3 = new Scanner (System.in);
		Consulta consul = new Consulta(teclado3.nextLine(), teclado3.nextLine(), teclado3.nextLine(), teclado3.nextLine(), teclado3.nextLine());
		
		System.out.println("nome: " + consul.getNomePet());
		System.out.println("Especie: " + consul.getEspecie());
		System.out.println("Raça: " + consul.getRaca());
		System.out.println("Sexo: " + consul.getSexo());
		System.out.println("Atendimento: " + consul.getArendimento());
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	
}
