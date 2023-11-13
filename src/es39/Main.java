package es39;

public class Main {
    public static void main(String[] args) {
        Unicode unicode = new Unicode("Ciao", 3);
        String risultato = unicode.carattere();
        System.out.println(risultato);
    }
}
