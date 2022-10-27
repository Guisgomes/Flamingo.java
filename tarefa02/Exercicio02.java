package tarefa02;

import java.util.Scanner;

public class Exercicio02 {
	
	/*2) solicite um valor do teclado e exiba o seu antecessor.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor:");
		int numero=sc.nextInt();
		int antecessor=numero-1;
		System.out.println("O antecessor do número digitado é:"  +antecessor);
		sc.close();
	}
}
