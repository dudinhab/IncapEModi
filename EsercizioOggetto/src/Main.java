/*
Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la targa dell'auto:");
        String targa = scanner.nextLine();
        System.out.println("Inserisci la marca dell'auto:");
        String marca = scanner.nextLine();
        System.out.println("Inserisci il modello dell'auto:");
        String modello = scanner.nextLine();
        System.out.println("Inserisci la cilindrata dell'auto:");
        double cilindrata = scanner.nextFloat();

        //Inserindo i dati traverso il metodo costruttore
        Auto auto = new Auto(targa, marca, modello, cilindrata);

        //Visualizzazione dei dati inserendo tramite metodi get della Classe
        System.out.println("È inserito i dati dell'auto!");
        System.out.println("Targa: " + auto.getTarga() + " - Marca: " + auto.getMarca() + " - Modello: " + auto.getModello() + " - Cilindrata: " + auto.getCilindrata());

    }
}
