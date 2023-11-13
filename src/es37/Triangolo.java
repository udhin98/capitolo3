package es37;

public class Triangolo extends Forma {
    private float base;
    private float altezza;
    public Triangolo (float base, float altezza) {
        super(TipoForma.triangolo);
        this.base = base;
        this.altezza = altezza;

    }
    @Override
    public float calcoloArea() {
        float area = (base * altezza) / 2;
        return area;
    }

    @Override
    public String toString() {
        return super.toString()  + "{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
