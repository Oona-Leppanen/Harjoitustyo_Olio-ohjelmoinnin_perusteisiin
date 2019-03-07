package Lennonvaraus;

/**
 * @author oonal
 *korjasin konstruktorin pienet vierheet -> toimii nyt
 */
public class premiumAsiakas extends Asiakas {
	double phinta;
	public premiumAsiakas(String nimi, String hetu, String sposti, String puh, double hinta, double phinta) {
		super(nimi, hetu, sposti, puh, hinta);
		this.phinta=80.0;
	}
}
