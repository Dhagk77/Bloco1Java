package IntroducaoPOO;

/* 1) CRIE UMA CLASSE CLIENTE E APRESENTE OS ATRIBUTOS E MÉTODOS 
 * REFERENTES ESTA CLASSE, EM SEGUIDA CRIE UM OBJETO CLIENTE, 
 * DEFINA AS INSTANCIAS DESTE OBJETO E APRESENTE AS INFORMAÇÕES
 * DESTE OBJETO NO CONSOLE. */


public class Exercicio1Main {

	public static void main(String[] args) {
		Exercicio1Cliente cliente = new Exercicio1Cliente();
		
		cliente.cadastro = false;
		cliente.nome = "Daniel Hernan Alves Galli";
		cliente.idade = 23;
		cliente.carro = "Hernan Hostil V14 7.7 Quadri-Turbo H&H ";
		// PRO FORMA ADAMUS PRO FORMA EVA
		cliente.cnh = 123456789;
		cliente.posse = true;
		
		cliente.entrada();
		cliente.possuiCarro();
		cliente.status();
		
		
		
		
		

	}

}
