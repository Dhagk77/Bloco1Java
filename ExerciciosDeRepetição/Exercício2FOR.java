package La�osJava1;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Exerc�cio2FOR {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, contPar = 0, contImpar = 0;
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Digite 10 n�meros:\n ");
			n=ler.nextInt();
		
		if (n%2==0) 
		{
			contPar++;
		}
		if (n%2==1) 
		{
			contImpar++;
		}
		System.out.println("Foram digitados "+contPar+" n�meros pares e \n"+contImpar+" n�meros �mpares");
		
		}

	}

}
