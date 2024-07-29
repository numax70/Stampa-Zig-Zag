/*
 * Scrivere un programma StampaZigZag che prevede un array di 10 numeri interi contenente valori a piacere  
(senza bisogno di chiederli all'utente) e ne stampa gli elementi secondo il seguente ordine: il primo, l'ultimo,  
il secondo, il penultimo, il terzo, il terz'ultimo, ecc... Il nome dell'array può essere scelto a piacere.  
(Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell'array).  
Infine testare il programma facendo scegliere all'utente dimensione e valori dell'array
 * */
import java.util.Scanner;
public class StampaZigZag {
	
	public static int[] inserisciArray() {
		int len = stringToInt("Inserisci lunghezza array");
		int[] array = new int[len];
		for(int i=0; i<array.length; i++) {
			array[i]=stringToInt("Inserisci " + (i+1) + " valore " );
			
		}
		return array;
		
		
	}
	
	public static int stringToInt(String testo) {
		boolean check;
		int number=0;
		do {
			check=true;
			Scanner input = new Scanner(System.in);
			System.out.print(testo + ": ");
			String a = input.nextLine();
			try {
				number=Integer.parseInt(a);
			}catch(Exception e) {
				check=false;
				System.out.println("Non hai inserito un intero");
				
			}
		}while(!check);
		return number;
	}
	
	public static void stampaArrayAlterno(int[] a) {
		int len = a.length/2;
		int number=a.length-1;
		for(int i=0; i<len; i++) {
			if(a.length%2!=0 && i==len-1) {//cioè per lunghezza dispari e che sia il primo valore
				System.out.println("[" + a[i] + ", " + a[number] + "]");
				System.out.println("[" + a[i+1]+"]");
				
			}else {
				System.out.println("[" + a[i] + ", " + a[number] + "]");
				number--;
			}
		}
	}
}
