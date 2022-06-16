package exer_3;

import java.util.Random;

public class Exercici_3 {
	private static Random alea = new Random();

	public static void main (String [] args) {
		/* Escriviu aquí el vostre codi de prova. Genereu parelles de
		 * vectors i utilitzeu la vostra funció per dterminar si l'un 
		 * és la versió girada de l'altre o no. Vegeu l'enunciat 
		 * de la pràctica */
		int n = 10;
		boolean correct = true;
		for(int i = 0; i < n; i++) {
			boolean reversed = alea.nextBoolean();
			VectorPair pair = new VectorPair(reversed);
			boolean res = checkReversed(pair, 0);
			if(res != reversed) correct = false;
		}
		System.out.println(correct ? "Correctes" : "Errors");
	}
	
	/* ESCRIVIU AQUÍ LA VOSTRA FUNCIÓ DE VERIFICACIÓ */
	public static boolean checkReversed(VectorPair pair, int n) {
		if(n == pair.one.length) return true;
		if(pair.one[n] == pair.two[pair.two.length-1-n]) {
			return checkReversed(pair, n+1);
		}
		return false;
	}
	
}


/* Classe d'utilitat per a generar parelles de vectors que poden sser
 * l'un la versió girada de l'altre o no, en funció del paràmetre del
 * constructor  */
class VectorPair {
	
	private static Random alea = new Random();
	
	public  int [] one;
	public int [] two;
	
	public VectorPair(boolean correctlyReversed) {
		this.one = this.randomIntVector(correctlyReversed ? alea.nextInt(10) : alea.nextInt(10)+1);
		this.two = this.reversed(this.one);
		if (!correctlyReversed) {
			this.two[alea.nextInt(this.two.length)]++;
		}
	}
	
	private static int[] reversed (int [] v) {
		int [] result = new int[v.length];
		for (int i=0; i<v.length; i++) {
			result[v.length-1-i]=v[i];
		}
		return result;
	}
	
	private static int[] randomIntVector (int length) {
		int [] result = new int[length];
		for (int i=0; i<length; i++) {
			result[i] = alea.nextInt(10);
		}
		return result;
	}
}
