package La�osJava1;

import java.util.Scanner;

/*
 * Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

public class Exerc�cio3While {
	public static void main(String[] args) {
		
		int idade, cont21=0, cont50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			if (idade < 21) {
				cont21++;
			}
			if (idade > 50) {
				cont50++;
			}
			
		}
		System.out.println("O total de pessoal com menos de 21 anos �: "+cont21);
		System.out.println("O total de pessoal com mais de 50 anos �: "+cont50);
	}
}
