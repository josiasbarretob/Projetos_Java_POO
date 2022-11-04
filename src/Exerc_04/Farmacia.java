package Atividade04;

public class Farmacia {

	private String nome;
	private int capacidade;
	private String validade;
	private String composicao;
	private String laboratorio;

	public Farmacia(String nome, int capacidade, String validade, String composicao, String laboratorio) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.validade = validade;
		this.composicao = composicao;
		this.laboratorio = laboratorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getComposicao() {
		return composicao;
	}

	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public void visualizar() {
		System.out.println("\n*********************************************");
		System.out.println("*********** Farmácia Popular ***********");
		System.out.println("*********************************************");
		System.out.println("\n Nome do Medicamento: " + this.nome);
		System.out.println("\n Capacidade do Frasco: " + this.capacidade);
		System.out.println("\n Validade do Medicamento: " + this.validade);
		System.out.println("\n Composição do Medicamento: " + this.composicao);
		System.out.println("\n Laboratório do Medicamento: " + this.laboratorio);
	}

}
