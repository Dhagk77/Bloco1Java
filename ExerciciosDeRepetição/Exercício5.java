package La�osJava1;

import java.util.Scanner;

public class Exerc�cio5 {
	
	public static void main(String[] args) {
		int  num, soma =0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			soma += num;
		}while (num !=0 );
		System.out.println("A soma dos n�meros digitados �: "+ soma);
	}

}
