import java.util.Scanner;

public class fibonnaciEOutrasQuestoes {

	public static void main(String[] args) {
		//Resposta da primeira quest�o � 91.
		
		
				// Exerc�cio Fibonacci.
				Scanner sc = new Scanner(System.in);
				int segundo = 1, primeiro = 0, proximo[] = new int[100], numero;
		        
		        numero = sc.nextInt();
		       for(int i=0; i<100; i++) {
		    	   primeiro = primeiro + segundo;
		    	   segundo = primeiro - segundo;
		    	   proximo[i] = primeiro;
		    	   if(numero != proximo[i]) {
		    		   System.out.println("Nao esta na sequencia.");
		    		   break;
		    	   }else {
		    		   System.out.println("Esta na sequencia.");
		    		   break;
		    	   }
		       }
		       
		       // Final do exerc�cio Fibonnaci.
		       
		       //Exerc�cio 3
		       
		      /* a) 1, 3, 5, 7, 9, 11, 13

		       b) 2, 4, 8, 16, 32, 64, 128, 256, 512

		       c) 0, 1, 4, 9, 16, 25, 36, 49, 64, 81 

		       d) 4, 16, 36, 64, 100, 144

		       e) 1, 1, 2, 3, 5, 8, 13, 21, 34

		       f) 2,10, 12, 16, 17, 18, 19, 20, 21
		       */
		       
		       //Exerc�cio 4
		       
		       //Os dois estar�o na mesma dist�ncia de ribeir�o, afinal, eles se cruzaram no mesmo ponto, ent�o, *SUPOSI��O*, se o carro se encontrou com o caminh�o faltando 20 km pra chegar em fran�a (ou seja, o carro andou 80 e o caminh�o andou 20), est� faltando 80km para o caminh�o chegar em Ribeir�o, como eles se CRUZARAM nesse ponto, faltam 80km pra ambos.
		       //Por favor ler essa linha de cima ^ inteira, explica��o da resposta ai.

	}

}
