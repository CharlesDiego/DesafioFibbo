import java.io.IOException;
import java.util.Scanner;

public class Fibo{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        for ( int i=0; i<T; i++  ) {
        	int N = leitor.nextInt();
            long anterior = 0, atual = 1, proximo;
	        for (int a = 1; a<= N; a++   ) {
	            
	           proximo = atual;
	           atual = atual + anterior;
	           anterior = proximo;
	           
	    
	        	}
	        System.out.println("Fib("+ N +") = " + anterior);
	        }
        leitor.close();
        }
    }
	
