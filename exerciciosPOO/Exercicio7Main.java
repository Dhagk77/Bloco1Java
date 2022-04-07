package IntroducaoPOO;

public class Exercicio7Main {

	public static void main(String[] args) {
		Exercicio7Paciente pac = new Exercicio7Paciente();
		
		/* pac.nome = "Gabriel";
		pac.doenca = "Poliomelite";
		pac.sexo = false;
		pac.idade = 18;
		pac.peso = 61.00; */
		// Não precisa disso aqui por causa dos parâmetros lá no método 'pac.informacaoPaciente'
		
		pac.checarSexo();
		
		pac.informacaoPaciente("Gabriel", "Poliomelite", false, 18, 61.00);
	}

}