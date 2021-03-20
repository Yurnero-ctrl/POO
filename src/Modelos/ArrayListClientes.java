package Modelos;

import java.util.ArrayList;

public class ArrayListClientes {
	
	private static ArrayList<Cliente> listaClientes; 
	public ArrayListClientes() {
		listaClientes= new ArrayList<>();
	}
	
	public static ArrayList<Cliente> getCliente () {
		return listaClientes;
	}
	
	static public void adicionar(Cliente c) {
		listaClientes.add(c);
	}
	static public String listar() {
		String saida = "";
		int i = 1;
		for (Cliente c : listaClientes) {
			saida += c.imprimirNome() + "\n";
			saida += "\n=== CLIENTE N°" + (i++) + "===\n";
		}
		
		return saida;
	}

	public void adicionar(String nome, String endereco, String cpf, String telefone) {
		// TODO Auto-generated method stub
		
	}

	public void colocar(Consulta consulta) {
		// TODO Auto-generated method stub
		
	}
	
}
