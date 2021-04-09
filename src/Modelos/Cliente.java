package Modelos;

public class Cliente {

	private String nome;
	private String endereco;
	private int cpf;
	private int telefone;
	
	public Cliente() {
		
	}
	public Cliente(String nome, String endereco, int cpf, int telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String imprimirNome() {
		return "Nome: " + nome + "\nEndereco: " + endereco +
				"\nCpf: " + cpf + "\nTelefone: " + telefone;
				
	}
	public String toString() {
	return "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + '}';
	}
	}
