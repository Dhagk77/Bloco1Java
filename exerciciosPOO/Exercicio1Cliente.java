package IntroducaoPOO;

/* 1) CRIE UMA CLASSE CLIENTE E APRESENTE OS ATRIBUTOS E M�TODOS 
 * REFERENTES ESTA CLASSE, EM SEGUIDA CRIE UM OBJETO CLIENTE, 
 * DEFINA AS INSTANCIAS DESTE OBJETO E APRESENTE AS INFORMA��ES
 * DESTE OBJETO NO CONSOLE. */

public class Exercicio1Cliente {
	// O QUE UM CLIENTE DE UMA CONCESSION�RIA TEM?
	
	boolean cadastro, posse;
	String nome, carro;
	int idade, cnh;
	
	public void entrada() {
		if (cadastro == false){
			System.out.println("Seja bem-vindo � Hernan Motorsport!");
		}
		else 
		{
			System.out.println("Cliente n�o cadastrado.");
		}
	}
	public void cadastrar()
	{
		this.cadastro = true;
	}
	public void desistencia()
	{
		this.cadastro = false;
	}
	public void possuiCarro() {
		
		if (posse == true) {
			System.out.println("Gostaria de Adquirir um Hernan Motorsport feito especialmente para voc�?");
		}
		else {
				System.out.println("Seja bem-vindo � Hernan Motorsport");
		}
		
	}
		public void possui()
		{
			this.posse = true;
		}
		public void npossui()
		{
			this.posse = false;
		}
		
	public void status()
	{
		System.out.println("Cliente � cadastrado? "+this.cadastro);
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("CNH: "+this.cnh);
		System.out.println("Voc� possu� ve�culo?: "+this.posse);
		System.out.println("Modelo do ve�culo: "+this.carro);
   
  
 }
}
