package br.com.CursoUdemy_ProgramaContrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ClasseMain {

	public static void main(String[] args) throws ParseException {
		Scanner enter = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		Departamento departamento = new Departamento();
		HorasContrato contrato = new HorasContrato();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		List<HorasContrato> listaContratos = new ArrayList<HorasContrato>();
		boolean controleMenu = false;
		int menu = 0;

		System.out.println("=========== ## RELATÓRIO MENSAL ## =========== ");
		System.out.println();
		System.out.print("Digite o Departamento: ");
		departamento.setName(enter.nextLine());
		// funcionario.setDepartamento(departamento);
		System.out.println();
		System.out.println("=========== ## REGISTRO FUNCIONÁRIO ## =========== ");
		System.out.println();

		do {
			System.out.println("MENU [1] - Registrar Funcionário [2] - Cadasto de Contrato");
			System.out.println("MENU [3] - Remover Contrato      [4] - Sair");
			System.out.println();
			System.out.print("Digite uma das opções acima: ");
			menu = enter.nextInt();
			System.out.println();

			if (menu == 1) {
				controleMenu = true;
				System.out.print("Funcionário: ");
				enter.nextLine();
				funcionario.setNome(enter.nextLine());
				System.out.println();
				System.out.println("Categorias: [1] - Junior  [2] - Pleno [3] - Sênior");
				System.out.println();
				System.out.print("Categoria:");
				int categoria = enter.nextInt();
				funcionario.inserirCategoria(categoria);
				System.out.println();
				System.out.print("Base Salarial: ");
				funcionario.setSalarioBase(enter.nextDouble());
				System.out.println();
				Funcionario funcionarioCadastrado = new Funcionario(funcionario.getNome(), funcionario.getCategoria(),
						funcionario.getSalarioBase(), departamento);
				System.out.println(funcionarioCadastrado.toString());

			}
			if (menu == 2) {
				System.out.println("=========== ## CADASTRO DE CONTRATO ## =========== ");
				System.out.println();
				System.out.print("Quantos contratos desja cadastar: ");
				int quantidadeContrato = enter.nextInt();
				for (int i = 0; i < quantidadeContrato; i++) {
					System.out.println("Digite o contrato #" + i+1);
					System.out.println();
					System.out.println(">> Data Início <<");
					System.out.println();
					System.out.print("Dia:");
					String dia = enter.next();
					System.out.println();
					System.out.print("Mês:");
					String mes = enter.next();
					System.out.println();
					System.out.print("Ano:");
					String ano = enter.next();
					String data = dia + "/" + mes + "/" + ano;
					Date dataContrato = sdf.parse(data);
					contrato.setData(dataContrato);
					System.out.println();
					System.out.println("Digite o valor da hora:");
					contrato.setValorPorHora(enter.nextDouble());
					System.out.println();
					System.out.println("Digite a quantidade de horas gasta:");
					contrato.setHoras(enter.nextInt());
					System.out.println();
					listaContratos.add(contrato);
					System.out.println();

				}
				
				boolean saldoContato = false;
				
				do {
					System.out.println("=========== ## SALDO MENSAL DE CONTRATO ## =========== ");
					System.out.println();
					System.out.println("MENU [1] - Calcular Contrato     [2] - Sair");
					System.out.println();
					int menuSaldo = enter.nextInt();
					if (menuSaldo == 1) {
						saldoContato = true;
						System.out.println();
						System.out.println(" Digite mês e Ano do contrato que deseja ver o saldo :");
						System.out.print("Mês: ");
						int mesContrato = enter.nextInt();
						System.out.println();
						System.out.println("Ano:");
						int anoContrato = enter.nextInt();
						System.out.println();

						System.out.println("## CONTRATO MENSAL ## ");
						System.out.println();
						System.out.println("Data: " + mesContrato + "/" + anoContrato);
						System.out.println();
						System.out.println("Nome: " + funcionario.getNome());
						System.out.println();
						System.out.println("Departamento: " + departamento.getName());
						System.out.println();
						System.out.println("Saldo Contrato: R$ "+ String.format("%.2f", funcionario.calcularGanhosMensais(mesContrato, anoContrato)));

					} else {
						System.out.println();
						System.out.println("Saindo do Menu Saldo...");
						saldoContato = false;
					}

				} while (saldoContato != false);

			} else if (menu == 4) {

				System.out.println(" Saindo do Sistema ...");
				controleMenu = false;
			}

		} while (controleMenu != false);

	}

}
