package Atividade02;

import Atividade02.Funcionario;

public class Testa_Funcionario {

	public static void main(String[] args) {
		
		
		Funcionario Funcionario01 = new Funcionario ("Josias","Masculino",310118,28,6760f);
		Funcionario Funcionario02 = new Funcionario ("Thamirys","Feminino",310120,24,1212.78f);
		
		Funcionario01.visualizar();
		Funcionario02.visualizar();
	}

}
