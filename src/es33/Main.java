package es33;

public class Main {
    public static void main(String[] args) {


        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(5, 2);

        forma.calcoloArea();

        System.out.println("Rettangolo = " + rettangolo.calcoloArea());
    }
}