package tarefa03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a
		 *  idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
		 *  
		 */
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Digite quantos anos voce tem");
		 int anos =sc.nextInt();
		 
		 System.out.println("Digite quantos meses se passarao desde o ultimo aniversario");
		 int meses =sc.nextInt();
		 
		 System.out.println("Digite quantos dias se passarao desde o seu ultimo aniversario");
		 int dias =sc.nextInt();

		 int totaldias = anos * 365 + meses * 30 + dias;
		 System.out.println("Sua idade em dias é: " +totaldias);
		 sc.close();
	}
}