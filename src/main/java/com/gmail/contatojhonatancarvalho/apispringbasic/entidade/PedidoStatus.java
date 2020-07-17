package com.gmail.contatojhonatancarvalho.apispringbasic.entidade;

public enum PedidoStatus {
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	
	private PedidoStatus(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public static PedidoStatus valueOf(int codigoP) {
		for (PedidoStatus value : PedidoStatus.values() ) {
			if (value.getCodigo() == codigoP) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código inválido para esse pedido");
	}
	
	
}
