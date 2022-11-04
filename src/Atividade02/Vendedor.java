package Atividade02;

public class Vendedor extends Funcionario{

	private int meta;
	
	public Vendedor(String nome, String sexo, int matricula, int idade, float salario, int meta) {
		super(nome, sexo, matricula, idade, salario);
		// TODO Auto-generated constructor stub
		this.meta = meta;
	}

	public int getMeta() {
		return meta;
	}

	public void setMeta(int meta) {
		this.meta = meta;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Meta do Vendedor : " +this.meta);
	}
}
