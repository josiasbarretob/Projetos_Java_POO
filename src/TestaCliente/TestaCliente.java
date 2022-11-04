package TestaCliente;

import Cliente.Cliente;
import Cliente.PessoaFisica;
import Cliente.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente Client0001 = new Cliente ("Josias","Masculino",28,"102.209.309-87","99840-6483",189f,89f);
		Cliente Client0002 = new Cliente ("Majuh","Feminino",2,"020.398.456-34","99840-8734",52f,3f);
		PessoaFisica PF01 = new PessoaFisica ("Thamirys","Feminino",24,"109.987.987-87","99740-5432", 167f, 70f, "A");
		PessoaFisica PF02 = new PessoaFisica ("Ivanete","Feminino",53,"000.000.000-32","99875-2340", 182f, 92f, "AB");
		PessoaJuridica PJ01 = new PessoaJuridica ("Josias Barreto","Masc",28,"0","2748-3930",0f,0,"Usina Beer.MEI");
		PessoaJuridica PJ02 = new PessoaJuridica ("Casas Bahia","Masculino",5,"00000","2340-4090",0,0,"CASASBAHIA.LTDA");
		
		Client0001.visualizar();
		Client0002.visualizar();
		PF01.visualizar();
		PF02.visualizar();
		PJ01.visualizar();
		PJ02.visualizar();

	}

}
