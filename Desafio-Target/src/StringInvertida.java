import java.util.Scanner;

public class StringInvertida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Desafio";
	      char[] c = s.toCharArray();
	      char aux;
	      int primeirostr=0;
	      int ultimostr = c.length-1;
	      while(primeirostr < ultimostr) {
	    	  aux = c[primeirostr];
	    	  c[primeirostr] = c[ultimostr];
	    	  c[ultimostr] = aux;
	    	  primeirostr++;
	    	  ultimostr--;
	      }
	      s = new String(c);
	      System.out.println(s);

	}

}
