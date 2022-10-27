package tarefa02;

import java.util.Scanner;

public class Exercicio11 {
	/*Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura),
	 *  calcular e escrever a área do trapézio. a=(B+b).h/2*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base maior");
		float basemaior=sc.nextFloat();
				
		System.out.println("Digite a base menor");
		float basemenor=sc.nextFloat();
		
		System.out.println("Digite a altura");
		float altura=sc.nextFloat();
		
		float trapezio=(basemaior+basemenor)*altura/2;
		System.out.println("A area do trapezio corresponde a: " +trapezio);
		sc.close();
	}

}