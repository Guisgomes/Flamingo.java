package tarefa08;

public class Exercicio03 {

	public static void main(String[] args) {
		int contadora = 0;
		int soma = 0;

		while (contadora <= 500) {
			soma = soma + contadora;
			contadora = contadora + 2;
		}
		System.out.println(soma);

	}
}