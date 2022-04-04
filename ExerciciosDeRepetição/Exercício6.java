package LaçosJava1;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args){
		
		int  num, resto, soma =0, cont =0, media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			resto = num % 3;
			if (resto == 0 && num > 0) {
				soma += num;
				cont++;
			}	
		} while (num !=0 );
		
		media = soma/cont;
		
		System.out.println("A média dos números digitados é: "+ media);
	}


 }


