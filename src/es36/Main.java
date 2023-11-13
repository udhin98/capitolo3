package es36;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5, 2);
        Triangolo triangolo = new Triangolo(5,3);


        System.out.println("Area Rettangolo = " + rettangolo.calcoloArea());
        System.out.println("Area Triangolo = " + triangolo.calcoloArea());
    }
}