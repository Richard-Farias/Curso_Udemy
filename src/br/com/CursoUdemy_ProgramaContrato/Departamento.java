package br.com.CursoUdemy_ProgramaContrato;

public class Departamento {
	
	private String name;
	
	public Departamento() {
		
	}
	
	public Departamento(String name) {
	
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name ;
	}
	
	
	
}
