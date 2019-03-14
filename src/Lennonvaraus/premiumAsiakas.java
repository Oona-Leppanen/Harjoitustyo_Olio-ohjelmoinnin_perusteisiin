package Lennonvaraus;

/*
 * Asiakkaan perivä luokka, jolla on alennettu hinta
 */
public class premiumAsiakas extends Asiakas{
	
	public premiumAsiakas() {
		super();
		this.hinta=80.0;
	}
	
	public premiumAsiakas(String etunimi, String sukunimi, String hetu, String sposti, String puh) {
		super(etunimi, sukunimi, hetu, sposti, puh);
		this.hinta=80.0;
	}
	public void pHinta() {
		System.out.println("Lipun hinta on " + hinta + "€.");
	}
}
