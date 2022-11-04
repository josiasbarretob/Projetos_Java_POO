package Atividade02;

public class Gerente extends Funcionario {
	
	private int adicional; 

	public Gerente(String nome, String sexo, int matricula, int idade, float salario, int adicional) {
		super(nome, sexo, matricula, idade, salario);
		// TODO Auto-generated constructor stub
		this.adicional = adicional;
		
	}

	public int getAdicional() {
		return adicional;
	}

	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\n Adicional: R$ "+this.adicional);
	}

}
