public abstract class Forma {
    FormeBidimensionali formaBidimensionale;

    public Forma(FormeBidimensionali formaBidimensionale){
        this.formaBidimensionale = formaBidimensionale;
    }

    public void calcolaArea(){
        System.out.println("Area = ");
    }
    abstract void stampaDettagli();
}
