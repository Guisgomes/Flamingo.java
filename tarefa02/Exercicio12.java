package tarefa02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler as dimens�es de um circulo (raio),
		 *  calcular e escrever a �rea do circulo. a=pi*r�*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo");
		
		double raio=sc.nextDouble();
		
		double pi= Math.PI;
		
		double area=pi*raio*raio;
		
		System.out.println("O valor da area do circulo �: " +area);
		sc.close();	
	}
}
		