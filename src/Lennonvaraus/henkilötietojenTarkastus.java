package Lennonvaraus;

/*
 * Käsitellään vääränlaiset asiakkaan antamat tiedot
 */

public class henkilötietojenTarkastus extends Asiakas{
	String s;
	public henkilötietojenTarkastus() {
		s="";
	}
	public henkilötietojenTarkastus(String etunimi, String sukunimi, String hetu, String sposti, String puh, double hinta, String s) {
		super(etunimi, sukunimi, hetu, sposti, puh, hinta);
		this.s=s;
	}

	public boolean henkilötunnus(String h) {
		if (h==null || h.length()<1) {
			return false;
		}
		s=h.substring(0, 11);
		if(s.length()==11 && (s.contains("-")==true || s.contains("A")==true)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sähköpostiosoite(String s) {
		if (s==null || s.length()<1) {
			return false;
		}
		if(s.contains("@")==true && s.length()>=5 && s.contains(".")==true) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean puhelinnumero(String p) {
		boolean x=false;
		if (p==null || p.length()<1) {
			x=false;
		}
		for (int i=0; i<p.length(); i++) {
				if(p.charAt(i)=='1' || p.charAt(i)=='2' || p.charAt(i)=='3' || p.charAt(i)=='4' || p.charAt(i)=='5' || p.charAt(i)=='6' || p.charAt(i)=='7' || p.charAt(i)=='8' || p.charAt(i)=='9') {
					x=true;
				}else {
					x=false;
				}
		}
			return x;
	}
}