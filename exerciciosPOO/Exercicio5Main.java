package IntroducaoPOO;

public class Exercicio5Main {

	public static void main(String[] args) {
		Exercicio5Patinete pat = new Exercicio5Patinete();
		
		pat.rodas = 2;
		pat.anoFab = 2010;
		pat.marca = "Suzuki";
		pat.estado = true;
		
		pat.informacoesPatinete();
		pat.andar();
	}
}