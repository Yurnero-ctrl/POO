package Modelos;

public class Consulta {
	
	private String nomePet;
	private String especie;
	private String raca;
	private String sexo;
	private String atendimento;
	
	public Consulta(String nomePet, String especie, String raca, String sexo, String atendimendo) {
		super();
		this.nomePet = nomePet;
		this.especie = especie;
		this.raca = raca;
		this.sexo = sexo;
		this.atendimento = atendimendo;
	}

	public Consulta() {
		// TODO Auto-generated constructor stub
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAtendimendo() {
		return atendimento;
	}

	public void setAtendimendo(String atendimendo) {
		this.atendimento = atendimendo;
	}

	public void cadastrarConsulta() {
		// TODO Auto-generated method stub
		
	}

	public String getArendimento() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String imprimirConsulta() {
		return "Nome: " + nomePet + "\nEspecie: " + especie +
				"\nRaça: " + raca + "\nSexo: " + sexo +
				"\nAtendimento: " + atendimento;
		
	}
}
