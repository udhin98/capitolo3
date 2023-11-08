package es33;

public class Rettangolo extends Forma{
    private int base;
    private int altezza;

    public Rettangolo (int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcoloArea() {
        int area = base * altezza;
        return area;

    }
}
