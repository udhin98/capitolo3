package es37;

enum TipoForma {
    rettangolo,
    triangolo
}
public class Forma {
    TipoForma tipo;
    public Forma (TipoForma tipo) {
        this.tipo = tipo;
    }


    public float calcoloArea() {
        System.out.println("Calcolo area della forma: ");
        return 0;
    }

    @Override
    public String toString() {
        return "Forma " + tipo;
    }
}
