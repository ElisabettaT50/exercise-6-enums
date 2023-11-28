public class Rettangolo extends Forma {
    int base;
    int altezza;
    public Rettangolo(int base, int altezza) {
        super(FormeBidimensionali.RETTANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea(){
        int area = base * altezza;
        System.out.println("Area rettangolo = " + area);
    }

    @Override
    void stampaDettagli() {
        System.out.println("base = " + base);
        System.out.println("altezza = " + altezza);
    }
}

