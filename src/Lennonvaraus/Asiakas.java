package Lennonvaraus;

import java.util.Scanner;

/**
 * 
 * @author oonal
 * Kooste ongelmista/teht�vist�:
 * - tiedot-metodi (korjattu!)
 * - k�sittele falset
 * - annaTiedot-metodi kesken
 * - lento-luokka ja sinne lento-olio, joka saa anna*-metodeihin (katalogi, asiakas) tallennetut olioiden arvot?
 * 
 *Olio-ongelmista p��sty eroon kiitos viim. tutoriaalin
 */
public class Asiakas {
	private static Scanner sc=new Scanner(System.in);
	String nimi;
	String hetu;
	String sposti;
	String puh;
	double hinta=100.0;
	
	//luodaan uusi olio konstruktorin avulla (1. konstruktori)
	public Asiakas() {
		nimi="";
		hetu="";
		sposti="";
		puh="";
		hinta=100.0;
	}
	//luodaan konstruktori (saa parametrit), jotta luokka voidaan peri�
	public Asiakas(String nimi, String hetu, String sposti, String puh, double hinta) {
		this.nimi=nimi;
		this.hetu=hetu;
		this.sposti=sposti;
		this.puh=puh;
		this.hinta=100.0;
	}
	/*
	 * main-metodeita vain yksi; done
	 * Jotta voisi kirjoittaa esim. "((henkil�tietojenTarkastus)hetu).henkil�tunnus(h);",
	 * "hetun" tulisi olla olio
	 */
	
	public void tiedot() {
		Asiakas a=new Asiakas();
		System.out.println("Anna nimesi:");
		sc.nextLine();
		System.out.println("Anna henkil�tunnuksesi:");
		String h = sc.nextLine();
		((henkil�tietojenTarkastus)a).henkil�tunnus(h);
		System.out.println("Anna s�hk�postiosoitteesi:");
		String s = sc.nextLine();
		((henkil�tietojenTarkastus)a).s�hk�postiosoite(s);
		System.out.println("Anna puhelinumerosi:");
		String p = sc.nextLine();
		//voi tarvita instanceofia! ks. tutoriaalit
		((henkil�tietojenTarkastus)a).puhelinnumero(p);
		//luottokorttin p�tevyys kuuluu tunnistautumispalveluille, ei meille
		System.out.println("Tiedot tallennettu onnistuneesti.");
		System.out.println("Vahvistetaan varaus.");
		System.out.println("Varaus suoritettu onnistuneesti.");
	}
	/*k�sittele falset
	 * lentoasiakas
	 * lennon ID
	 * 1. tulosta asiakkaalle "kaikki ok"; done
	 * 3. -||- varaus vahvistettu; done
	 * 2. -||- siirret��n varaukseen; done
	 */
	
	public String annaTiedot() {
		/*
		 * palauta tiedot pilkulla erotettuina
		 * scanner file nextline???
		 * lentotiedot!!!
		 * sama my�s katalogiin
		 */
	}
}
