package Atividade02;

public class Funcionario {
	
	private String nome;
	private String sexo;
	private int matricula;
	private int idade;
	private float salario;
	//--- Generate Constructor using Fields...
	public Funcionario(String nome, String sexo, int matricula, int idade, float salario) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.matricula = matricula;
		this.idade = idade;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public void visualizar() {
		System.out.println("\n*********************************************");
		System.out.println("*****************Funcionários:*****************");
		System.out.println("***********************************************");
		System.out.println("\n Nome do FUNCIONÁRIO: " + this.nome);
		System.out.println("\n Sexo do FUNCIONÁRIO: " + this.sexo);
		System.out.println("\n Matricula do FUNCIONÁRIO: " + this.matricula);
		System.out.println("\n Idade do FUNCIONÁRIO: " + this.idade);
		System.out.println("\n Salário do FUNCIONÁRIO: " + this.salario);
	}

}
