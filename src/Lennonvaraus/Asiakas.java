package Lennonvaraus;

import java.util.Scanner;

/*
 * Luodaan asiakas-luokka, jossa kerätään asiakkaan tiedot ja kerrotaan hinta asiakkaalle
 * Vääränlaiset tiedot heittävät poikkeuksen
 * Tallennetaan asiakkaan tiedot toStringiin
 */
public class Asiakas{
	private static Scanner sc=new Scanner(System.in);
	String etunimi;
	String sukunimi;
	String hetu;
	String sposti;
	String puh;
	double hinta;
	
	//luodaan uusi olio konstruktorin avulla (1. konstruktori)
	public Asiakas() {
		etunimi="";
		sukunimi="";
		hetu="";
		sposti="";
		puh="";
		hinta=100.0;
	}
	//luodaan konstruktori (saa parametrit), jotta luokka voidaan periä
	public Asiakas(String etunimi, String sukunimi, String hetu, String sposti, String puh) {
		this.etunimi=etunimi;
		this.sukunimi=sukunimi;
		this.hetu=hetu;
		this.sposti=sposti;
		this.puh=puh;
		this.hinta=100.0;
	}

	
	public void alkuTiedot(){
		System.out.println("Oletko Premium-asiakas?");
		System.out.println("Vastaa 1, jos olet Premium-asiakas.	Vastaa 2, jos et ole.");
		int pas=sc.nextInt();
		if (pas==1) {
			premiumAsiakas pa=new premiumAsiakas();
			((premiumAsiakas)pa).pHinta();
		}
		if (pas==2) {
			Hinta();
		}
	}
	/*
	 * ei toimi premiumasiakkaalla
	 * toimii normiasiakkaalla
	 */
	public void tiedot() throws asiakasPoikkeus {
		Asiakas b=new henkilötietojenTarkastus();
		
		try {
		System.out.println("Anna etunimesi:");
		etunimi = sc.next();
		System.out.println("Anna sukunimesi:");
		sukunimi=sc.next();
		System.out.println("Anna henkilötunnuksesi:");
		hetu = sc.next();
		if (((henkilötietojenTarkastus)b).henkilötunnus(hetu)==false) {
			throw new asiakasPoikkeus();
		}
		
		System.out.println("Anna sähköpostiosoitteesi:");
		sposti = sc.next();
		if (((henkilötietojenTarkastus)b).sähköpostiosoite(sposti)==false) {
			throw new asiakasPoikkeus();
		}
		System.out.println("Anna puhelinnumerosi (ilman maakoodia):");
		puh = sc.next();
		if (((henkilötietojenTarkastus)b).puhelinnumero(puh)==false) {
			throw new asiakasPoikkeus();
		}
		
		//luottokorttin pätevyys kuuluu tunnistautumispalveluille, ei meille
		System.out.println("Tiedot tallennettu onnistuneesti.");
		System.out.println("Vahvistetaan varaus.");
		}
		catch(asiakasPoikkeus ap){
			System.out.println("Viimeinen antamistasi tiedoista on virheellinen. Anna tiedot uudestaan.");
			tiedot();
		}
	}
	public void Hinta() {
		hinta=100.0;
		System.out.println("Lipun hinta on " + hinta + "€.");

	}
	
	/*public void pHinta() {
		*hinta=80.0;
		*System.out.println("Lipun hinta on " + hinta + "€.");
	}*/
	

	public String toString() {
		return etunimi+","+sukunimi+","+hetu+","+sposti+","+puh;

	}
}
