package tarefa02;

import java.util.Scanner;

public class Exercicio03 {
	
	/* Digitar um valor e fazer a soma dos numeros*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int soma=num1+num2;
		
		System.out.println("a soma dos valores é "+ soma);
		sc.close();
	}
}
