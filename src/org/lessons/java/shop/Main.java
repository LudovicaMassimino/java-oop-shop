/* Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che: - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random - il codice prodotto sia accessibile solo in lettura - gli altri attributi siano accessibili sia in lettura che in scrittura - il prodotto esponga un metodo per avere il prezzo base - il prodotto esponga un metodo per avere il prezzo comprensivo di iva - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto. */
package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto myProdotto = new Prodotto("Lampada", "Descrizione della lampada", 180.00);
		System.out.println("Nome del prodotto: " + myProdotto.getNome());
        System.out.println("Descrizione del prodotto: " + myProdotto.getDescrizione());
        System.out.println("Prezzo base: " + "€ " + myProdotto.getPrezzo());
        System.out.println("Prezzo compreso di IVA al 22%: " + "€ " + myProdotto.prezzoConIva());
        System.out.println("In nome esteso è: " + myProdotto.nomeEsteso());
	}

}
