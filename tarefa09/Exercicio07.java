package tarefa09;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int numero = 10;
		int contadora = 1;
		int fatorial = 1;

		do {

			if (numero % 2 != 0) {

				fatorial = fatorial * contadora;

			}

			System.out.println(fatorial);
			contadora++;
		} while (contadora <= numero);
	}

}
