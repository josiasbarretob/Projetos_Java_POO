package Atividade04;

public class Medicamento extends Farmacia {

	private int lote;

	public Medicamento(String nome, int capacidade, String validade, String composicao, String laboratorio, int lote) {
		super(nome, capacidade, validade, composicao, laboratorio);
		// TODO Auto-generated constructor stub
		this.lote = lote;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\n O número do Lote é: "+this.lote);
	}
}
