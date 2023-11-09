package es34;

public class Main {
    public static void main(String[] args) {


        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(5, 2);
        Triangolo triangolo = new Triangolo(5,3);
        forma.calcoloArea();

        System.out.println("Rettangolo = " + rettangolo.calcoloArea());
        System.out.println("Triangolo = " + triangolo.calcoloArea());
    }
}