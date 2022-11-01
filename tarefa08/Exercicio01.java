package tarefa08;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um
		// número qualquer.

		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe um nummero de 1 a 10");
		numero = sc.nextInt();
		
		int contadora = 1;
		while (contadora <= 10) {
			int resultado = numero* contadora;
			System.out.println(resultado);
			contadora++;
			sc.close();

		}
	}
}