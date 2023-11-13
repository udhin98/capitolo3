package es38;

public class Main {
    public static void main(String[] args) {
    String numero1 = "ciao";

    String numero2 = "hello";

    System.out.println(confrontoStringhe(numero1,numero2));
    }

    public static String confrontoStringhe (String numero1, String numero2) {
        int confronto = numero1.compareTo(numero2);
        StringBuilder risultato = new StringBuilder("le stringhe sono: ");

        if (confronto == 0) {
            risultato.append("uguali");
        } else {
            risultato.append("diverse");
        }
        return risultato.toString();
    }
}
