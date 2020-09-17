package Aufgaben;

public class ArrayAufgabeHA {


    public static void main(String[] args) {
	// write your code here
	    int[] sieb = new int[1000];
	    sieb=start(sieb);
        //ausgabe(sieb);
        sieben(sieb);
    }

    public static void ausgabe(int[] s) {
        for (int i = 0; i < 1000; i++) {
            System.out.print(s[i]);
            System.out.print(" ");
        }
    }

    public static int[] start(int[] s) {
        for (int i = 0; i < 1000; i++) {
            s[i] = i + 1;
        }
        return s;
    }
    
    public static int[] sieben(int[] s) {
        for (int a = 1; a < 1000; a++) {
        	boolean Primzahl = true;
            for (int l = 1; l < 1000; l++) {
            		if (s[a] % s[l] == 0 && s[a] != s[l] && s[l] != 1 ) {
            			Primzahl = false;
            		}        		
            	}
            if (Primzahl == true) {
            	System.out.println(s[a]);
            }
        }
		return s;
    }


}
