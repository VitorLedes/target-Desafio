import java.util.Scanner;

public class fibonnaciEOutrasQuestoes {

	public static void main(String[] args) {
		//Resposta da primeira questão é 91.
		
		
				// Exercício Fibonacci.
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
		       
		       // Final do exercício Fibonnaci.
		       
		       //Exercício 3
		       
		      /* a) 1, 3, 5, 7, 9, 11, 13

		       b) 2, 4, 8, 16, 32, 64, 128, 256, 512

		       c) 0, 1, 4, 9, 16, 25, 36, 49, 64, 81 

		       d) 4, 16, 36, 64, 100, 144

		       e) 1, 1, 2, 3, 5, 8, 13, 21, 34

		       f) 2,10, 12, 16, 17, 18, 19, 20, 21
		       */
		       
		       //Exercício 4
		       
		       //Os dois estarão na mesma distância de ribeirão, afinal, eles se cruzaram no mesmo ponto, então, *SUPOSIÇÃO*, se o carro se encontrou com o caminhão faltando 20 km pra chegar em frança (ou seja, o carro andou 80 e o caminhão andou 20), está faltando 80km para o caminhão chegar em Ribeirão, como eles se CRUZARAM nesse ponto, faltam 80km pra ambos.
		       //Por favor ler essa linha de cima ^ inteira, explicação da resposta ai.

	}

}
