package tarefa10;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int base, expoente, calculo=1;
        System.out.println("Informe a base:");
        base = sc.nextInt();
        System.out.println("Informe o expoente:");
        expoente = sc.nextInt();
        while(expoente!=0) {
            calculo=base*calculo;
            expoente--;
        }
        System.out.println(calculo);
        sc.close();

	}

}
