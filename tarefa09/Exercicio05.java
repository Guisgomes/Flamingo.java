package tarefa09;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int fatorial = 1;
		int contadora = 1;
		int contadora2 = 1;
		int soma;

		do {
			System.out.println("Digite o valor numero: " + contadora);
			numero = sc.nextInt();

			do {

				fatorial = fatorial * contadora2;
				soma = fatorial;

				contadora2++;

			} while (contadora2 <= numero);

			System.out.println(soma);

			contadora++;
		} while (contadora <= 15);

		sc.close();

	}

}
