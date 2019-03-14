package Lennonvaraus;

/*
 * Heitt‰‰ poikkeuksen, jos Katalogi-luokassa annetaan virheellinen tieto
 */
public class KohdePoikkeus extends Exception {
	public KohdePoikkeus(String k) {
		super(k);
	}
	
	public KohdePoikkeus() {
		super();
	}
}