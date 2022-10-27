package tarefa04;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Em uma elei��o sindical concorreram ao cargo de presidente tr�s candidatos
		 * (A, B e C). Durante a apura��o dos votos foram computados votos nulos e votos
		 * em branco, al�m dos votos v�lidos para cada candidato. Deve ser criado um
		 * programa de computador que efetue a leitura da quantidade de votos v�lidos
		 * para cada candidato, al�m de efetuar tamb�m a leitura da quantidade de votos
		 * nulos e votos em branco. Ao final o programa deve apresentar o n�mero total
		 * de eleitores, considerando votos v�lidos, nulos e em branco; o percentual
		 * correspondente de votos v�lidos em rela��o � quantidade de eleitores; o
		 * percentual correspondente de votos v�lidos do candidato A em rela��o �
		 * quantidade de eleitores; o percentual correspondente de votos v�lidos do
		 * candidato B em rela��o � quantidade de eleitores; o percentual correspondente
		 * de votos v�lidos do candidato C em rela��o � quantidade de eleitores; o
		 * percentual correspondente de votos nulos em rela��o � quantidade de
		 * eleitores; e por �ltimo o percentual correspondente de votos em branco em
		 * rela��o � quantidade de eleitores.
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
		System.out.println("o total de eleitores �: " + totalEleitores);
		System.out.println("o percentual de votos validos para o candidato A �:" + percentualValidoCandidatoA + "%");
		System.out.println("o percentual de votos validos para o candidato B �:" + percentualValidoCandidatoB + "%");
		System.out.println("o percentual de votos validos para o candidato C �:" + percentualValidoCandidatoC + "%");
		System.out.println("o percentual de votos nulos �: " + PercentualVotoNulo + "%");
		System.out.println("o percentual de votos brancos �: " + percentualvotoBranco + "%");
		sc.close();
	}

}
