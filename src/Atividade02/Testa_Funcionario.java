package Atividade02;

public class Testa_Funcionario {

	public static void main(String[] args) {
		
		
		Funcionario Funcionario01 = new Funcionario ("Josias","Masculino",310118,28,6760f);
		Funcionario Funcionario02 = new Funcionario ("Thamirys","Feminino",310120,24,1212.78f);
		Gerente G01 = new Gerente ("Majuh","Feminino",200920,02,3,3000);
		Gerente G02 = new Gerente ("João Barros","Masculino",18,52,3,5000);
		Vendedor V01 = new Vendedor ("Fernando","Masculino",310987,18,1212,10000);
		Vendedor V02 = new Vendedor ("Paloma","Feminino",230987,20,2500,5000);
		
		Funcionario01.visualizar();
		Funcionario02.visualizar();
		G01.visualizar();
		G02.visualizar();
		V01.visualizar();
		V02.visualizar();
	}

}
