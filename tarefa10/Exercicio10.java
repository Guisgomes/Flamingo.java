package tarefa10;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Graus Celsius");
		float graus = sc.nextFloat();
		for (float contador = (9*graus+160)/5; contador<=100; contador+=10){
			System.out.println(" A temperatura em Fahrenheit é "+contador);
			sc.close();			
		}

	}

}
