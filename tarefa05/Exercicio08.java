package tarefa05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas
		 * horas inteiras, sem os minutos) e calcule a duração do jogo em horas,
		 * sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo
		 * pode iniciar em um dia e terminar no dia seguinte.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe  a hora do inicio do jogo");
		int horaInicio = sc.nextInt();
		System.out.println("Informe a hora final do jogo");
		int horaFinal = sc.nextInt();
		
		int resultadoDoJogo = horaInicio - horaFinal;
		
		if (resultadoDoJogo > 0) {
			System.out.println("A partida de Xadrez durou " + resultadoDoJogo + " Horas ");
		} else {
			int resultadoDoJogoAcabadoNoDiaSeguinte = resultadoDoJogo + 24;
			System.out.println("A partida de Xadrez Durou " + resultadoDoJogoAcabadoNoDiaSeguinte + " Horas ");
		}
		sc.close();

	}
}
