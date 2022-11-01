package tarefa09;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 1;
		int somatorio = 0;

		do {

			if (numero % 2 == 0) {
				somatorio = somatorio + numero;
			}

			numero++;
		} while (numero <= 500);

		System.out.println(somatorio);
		
	}

}
