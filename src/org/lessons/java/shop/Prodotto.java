/* Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti 
 * dello shop.
Un prodotto è caratterizzato da: 
- codice (numero intero) 
- nome 
- descrizione 
- prezzo 
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi 
getter e setter ed eventuali altri metodi di “utilità” per fare in modo che: 
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random 
- il codice prodotto sia accessibile solo in lettura 
- gli altri attributi siano accessibili sia in lettura che in scrittura 
- il prodotto esponga un metodo per avere il prezzo base 
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva 
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando 
codice-nome. 
Nello stesso package aggiungete una classe Main con 
metodo main nella quale testate tutte le funzionalità della classe Prodotto. */

package org.lessons.java.shop; 
import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private static final int IVA = 22;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getCodice() {
		return codice;
	}
	public static int getIva() {
		return IVA;
	}
	
	public Prodotto(String nome, String descrizione, double prezzo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.codice = random.nextInt(20);
		
	}
	// generaro il codice con numero random
	Random random = new Random();
		
	// metodo per calcolare il prezzo base
	public double prezzoBase() {
		return prezzo;
	}
	
	// metodo per calcolare il prezzo con l'iva
	public double prezzoConIva() {
		return this.prezzo + (this.prezzo * IVA / 100);
	}
	
	// metodo per avere il nome esteso, ottenuto concatenando codice e nome
	public String nomeEsteso() {
		return this.codice + "-" + this.nome;
	}
}

