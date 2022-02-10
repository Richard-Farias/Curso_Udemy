package br.com.MainEnum;

import java.util.Date;

import br.com.CursoUdemy_Enum.OrdenarSatusEnum;
import br.com.PagamentoEnum.Pagamento;

public class MainEnum {

	public static void main(String[] args) {
		Pagamento pagamento = new Pagamento(1099,new Date(), OrdenarSatusEnum.AGUARDANDO_PAGAMENTO);
		System.out.println(pagamento);

	}

}
