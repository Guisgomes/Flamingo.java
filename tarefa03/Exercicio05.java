package tarefa03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
		 * A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("digite a temperatura em graus celsius");
	float grausCelsius = sc.nextFloat();
	float grausFahrenheit = (9*grausCelsius+ 160)/5;
	System.out.println("a temperatura em graus Fahrenheit corresponde a: "+grausFahrenheit);
	sc.close();
	}
}
