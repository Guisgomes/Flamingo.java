package tarefa08;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float contadora = 50;
		float somador = 0;

		while (contadora < 70) {

			somador = somador + contadora;

			contadora = contadora + 2;
		}

		System.out.println("Soma: " + somador);
		System.out.println("Média: " + (somador / 10));

	}

}
