package tarefa04;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador
		 * e tamb�m o valor do percentual de reajuste (vari�vel PR) a ser atribu�do.
		 * Apresentar o valor do novo sal�rio (vari�vel NS).
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario mensal (R$)");
		float salario_Mensal=sc.nextFloat();
		System.out.println("Percentual de reajuste(EM%)");
		float percentual_De_Reajuste=sc.nextFloat();
		float novo_Salario=salario_Mensal+(percentual_De_Reajuste/100)*salario_Mensal;
		System.out.println("novo valor do salario �: "+novo_Salario+"R$");
		sc.close();
	}
}
