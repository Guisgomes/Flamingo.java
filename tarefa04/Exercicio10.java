package tarefa04;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Em uma eleição sindical concorreram ao cargo de presidente três candidatos
		 * (A, B e C). Durante a apuração dos votos foram computados votos nulos e votos
		 * em branco, além dos votos válidos para cada candidato. Deve ser criado um
		 * programa de computador que efetue a leitura da quantidade de votos válidos
		 * para cada candidato, além de efetuar também a leitura da quantidade de votos
		 * nulos e votos em branco. Ao final o programa deve apresentar o número total
		 * de eleitores, considerando votos válidos, nulos e em branco; o percentual
		 * correspondente de votos válidos em relação à quantidade de eleitores; o
		 * percentual correspondente de votos válidos do candidato A em relação à
		 * quantidade de eleitores; o percentual correspondente de votos válidos do
		 * candidato B em relação à quantidade de eleitores; o percentual correspondente
		 * de votos válidos do candidato C em relação à quantidade de eleitores; o
		 * percentual correspondente de votos nulos em relação à quantidade de
		 * eleitores; e por último o percentual correspondente de votos em branco em
		 * relação à quantidade de eleitores.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("digite a quantidade de votos validos para o candidato A: ");
		float candidatoA = sc.nextFloat();
		System.out.println("digite a quantidade de votos validos para o candidato B: ");
		float candidatoB = sc.nextFloat();
		System.out.println("digite a quantidade de votos validos para o candidato C: ");
		float candidatoC = sc.nextFloat();
		System.out.println("Digite a quantidade de votos nulos");
		float votoNulo = sc.nextFloat();
		System.out.println("Digite a quantidade de votos brancos");
		float votoBranco = sc.nextFloat();
		float totalEleitores = candidatoA + candidatoB + candidatoC + votoNulo + votoBranco;
		float percentualValidoCandidatoA = candidatoA / totalEleitores * 100;
		float percentualValidoCandidatoB = candidatoB / totalEleitores * 100;
		float percentualValidoCandidatoC = candidatoB / totalEleitores * 100;
		float PercentualVotoNulo = votoNulo / totalEleitores * 100;
		float percentualvotoBranco = votoBranco / totalEleitores * 100;
		System.out.println("o total de eleitores é: " + totalEleitores);
		System.out.println("o percentual de votos validos para o candidato A é:" + percentualValidoCandidatoA + "%");
		System.out.println("o percentual de votos validos para o candidato B é:" + percentualValidoCandidatoB + "%");
		System.out.println("o percentual de votos validos para o candidato C é:" + percentualValidoCandidatoC + "%");
		System.out.println("o percentual de votos nulos é: " + PercentualVotoNulo + "%");
		System.out.println("o percentual de votos brancos é: " + percentualvotoBranco + "%");
		sc.close();
	}

}
