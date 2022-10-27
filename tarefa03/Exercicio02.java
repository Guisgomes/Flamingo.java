package tarefa03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
		 *  Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.*/
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o numero total de eleitores");
		float totaleleitores=sc.nextFloat();
		System.out.println("Digite o numero de votos brancos");
		float votosbrancos =sc.nextFloat();
		System.out.println("Digite o numero de votos nulos");
		float votosnulos =sc.nextFloat();
		System.out.println("digite o numero de votos validos");
		float votosvalidos =sc.nextFloat();
		
		float porcentagemVotosBrancos=votosbrancos/totaleleitores*100;
		float porcentagemVotosNulos=votosnulos/totaleleitores*100;
		float porcentagemVotosValidos=votosvalidos/totaleleitores*100;
		
		System.out.println("Ae votos nulos corresponde a:" +porcentagemVotosNulos+"%");
		System.out.println("A p porcentagem de votos brancos corresponde a:" +porcentagemVotosBrancos+"%");
		System.out.println("A porcentagem dorcentagem de votos validos corresponde a:" +porcentagemVotosValidos+"%");
		sc.close();	
	}
}
