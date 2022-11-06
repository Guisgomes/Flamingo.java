package tarefa10;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anterior = 0;
		int atual = 1;
		
		int proximo = 0;

		for(int i=0; i<15; i++){
			if(i==0){
			    System.out.println("1");
			   } else{
			    System.out.println(""+atual);
			  }
			
			proximo = anterior+atual;
			anterior = atual;		   
		    atual = proximo;		   
		}
	}

}
