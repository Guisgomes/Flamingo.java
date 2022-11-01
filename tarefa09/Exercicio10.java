package tarefa09;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, acumuladora, contadora = 1, soma = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("primeiro numero: ");
		numero1 = sc.nextInt();
		System.out.println("dividido por: ");
		numero2 = sc.nextInt();

		do {
			soma++;
			acumuladora = numero2 * contadora;

			// if (acumuladora > numero1) {

			// }

			contadora++;

		} while (acumuladora <= numero1);

		System.out.println(soma);

		sc.close();

	}

}
