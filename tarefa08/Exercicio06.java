package tarefa08;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int base, expoente;

		System.out.print("Digite valor da base: ");
		base = sc.nextInt();
		System.out.print("Digite o valor do expoente: ");
		expoente = sc.nextInt();

		System.out.println(Math.pow(base, expoente));

		sc.close();

	}

}
