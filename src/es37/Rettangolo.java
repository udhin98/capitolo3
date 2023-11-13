package es37;

public class Rettangolo extends Forma {
    private float base;
    private float altezza;
    public Rettangolo (float base, float altezza) {
        super(TipoForma.rettangolo);
        this.base = base;
        this.altezza = altezza;

    }

    @Override
    public float calcoloArea() {
        float area = base * altezza;
        return area;

    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
