package tarefa02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor),
		 *  calcular e escrever a área do losango. Dica a=D.d/2*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a diagonal maior do losangulo");
		float diagonalmaior=sc.nextFloat();
		
		System.out.println("Digite a diagonal menor do losangulo");
		float diagonalmenor=sc.nextFloat();
		
		float area=diagonalmaior*diagonalmenor/2;
		
		System.out.println("O valor da area do losangulo é: " +area);
		sc.close();

	}
}