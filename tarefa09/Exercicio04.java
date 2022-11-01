package tarefa09;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quadro = 0;
		float acumulador = 0;
		float grao = 1;

		do {

			acumulador = acumulador + grao;
			grao = grao * 2;

			System.out.println(acumulador);
			quadro++;
		} while (quadro < 63);

		System.out.println(acumulador);

	}

}
