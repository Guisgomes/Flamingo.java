package tarefa08;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadora = 0;
		int numero = 1;
		int soma = 1;
		int fibonat = 1;

		while (contadora <= 15) {

			fibonat = numero + soma;
			numero = soma;
			soma = fibonat;

			System.out.println(fibonat);
			contadora++;
		}
	}

}
