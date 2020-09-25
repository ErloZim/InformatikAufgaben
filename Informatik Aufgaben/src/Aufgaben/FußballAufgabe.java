package Aufgaben;

import java.util.Scanner;

public class FußballAufgabe {

    public static void holen(int[] s){
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        switch(userName){
            case "1":
                s[0]++;
                break;
            case "2":
                s[1]++;
                break;
            case "3":
                s[2]++;
                break;
            case "4":
                s[3]++;
                break;
            case "5":
                s[4]++;
                break;
            case "6":
                s[5]++;
                break;
            case "7":
                s[6]++;
                break;
            case "8":
                s[7]++;
                break;
            case "9":
                s[8]++;
                break;
            case "10":
                s[9]++;
                break;
            case "stop":
                System.exit(1);
                break;
            default:
                System.out.println("Es gibt diesen Spieler nicht! Erneut versuchen...");
                holen(s);
                break;
        }
        System.out.println("Spieler 1: " + s[0]);
        System.out.println("Spieler 2: " + s[1]);
        System.out.println("Spieler 3: " + s[2]);
        System.out.println("Spieler 4: " + s[3]);
        System.out.println("Spieler 5: " + s[4]);
        System.out.println("Spieler 6: " + s[5]);
        System.out.println("Spieler 7: " + s[6]);
        System.out.println("Spieler 8: " + s[7]);
        System.out.println("Spieler 9: " + s[8]);
        System.out.println("Spieler 10: " + s[9]);
        System.out.println();
        System.out.println("Welcher Spieler hat gewonnen?");
        holen(s);

    }

    public static void main(String[] args){
        int[] Spieler = new int[10];
        System.out.println("Welcher Spieler hat gewonnen?");
        boolean restart;
        holen(Spieler);

    }
}
