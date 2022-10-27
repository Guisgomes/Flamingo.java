package tarefa03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro.
		 *  Para obter o cálculo, o usuário deve fornecer o tempo gasto*/
		
		Scanner sc= new Scanner (System.in);
		
		float tempo, velocidade, kmPercorridos,
		litrosCombustivel;
		
		System.out.println("Digite o tempo de sua viagem");
		tempo=sc.nextFloat();
		
		System.out.println("Digite a velocidade media da sua viagem");
		velocidade=sc.nextFloat();
		
		kmPercorridos=tempo*velocidade;
		
		litrosCombustivel=kmPercorridos;
		
		System.out.printf("a quantidade de litros de gasolina que voce gastou é %.2f%n", litrosCombustivel);
		System.out.println("a quantidade de quilometros percorridos:" +kmPercorridos);
		System.out.println("a velocidade media:" +velocidade);
		System.out.println("tempo:" +tempo);
		sc.close();
	}
}
