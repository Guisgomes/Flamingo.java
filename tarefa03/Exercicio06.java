package tarefa03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9)
		 * , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit");
		int grausFahrenheit =sc.nextInt();
		int grausCelsius = (grausFahrenheit-32)*5/9;
		System.out.println("a temperatura em graus celsius corresponde a: "+grausCelsius);
		sc.close();
	}
}
