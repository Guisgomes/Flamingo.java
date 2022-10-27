package tarefa06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir
		 * uma mensagem dizendo que o aluno foi aprovado, se o valor da m�dia escolar
		 * for maior ou igual a 5. Se o valor da m�dia for menor que 7, solicitar a nota
		 * de exame, somar com o valor da m�dia e obter nova m�dia. Se a nova m�dia for
		 * maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado
		 * em exame. Se o aluno n�o foi aprovado, indicar uma mensagem informando esta
		 * condi��o. Apresentar com as mensagens o valor da m�dia do aluno, para
		 * qualquer condi��o.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota");
		float nota1 = sc.nextFloat();

		System.out.println("Digite a segunda nota");
		float nota2 = sc.nextFloat();

		System.out.println("Digite a terceira nota");
		float nota3 = sc.nextFloat();

		System.out.println("Digite a quarta nota");
		float nota4 = sc.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		if (media >= 7) {
			System.out.println("aprovado com a media igual a: " + media);
		} else if (media < 7) {
			System.out.println("insira a nota do exame");
			Float exame = sc.nextFloat();

			Float novaMedia = (media + exame) / 2;
			System.out.println("nova media: " + novaMedia);
			if (novaMedia >= 5) {
				System.out.println("aprovado em exame com média igual a: " + novaMedia);
				sc.close();
			}

		}
	}
}
	
		
