package exer_3;

import java.util.Random;

public class Exercici_3 {
	
	
	public static void main (String [] args) {
		/* Escriviu aqu� el vostre codi de prova. Genereu parelles de
		 * vectors i utilitzeu la vostra funci� per dterminar si l'un 
		 * �s la versi� girada de l'altre o no. Vegeu l'enunciat 
		 * de la pr�ctica */
	}
	
	/* ESCRIVIU AQU� LA VOSTRA FUNCI� DE VERIFICACI� */
	
}


/* Classe d'utilitat per a generar parelles de vectors que poden sser
 * l'un la versi� girada de l'altre o no, en funci� del par�metre del
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
