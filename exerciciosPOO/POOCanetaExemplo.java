package IntroducaoPOO;

public class POOCanetaExemplo {
	// N�o vai rodar nada, � so um molde para o objeto.
	// ATRIBUTOS -> CARACTER�STICAS
	String cor;
	double ponta;
	int carga;
	boolean tampa;
	
	/*
	 * Public - Todos podem ver
Private - Somente a classe pode ver
Protected - Somente a classe e seus herdeiros

	 */
	
	
	
	// metodo construtor
	// Tem que ter o memso nome da class
	public POOCanetaExemplo(String x, double p)
	{
		this.cor=c;
		this.ponta=p;
		this.tampa=true;
		this.ponta=0.7
	}
	
	public void escrever() //M�TODOS -> Comportamento
	{
		if(tampa==true)
			System.out.println("Erro, Caneta tampada!");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tampar()
	{
		this.tampa=true; // 'this' referencia o objeto desejado e faz a instru��o quando o m�todo � acionado;

	}
	
	public void destampar() //void s� executa uma tarefa, n�o devolve nenhum valor
	{
		this.tampa=false;
	}
	public void estado()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta"+this.ponta);
		System.out.println("A carga est� em "+this.carga+"%");
		
		
	}
	// metodo construtor
			public POOCanetaExemplo()
			{
				this.tampa=true;
				this.carga=100;
}
