package LaçosJava1;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Exercício2FOR {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, contPar = 0, contImpar = 0;
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Digite 10 números:\n ");
			n=ler.nextInt();
		
		if (n%2==0) 
		{
			contPar++;
		}
		if (n%2==1) 
		{
			contImpar++;
		}
		System.out.println("Foram digitados "+contPar+" números pares e \n"+contImpar+" números ímpares");
		
		}

	}

}
