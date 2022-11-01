package tarefa08;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contadora = 1;
		float numero = 0;
		float somador = 0;

		while (contadora <= 10) {
			System.out.print("Digite o valor numero " + contadora + ": ");
			numero = sc.nextFloat();

			somador = somador + numero;

			contadora++;

		}

		System.out.println("A soma dos número digitados é: " + somador);
		System.out.println("A média dos números digitados é: " + (somador / 10));

		sc.close();

	}

}
