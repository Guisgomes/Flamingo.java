package tarefa02;

import java.util.Scanner;

public class exercicio04 {

	/* digitar um valor para fazer a subtração dos numeros */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int Resultado = num1 - num2;

		System.out.println("O Resultado dos valores é: " + Resultado);
		sc.close();
	}
}
