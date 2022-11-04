package Atividade04;

public class Perfumaria extends Farmacia {

	private String fragrancia;

	public Perfumaria(String nome, int capacidade, String validade, String composicao, String laboratorio,
			String fragrancia) {
		super(nome, capacidade, validade, composicao, laboratorio);
		// TODO Auto-generated constructor stub
		this.fragrancia = fragrancia;

	}

	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("A fragrância é: "+this.fragrancia);
	}
}
