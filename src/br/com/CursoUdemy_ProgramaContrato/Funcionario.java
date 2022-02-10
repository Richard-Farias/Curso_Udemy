package br.com.CursoUdemy_ProgramaContrato;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
	private String nome;
	private CategoriaProfissinal categoria;
	private Double salarioBase;
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();

	public Funcionario() {

	}

	public Funcionario(String nome, CategoriaProfissinal categoria, Double salarioBase, Departamento departamento) {

		this.nome = nome;
		this.categoria = categoria;
		this.salarioBase = salarioBase;
		this.departamento = departamento;

	}

	public void adicionarContrato(HorasContrato contrato) {
		System.out.println("Data Contrato: " + contrato.data);
		System.out.println();
		System.out.println("Valor Hora: R$" + contrato.valorPorHora);
		System.out.println();
		System.out.println("Tempo Gasto: " + contrato.horas);
		contratos.add(contrato);

	}

	/*
	 * public void adicionarContrato(HorasContrato contrato) {
	 * System.out.println("Data Contrato: " + contrato.data); System.out.println();
	 * System.out.println("Valor Hora: R$" + contrato.valorPorHora);
	 * System.out.println(); System.out.println("Tempo Gasto: " + contrato.horas); }
	 */

	public void removerContrato(HorasContrato contrato) {
		contratos .remove(contrato);

	}

	public Double calcularGanhosMensais(int mes, int ano) {
		
		double salarioTotal = salarioBase;
		Calendar calend = Calendar.getInstance();
		
		for(HorasContrato contrato : contratos){
			
			int dataMes = calend.get(Calendar.MONTH);
			int dataAno = calend.get(Calendar.YEAR);
			
			if( mes == dataMes && ano == dataAno) {
				salarioTotal = contrato.calcularValorTotalHoras();
			}
			
		}
		
		return salarioTotal; 

	}

	public void inserirCategoria(int opcao) {
		if (opcao == 1) {
			categoria = categoria.ANALISTA_JUNIOR;
		} else if (opcao == 2) {
			categoria = categoria.ANALISTA_PLENO;
		} else if (opcao == 3) {
			categoria = categoria.ANALISTA_SENIOR;
		} else {
			System.out.println("Opção Inválida!");
		}
	}
	
	StringBuilder saidaDados = new StringBuilder();
	@Override
	public String toString() {
		saidaDados.append("Nome: " + nome + "\n" + "Categoria: " + categoria + "\n" + "Salário Base: R$ " + salarioBase + "\n" + "Departamento: " + departamento);
		
		//return "Funcionario [nome=" + nome + ", categoria=" + categoria + ", salarioBase=" + salarioBase
			//	+ ", departamento=" + departamento  + "]";
		return saidaDados.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CategoriaProfissinal getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProfissinal categoria) {
		this.categoria = categoria;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContratos() {
		return contratos;
	}

	

}
