package tarefa03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o salário mensal atual de um funcionário
		 *  e o percentual de reajuste. Calcular e escrever o valor do novo salário.*/
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite o salario mensal atual do funcionario");
		float salarioatual=sc.nextFloat();
		
		System.out.println("Digite o percentual do reajuste");
		float percentualReajuste=sc.nextFloat();
		
		float novoSalario = salarioatual/100*percentualReajuste+salarioatual;
		
		System.out.println("o novo salario corresponde a: " +novoSalario);
		sc.close();
	}

}
