package tarefa02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura),
		 *  calcular e escrever a �rea do ret�ngulo. Dica a=b.h */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a base");
		float base=sc.nextFloat();
		
		System.out.println("Digite a altura");
		float altura=sc.nextFloat();
		
		float arearetangulo=base*altura;
		
		System.out.println("A area do triangulo �: " +arearetangulo);
		sc.close();
	}

}