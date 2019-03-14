package Lennonvaraus;

/*
 *Asiakas-luokan heittämä poikkeus, jos annetut tiedot eivät ole oikein 
 */
public class asiakasPoikkeus extends Exception{
	public asiakasPoikkeus(String d) {
		super(d);
	}
	
	public asiakasPoikkeus() {
		super();
	}
}
