package br.com.PagamentoEnum;

import java.util.Date;

import br.com.CursoUdemy_Enum.OrdenarSatusEnum;

public class Pagamento {
	private Integer id;
	private Date dataPedido;
	private OrdenarSatusEnum statusPedido;
	
	public Pagamento () {
		
	}

	public Pagamento(Integer id, Date dataPedido, OrdenarSatusEnum statusPedido) {
		this.id = id;
		this.dataPedido = dataPedido;
		this.statusPedido = statusPedido;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public OrdenarSatusEnum getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(OrdenarSatusEnum statusPedido) {
		this.statusPedido = statusPedido;
	}

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", dataPedido=" + dataPedido + ", statusPedido=" + statusPedido + "]";
	}
	
	

}
