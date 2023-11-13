package es36;

public class Rettangolo implements Forma {
    private float base;
    private float altezza;

    public Rettangolo (float base, float altezza) {
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
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
