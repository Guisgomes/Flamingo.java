package tarefa05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio
		 * que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da
		 * hora regular com um acr�scimo de 50%. Escreva um algoritmo que leia o n�mero
		 * de horas trabalhadas em um m�s, o sal�rio por hora e escreva o sal�rio total
		 * do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido
		 * trabalhadas (considere que o m�s possua 4 semanas exatas).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantas horas de trabalho voc� fez na primeira semana:");
		int semana1 = sc.nextInt();

		System.out.println("Digite quantas horas de trabalho voc� fez na segunda semana:");
		int semana2 = sc.nextInt();

		System.out.println("Digite quantas horas de trabalho voc� fez na terceira semana:");
		int semana3 = sc.nextInt();

		System.out.println("Digite quantas horas de trabalho voc� fez na quarta semana:");
		int semana4 = sc.nextInt();

		System.out.println("Digite o sal�rio por hora do funcin�rio:");
		int salarioHora = sc.nextInt();

		int horasMes = semana1 + semana2 + semana3 + semana4;

		int salarioMes = salarioHora * 160;

		if (horasMes > 160) {

			int calculoValorHoraExtra = (50 * salarioHora / 100);
			int salarioHoraExtra = salarioMes + ((calculoValorHoraExtra + salarioHora) * (horasMes - 160));

			System.out.println(salarioHoraExtra);
		} else {
			System.out.println(salarioMes);
			sc.close();
		}
	}
}
