package TestaCliente;

import Cliente.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente Client0001 = new Cliente ("Josias","Masculino",28,"102.209.309-87","99840-6483",189f,89f);
		Cliente Client0002 = new Cliente ("Majuh","Feminino",2,"020.398.456-34","99840-8734",52f,3f);
		Client0001.visualizar();
		Client0002.visualizar();

	}

}
