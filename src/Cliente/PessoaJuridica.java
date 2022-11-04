package Cliente;

public class PessoaJuridica extends Cliente {
	
	private String razaoSocial;
	
	public PessoaJuridica(String nome, String sexo, int idade, String cpf, String string, float altura, float peso, String razaoSocial) {
		super(nome, sexo, idade, cpf, string, altura, peso);
		this.razaoSocial = razaoSocial;
		
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\n Razão Social do Cliente: " + this.razaoSocial);
	}
	
}
