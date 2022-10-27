package tarefa03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
		 *  escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite o valor do custo de fabricação do automovel");
		float custoAutomovel=sc.nextFloat();
		
		float valorTotalCarro = custoAutomovel *28/100 +custoAutomovel*45/100+custoAutomovel;
		
		System.out.println("o valor total do carro com imposyo mais distribuidor é: " +valorTotalCarro);
		sc.close();		
	}
}
