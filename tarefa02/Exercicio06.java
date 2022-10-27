package tarefa02;

import java.util.Scanner;

public class Exercicio06 {
	
	/*Digitar um valor e fazer a divisão dos numeros*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float num1=sc.nextFloat();
		float num2=sc.nextFloat();
		float Resultado=num1/num2;
		
		System.out.println("O resulrado dos valores é: " +Resultado);
		sc.close();
	}

}
