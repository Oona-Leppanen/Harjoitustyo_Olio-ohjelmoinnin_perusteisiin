package Lennonvaraus;

/**
 * 
 * @author oonal
 *ongelma metodissa "puhelinnumero" korjattu
 *nyt pit�isi toimia
 */
public class henkil�tietojenTarkastus extends Asiakas{
	public henkil�tietojenTarkastus(String nimi, String hetu, String sposti, String puh, double hinta) {
		super(nimi, hetu, sposti, puh, hinta);
	}
	
	public boolean henkil�tunnus(String h) {
		String s="";
		s=h.substring(0, 6);
		if(s.length()==10 && (s.contains("-")==true || s.contains("A")==true)) {
			return true;
		}
		else {
			return false;
		}
	}
	//hetu: syntaika + -/A + 3*num + num/kirj.
	
	public boolean s�hk�postiosoite(String s) {
		if(s.contains("@")==true && s.length()>=5 && s.contains(".")==true) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean puhelinnumero(String p) {
		boolean x=false;
		for (int i=0; i<p.length(); i++) {
			for (int j=0; j<10; i++) {
				if(p.charAt(i)==j) {
					x=true;
				}
			}
		}
			return x;
	}
}