package IntroducaoPOO;

public class POOCanetaExemplo {
	// Não vai rodar nada, é so um molde para o objeto.
	// ATRIBUTOS -> CARACTERÍSTICAS
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
	
	public void escrever() //MÉTODOS -> Comportamento
	{
		if(tampa==true)
			System.out.println("Erro, Caneta tampada!");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tampar()
	{
		this.tampa=true; // 'this' referencia o objeto desejado e faz a instrução quando o método é acionado;

	}
	
	public void destampar() //void só executa uma tarefa, não devolve nenhum valor
	{
		this.tampa=false;
	}
	public void estado()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta"+this.ponta);
		System.out.println("A carga está em "+this.carga+"%");
		
		
	}
	// metodo construtor
			public POOCanetaExemplo()
			{
				this.tampa=true;
				this.carga=100;
}
