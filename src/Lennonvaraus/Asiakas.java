package Lennonvaraus;

import java.util.Scanner;

/**
 * 
 * @author oonal
 * Kooste ongelmista/tehtävistä:
 * - tiedot-metodi (korjattu!)
 * - käsittele falset
 * - annaTiedot-metodi kesken
 * - lento-luokka ja sinne lento-olio, joka saa anna*-metodeihin (katalogi, asiakas) tallennetut olioiden arvot?
 * 
 *Olio-ongelmista päästy eroon kiitos viim. tutoriaalin
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
	//luodaan konstruktori (saa parametrit), jotta luokka voidaan periä
	public Asiakas(String nimi, String hetu, String sposti, String puh, double hinta) {
		this.nimi=nimi;
		this.hetu=hetu;
		this.sposti=sposti;
		this.puh=puh;
		this.hinta=100.0;
	}
	/*
	 * main-metodeita vain yksi; done
	 * Jotta voisi kirjoittaa esim. "((henkilötietojenTarkastus)hetu).henkilötunnus(h);",
	 * "hetun" tulisi olla olio
	 */
	
	public void tiedot() {
		Asiakas a=new Asiakas();
		System.out.println("Anna nimesi:");
		sc.nextLine();
		System.out.println("Anna henkilötunnuksesi:");
		String h = sc.nextLine();
		((henkilötietojenTarkastus)a).henkilötunnus(h);
		System.out.println("Anna sähköpostiosoitteesi:");
		String s = sc.nextLine();
		((henkilötietojenTarkastus)a).sähköpostiosoite(s);
		System.out.println("Anna puhelinumerosi:");
		String p = sc.nextLine();
		//voi tarvita instanceofia! ks. tutoriaalit
		((henkilötietojenTarkastus)a).puhelinnumero(p);
		//luottokorttin pätevyys kuuluu tunnistautumispalveluille, ei meille
		System.out.println("Tiedot tallennettu onnistuneesti.");
		System.out.println("Vahvistetaan varaus.");
		System.out.println("Varaus suoritettu onnistuneesti.");
	}
	/*käsittele falset
	 * lentoasiakas
	 * lennon ID
	 * 1. tulosta asiakkaalle "kaikki ok"; done
	 * 3. -||- varaus vahvistettu; done
	 * 2. -||- siirretään varaukseen; done
	 */
	
	public String annaTiedot() {
		/*
		 * palauta tiedot pilkulla erotettuina
		 * scanner file nextline???
		 * lentotiedot!!!
		 * sama myös katalogiin
		 */
	}
}
