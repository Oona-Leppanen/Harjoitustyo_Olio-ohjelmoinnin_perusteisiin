package Lennonvaraus;

/*
 *Asiakas-luokan heitt�m� poikkeus, jos annetut tiedot eiv�t ole oikein 
 */
public class asiakasPoikkeus extends Exception{
	public asiakasPoikkeus(String d) {
		super(d);
	}
	
	public asiakasPoikkeus() {
		super();
	}
}
