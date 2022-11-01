package tarefa08;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub-

		float altura, largura, area, acumulaArea;
		String continuar = "";
		String comodo;
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora de area das casas");
		System.out.println();

		do {

			System.out.println("Digite o nome do comodo da casa");

			System.out.println("Deseja continuar calculando? ");
			continuar = sc.next();

		} while (continuar == "sim");

		sc.close();
	}

}
