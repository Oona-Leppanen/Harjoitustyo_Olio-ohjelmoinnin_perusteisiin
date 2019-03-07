package Lennonvaraus;

import java.util.Scanner;
import java.util.Random;

/**
 * 
 * @author oonal
 *Kooste ongelmista/tehtävistä:
 * - Onko luokkamuuttuja pvm ok?
 * - viim. metodi (tallennus)
 * - Kutsu asikasta???
 * - päivämäärä-metodin if-lause ei toimi
 * 
 * Jos jaksaa/haluaa:
 * - ID
 * - kohteenvalinta-metodista voi luoda lähtöpaikalle ja määränpäälle omat luokat
 */

public class Katalogi {
	String lk1;
	String lk2;
	String lk3;
	String lk4;
	String lk5;;
	String pvm; //Onko pvm ok? Toimiiko näin? ks. alapuolella oleva konstruktori
	
	//luodaan uusi olio konstruktorin avulla (1. konstruktori)
	public Katalogi() {
		lk1="Helsinki-Vantaa";
		lk2="Turku";
		lk3="Jyväskylä";
		lk4="Oulu";
		lk5="Rovaniemi";
		pvm="";
	}
	//luodaan konstruktori (saa parametrit), jotta luokka voidaan periä
	public Katalogi(String lk1, String lk2, String lk3, String lk4, String lk5, String pvm) {
		this.lk1=lk1;
		this.lk2=lk2;
		this.lk3=lk3;
		this.lk4=lk4;
		this.lk5=lk5;
		this.pvm=pvm;
		
	}
/*
 * paikat ja pvm:t muuttujiksi; done
 * ehkä myös ID (samalla tavalla ja jos jaksaa)
 * esim. jos turku (2), tallenna samanlaiseen metodiin, joka viimeisenä asiakas-luokassa
 * (ks. ylempi rivi) metodin perusta luotu
 */
	private static Scanner sc=new Scanner(System.in);
	//Onko ok käyttää samaa Scanneria kaikissa kohdissa? Ilmeisesti.

	/**
	 * @author oonal
	 * @param args
	 * @throws KohdePoikkeus
	 *Kutsu Asiakasta
	 *Toimii muuten paitsi Pvm-metodin if-lause ja viim. metodi (koska ei valmis)
	 *(Ainakin pitäisi xd)
	 *
	 *Lisäsin konstrukstorit ja korjasin mahd. jtn virheitä
	 */
	
	public static void main(String[] args) throws KohdePoikkeus {
		Katalogi k = new Katalogi();
		//luodaan katalogi-olio ja viitataan sillä muihin metodeihin main-metodista
		System.out.println("Valitse lähtöpaikka:");
		k.Kohteenvalinta();
		k.Päivämäärä();
		k.Paikat();
		k.premiumAsiakkuus();
		k.annaLentokentätjaPvm();
	}

	/*
	 *Lähtöpaikalle ja määränpäälle vois olla omat metodit,
	 * jotta lähtöpaikkaa ei tarvitse valita uudestaan tulosteessa
	 */
		public void Kohteenvalinta() throws KohdePoikkeus{
			
		try {
			System.out.println("1. Helsinki-Vantaa");
			System.out.println("2. Turku");
			System.out.println("3. Jyväskylä");
			System.out.println("4. Oulu");
			System.out.println("5. Rovaniemi");
			int lp=sc.nextInt();
			
			System.out.println("Valitse määränpää:");
			System.out.println("1. Helsinki-Vantaa");
			System.out.println("2. Turku");
			System.out.println("3. Jyväskylä");
			System.out.println("4. Oulu");
			System.out.println("5. Rovaniemi");
			int mp=sc.nextInt();
	
			if (lp==mp) {
				throw new KohdePoikkeus();
			}
			if (lp<1 || lp>5 || mp>5 || mp<1) {
				throw new KohdePoikkeus();
			}
		}
		
		catch(KohdePoikkeus kp) {
			System.out.println("Valitse mahdollinen kohde!");
			Kohteenvalinta();
		}
		//Muista tallentaa valinnat jonnekin myöhempää käyttöä varten!
		}

		public void Päivämäärä(){
			System.out.println("Anna päivämäärä (muodossa PPKKVVVV):");
			String pvm=sc.next();
			 
			
			//Tallenna tämäkin syöte2
			 
			if (tarkastaaPvm(pvm)==false) {
				System.out.println("Virheellinen päivämäärä!");
				Päivämäärä();
			}
		}
		public void Paikat() {
			Random rnd=new Random();
			int kaikkiPaikat=rnd.nextInt(201);
			System.out.println("Paikkoja vapaana:" + kaikkiPaikat);
			System.out.println("Paikka varattu. Syötä tietosi.");
		}
		public void premiumAsiakkuus() {
			System.out.println("Oletko Premium-asiakas?");
			System.out.println("Vastaa 1, jos olet Premium-asiakas.	Vastaa 2, jos et ole.");
			sc.nextInt();
		}
		public String annaLentokentätjaPvm() {
			/*
			 * palauta tiedot pilkulla erotettuina
			 * scanner file nextline???
			 * lentotiedot!!!
			 */
		}
		
}
