package tarefa04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Ler quatro números inteiros e apresentar o resultado da adição e
		 * multiplicação, baseando-se na utilização do conceito da propriedade
		 * distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser
		 * somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e
		 * por fim C com D. Perceba que será necessário efetuar seis operações de adição
		 * e seis operações de multiplicação e apresentar doze resultados de saída.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		int A = sc.nextInt();
		System.out.println("Digite o segundo numero");
		int B = sc.nextInt();
		System.out.println("Digite o terceiro numero");
		int C = sc.nextInt();
		System.out.println("Digite o quarto numero");
		int D = sc.nextInt();

		int Soma1 = A + B;
		int Soma2 = C + A;
		int Soma3 = A + D;
		int Soma4 = B + C;
		int Soma5 = B + D;
		int Soma6 = C + D;

		System.out.println("Resultado da Soma: \nA+B=" + Soma1 + "\nC+A=" + Soma2 + "\nA+D" + Soma3 + "\nB+C" + Soma4
				+ "\nB+C" + Soma5 + "\nB+D" + Soma6 + "\nC+D +Soma6");

		int multiplicacao1 = A * B;
		int multiplicacao2 = C * A;
		int multiplicacao3 = A * D;
		int multiplicacao4 = B * C;
		int multiplicacao5 = B * D;
		int multiplicacao6 = C * D;

		System.out.println("Resultado da multiplicacao: \nA*B=" + multiplicacao1 + "\nC*A=" + multiplicacao2 + "\nA*D"
				+ multiplicacao3 + "\nB+C" + multiplicacao4 + "\nB*C" + "\nB*C" + multiplicacao5 + "\nB*D"
				+ multiplicacao6 + "\nC*D +multiplicacao6");
		sc.close();

	}

}
