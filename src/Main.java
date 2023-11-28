/*
Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato
calcolaArea() che stampi l'area della forma specifica.
Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano
un tipo che ne identifichi la Forma in maniera univoca usando una enum.
 */
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(8, 2);
        rettangolo.stampaDettagli();
        rettangolo.calcolaArea();

        Triangolo triangolo = new Triangolo(5, 6);
        triangolo.stampaDettagli();
        triangolo.calcolaArea();
    }
}