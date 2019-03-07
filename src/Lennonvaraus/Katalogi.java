package Lennonvaraus;

import java.util.Scanner;
import java.util.Random;

/**
 * 
 * @author oonal
 *Kooste ongelmista/teht�vist�:
 * - Onko luokkamuuttuja pvm ok?
 * - viim. metodi (tallennus)
 * - Kutsu asikasta???
 * - p�iv�m��r�-metodin if-lause ei toimi
 * 
 * Jos jaksaa/haluaa:
 * - ID
 * - kohteenvalinta-metodista voi luoda l�ht�paikalle ja m��r�np��lle omat luokat
 */

public class Katalogi {
	String lk1;
	String lk2;
	String lk3;
	String lk4;
	String lk5;;
	String pvm; //Onko pvm ok? Toimiiko n�in? ks. alapuolella oleva konstruktori
	
	//luodaan uusi olio konstruktorin avulla (1. konstruktori)
	public Katalogi() {
		lk1="Helsinki-Vantaa";
		lk2="Turku";
		lk3="Jyv�skyl�";
		lk4="Oulu";
		lk5="Rovaniemi";
		pvm="";
	}
	//luodaan konstruktori (saa parametrit), jotta luokka voidaan peri�
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
 * ehk� my�s ID (samalla tavalla ja jos jaksaa)
 * esim. jos turku (2), tallenna samanlaiseen metodiin, joka viimeisen� asiakas-luokassa
 * (ks. ylempi rivi) metodin perusta luotu
 */
	private static Scanner sc=new Scanner(System.in);
	//Onko ok k�ytt�� samaa Scanneria kaikissa kohdissa? Ilmeisesti.

	/**
	 * @author oonal
	 * @param args
	 * @throws KohdePoikkeus
	 *Kutsu Asiakasta
	 *Toimii muuten paitsi Pvm-metodin if-lause ja viim. metodi (koska ei valmis)
	 *(Ainakin pit�isi xd)
	 *
	 *Lis�sin konstrukstorit ja korjasin mahd. jtn virheit�
	 */
	
	public static void main(String[] args) throws KohdePoikkeus {
		Katalogi k = new Katalogi();
		//luodaan katalogi-olio ja viitataan sill� muihin metodeihin main-metodista
		System.out.println("Valitse l�ht�paikka:");
		k.Kohteenvalinta();
		k.P�iv�m��r�();
		k.Paikat();
		k.premiumAsiakkuus();
		k.annaLentokent�tjaPvm();
	}

	/*
	 *L�ht�paikalle ja m��r�np��lle vois olla omat metodit,
	 * jotta l�ht�paikkaa ei tarvitse valita uudestaan tulosteessa
	 */
		public void Kohteenvalinta() throws KohdePoikkeus{
			
		try {
			System.out.println("1. Helsinki-Vantaa");
			System.out.println("2. Turku");
			System.out.println("3. Jyv�skyl�");
			System.out.println("4. Oulu");
			System.out.println("5. Rovaniemi");
			int lp=sc.nextInt();
			
			System.out.println("Valitse m��r�np��:");
			System.out.println("1. Helsinki-Vantaa");
			System.out.println("2. Turku");
			System.out.println("3. Jyv�skyl�");
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
		//Muista tallentaa valinnat jonnekin my�hemp�� k�ytt�� varten!
		}

		public void P�iv�m��r�(){
			System.out.println("Anna p�iv�m��r� (muodossa PPKKVVVV):");
			String pvm=sc.next();
			 
			
			//Tallenna t�m�kin sy�te2
			 
			if (tarkastaaPvm(pvm)==false) {
				System.out.println("Virheellinen p�iv�m��r�!");
				P�iv�m��r�();
			}
		}
		public void Paikat() {
			Random rnd=new Random();
			int kaikkiPaikat=rnd.nextInt(201);
			System.out.println("Paikkoja vapaana:" + kaikkiPaikat);
			System.out.println("Paikka varattu. Sy�t� tietosi.");
		}
		public void premiumAsiakkuus() {
			System.out.println("Oletko Premium-asiakas?");
			System.out.println("Vastaa 1, jos olet Premium-asiakas.	Vastaa 2, jos et ole.");
			sc.nextInt();
		}
		public String annaLentokent�tjaPvm() {
			/*
			 * palauta tiedot pilkulla erotettuina
			 * scanner file nextline???
			 * lentotiedot!!!
			 */
		}
		
}
