package tarefa10;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entrada;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = sc.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
            sc.close();
        }
	}

}
