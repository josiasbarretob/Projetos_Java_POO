package Atividade04;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmacia medicamento = new Farmacia ("Dipirona", 50, "23/01/2023","Maleato de Tiranil","Bayer");
		Farmacia medicamento02 = new Farmacia ("Tylenol", 100, "20/11/2022","Maleato de Dopamina","Eupharma");
		
		medicamento.visualizar();
		medicamento02.visualizar();

	}

}
