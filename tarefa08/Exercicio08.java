package tarefa08;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float celcius = 10;
		float farenit;

		while (celcius <= 100) {

			farenit = (celcius * 9 / 5) + 32;

			System.out.println(farenit + " graus farenit");

			celcius = celcius + 10;
		}
	}

}
