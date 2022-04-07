package IntroducaoPOO;

import java.util.Scanner;

public class Caneta {

	public static void main(String[] args) {  // static void main é usado aqui porque via rodar o programa
		POOCanetaExemplo c1 = new POOCanetaExemplo(); // método construtor (obrigatório para construir um objeto) 
		POOCanetaExemplo c2 = new POOCanetaExemplo(); // se contrói quando o padrão não atende a necessidade
		Scanner ler = new Scanner(System.in);		// o contrutor padrão é null
		
		ler.close();
		
		c2.cor="super black";
		c2.ponta=0.7;
		c2.carga=50;
		
		c1.cor="black";
		c1.ponta=0.7;
		c1.carga=97;
		c1.estado();
		
		c2.estado();
		c1.estado();
		
		
		}
	}

}
