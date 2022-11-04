package Cliente;

public class Cliente {
	
	private String nome;
	private String sexo;
	private int idade;
	private String cpf;
	private String telefone;
	private float altura;
	private float peso;
	
	public Cliente(String nome, String sexo, int idade, String cpf, String string, float altura, float peso) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = string;
		this.altura = altura;
		this.peso = peso;
	}

	public Cliente(String string, String string2, int i, String string3, String string4, float f, float g,
			String string5) {
		// TODO Auto-generated constructor stub
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//---Generate constructor using Fields...
	public void visualizar() {
		System.out.println("\n*********************************************");
		System.out.println("***********Informações dos Clientes:***********");
		System.out.println("*********************************************");
		System.out.println("\n Nome do Cliente: " + this.nome);
		System.out.println("\n Sexo do Cliente: " + this.sexo);
		System.out.println("\n Idade do Cliente: " + this.idade);
		System.out.println("\n CPF do Cliente: " + this.cpf);
		System.out.println("\n Telefone do Cliente: " + this.telefone);
		System.out.println("\n Altura do Cliente: " + this.altura);
		System.out.println("\n Peso do Cliente: " + this.peso);
	}
	
}
