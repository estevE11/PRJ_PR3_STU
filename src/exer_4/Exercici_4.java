package exer_4;

import java.util.*;

public class Exercici_4 {
	
	private static char [] alfabet = {'a', 'b', 'c', 'd', 'e', 'f'};
	private static Random alea = new Random();
	
	public static void main (String [] args) {
		
		String mot, ite, rec;
		
		System.out.println();
		for (int i=1; i<10000; i++) {
			mot = genCadena(alea.nextInt(21));
			ite = torturaIte(mot);
			rec = tortura(mot);
			if (!ite.equals(rec)) {
				System.out.println("Discrep�ncia detectada");
				System.out.println("per al mot: "+mot);
				System.out.println("la versi� recursiva ha generat: "+rec);
				System.out.println("la versi� iterativa ha generat: "+ite);
				System.out.println("CAL REVISAR EL CODI GENERAT");
				System.exit(1);
			}
		}
		
		System.out.println("Prova finalitza sense haver detectat discrep�ncies");
		System.out.println("entre les versions iterativa i recursiva.");
		System.out.println("Per� aix� no vol dir ...");
		
	}
	
	// Funci� fa�ana (llan�adora) 
	public static String tortura (String s) {
		// escriure aqu� la invocaci� inicial del funci� recursiva de "tortura"
		return "";
	}
	
	// escriure aqu� la funci� RECURSIVA de tortura
	
	public static String torturaIte (String s) {
		// escriure aqu� el cos de la versi� iterativa de la funci� de "tortura"
		return "";
	}
	
	public static String genCadena (int n) {
		// escriure aqu� el cos de la funci� RECURSIVA que genera 
		// cadenes de car�cters de mida n
		return "";
	}
	
	

}
