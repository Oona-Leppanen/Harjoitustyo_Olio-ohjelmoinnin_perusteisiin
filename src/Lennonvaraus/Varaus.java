package Lennonvaraus;

public class Varaus {
	
	Katalogi katalogi;
	Asiakas asiakas;
	
	public Varaus() {
		//ilman t�t� Lennonvarausj�rj.-luokassa yksi olio ongelmissa
	}
	
	public Varaus(Katalogi katalogi, Asiakas asiakas) {
		super();
		this.katalogi=katalogi;
		this.asiakas=asiakas;
	}

	public String toString(){
		return katalogi.toString() + "#" + asiakas.toString();
	}
	
}
