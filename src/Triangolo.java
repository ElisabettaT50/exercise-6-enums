public class Triangolo extends Forma {
    int base;
    int altezza;
    public Triangolo (int base, int altezza){
        super (FormeBidimensionali.TRIANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int area = (base * altezza) / 2;
        System.out.println("Area triangolo = " + area);
    }

    @Override
    void stampaDettagli() {
        System.out.println("altezza = " + altezza);
        System.out.println("base = " + base);
    }
}