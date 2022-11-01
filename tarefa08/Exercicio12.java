package tarefa08;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int valor;
		int auxMaior = 0;
		int auxMenor = 0;

		do {
			System.out.print("Digite um valor: ");
			valor = sc.nextInt();

			if (valor > auxMaior) {
				auxMaior = valor;
			} else {
				auxMenor = valor;
			}

		} while (valor > 0);

		System.out.println();
		System.out.println("Maior valor digitado: " + auxMaior);
		System.out.println("Menor valor digitado: " + auxMenor);

		sc.close();
	}

}
