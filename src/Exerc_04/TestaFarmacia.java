package Atividade04;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmacia medicamento = new Farmacia ("Dipirona", 50, "23/01/2023","Maleato de Tiranil","Bayer");
		Farmacia medicamento02 = new Farmacia ("Tylenol", 100, "20/11/2022","Maleato de Dopamina","Eupharma");
		Medicamento Remedio = new Medicamento ("Eutyrox", 150,"21/09/2024","Dipirona Sódica","Bayer",204);
		Medicamento MED01 = new Medicamento ("ADEDA D3", 10,"21/10/2024","Vitamina D","Mantercorp",1001);
		Perfumaria PERF01 = new Perfumaria ("Shampoo",400,"23/12/2022","Aloe e Vera","Pantene","Lavanda");
		Perfumaria PERF02 = new Perfumaria ("Creme Dental",90,"23/12/2025","Carvao Ativado","Sorriso","Menta");
		
		medicamento.visualizar();
		medicamento02.visualizar();
		Remedio.visualizar();
		MED01.visualizar();
		PERF01.visualizar();
		PERF02.visualizar();

	}

}
