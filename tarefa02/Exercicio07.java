package tarefa02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
		 *  calcular e escrever a área do retângulo. Dica a=b.h */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a base");
		float base=sc.nextFloat();
		
		System.out.println("Digite a altura");
		float altura=sc.nextFloat();
		
		float arearetangulo=base*altura;
		
		System.out.println("A area do triangulo é: " +arearetangulo);
		sc.close();
	}

}