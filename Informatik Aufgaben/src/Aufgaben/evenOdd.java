package Aufgaben;

public class evenOdd {

    public static void even(int i) {
        if (i % 2 == 0){
            System.out.println(i + " ist gerade!");
        }
        else {
            System.out.println("false");
        }
    }

    public static void odd(int i) {
        if (i % 2 != 0){
            System.out.println(i + " ist ungerade!");
        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args){
        even(188);
        odd(60);
    }
}
