package Cliente;

public class PessoaFisica extends Cliente {
	
	private String CNH;
	
	public PessoaFisica(String nome, String sexo, int idade, String cpf, String string, float altura, float peso, String CNH) {
		super(nome, sexo, idade, cpf, string, altura, peso);
		// TODO Auto-generated constructor stub
		this.CNH = CNH;
	}

	public String getCNH() {
		return CNH;
	}

	public void setCNH(String cNH) {
		CNH = cNH;
	}
	 public void visualizar() {
		 super.visualizar();
		 System.out.println("\n CNH do Cliente: " + this.CNH);
	 }
}
