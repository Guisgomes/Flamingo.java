package tarefa02;

import java.util.Scanner;

public class Exercicio01 {

	/*1) solicite um valor do teclado e exiba o seu sucessor.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int numero=sc.nextInt();
		int sucessor=numero+1;
		System.out.println("O sucessor do número digitado é:"  +sucessor);
		sc.close();
		

	}

}
