package tarefa05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
		 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
		 * hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número
		 * de horas trabalhadas em um mês, o salário por hora e escreva o salário total
		 * do funcionário, que deverá ser acrescido das horas extras, caso tenham sido
		 * trabalhadas (considere que o mês possua 4 semanas exatas).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantas horas de trabalho você fez na primeira semana:");
		int semana1 = sc.nextInt();

		System.out.println("Digite quantas horas de trabalho você fez na segunda semana:");
		int semana2 = sc.nextInt();

		System.out.println("Digite quantas horas de trabalho você fez na terceira semana:");
		int semana3 = sc.nextInt();

		System.out.println("Digite quantas horas de trabalho você fez na quarta semana:");
		int semana4 = sc.nextInt();

		System.out.println("Digite o salário por hora do funcinário:");
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
