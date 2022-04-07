package IntroducaoPOO;

public class Exercicio2Main {
		public static void main(String[] args) {
			Exercicio2Aviao aviao = new Exercicio2Aviao();
			
			aviao.anosConstruido = 50;
			aviao.uso = "Civil";
			aviao.marca = "TAN";
			aviao.atividade = true;
			aviao.manutencao = false;
			
			aviao.estadoAviao();
		}

	}