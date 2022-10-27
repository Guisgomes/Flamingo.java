package tarefa02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler as dimensões de um triângulo (base e altura),
		 *  calcular e escrever a área do triângulo. Dica a=b.h/2*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base");
		float base=sc.nextFloat();
		
		System.out.println("Digita a altura");
		float altura=sc.nextFloat();
		
		float triangulo=base*altura/2;
		
		System.out.println("O valor do triangulo é: " +triangulo);
		sc.close(); 
	}

}