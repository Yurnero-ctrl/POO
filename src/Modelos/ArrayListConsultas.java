package Modelos;

import java.util.ArrayList;

public class ArrayListConsultas {
	
	private static ArrayList<Consulta> listaConsulta = new ArrayList<>();
	
	public static ArrayList<Consulta> getCliente () {
		return listaConsulta;
	}
	
	static public void colocar(Consulta c1) {
		listaConsulta.add(c1);
	}
	//for para percorrer o laço procurando o nome do pet, se existir ele retorna um true e remove, se não ele retorna o falso.
	static public boolean remove(String nomePet) {
		for(Consulta c1: listaConsulta) {
			if(c1.getNomePet().equalsIgnoreCase(nomePet)) {
				listaConsulta.remove(c1);
				return true;
			}
			
		}
		return false;
	}
	
	static public String listar() {
		String saida = "";
		int i = 1;
		for (Consulta c1 : listaConsulta) {
			saida += "\n=== CONSULTA N°" + (i++) + "===\n";
			saida += c1.imprimirConsulta() + "\n";
		}
	return saida;
}
}