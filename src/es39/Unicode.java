package es39;

public class Unicode {
    private String stringa;
    private int indice;
    public Unicode (String stringa, int indice) {
        this.stringa = stringa;
        this.indice = indice;
    }

    public String carattere () {
    StringBuilder risultato = new StringBuilder();
    if (indice >= 0 && indice < stringa.length()) {
        char carattere = stringa.charAt(indice);
        int unicode = (int) carattere;
        risultato.append("Il carattere alla posizione ")
                .append(indice)
                .append(" nella stringa '")
                .append(stringa)
                .append("' è: \\u")
                .append(Integer.toHexString(unicode).toUpperCase());
    } else {
        risultato.append("Errore: Indice non valido");
    }
        return risultato.toString();
    }
    }


