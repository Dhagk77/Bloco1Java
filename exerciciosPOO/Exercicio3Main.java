package IntroducaoPOO;

public class Exercicio3Main {

	public static void main(String[] args) {
		Exercicio3PE prod = new Exercicio3PE();
		
		prod.nome = "Notebook";
		prod.anoFab = 2018;
		prod.porte = false;
		prod.funcTom = true;
		prod.avaliacao = 4.5;
		
		prod.informacoesProd();
	}

}