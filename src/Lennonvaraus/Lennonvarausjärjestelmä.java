package Lennonvaraus;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Ongelmat:
 * premium-asiakas (perintä)
 * (git)
 * 
 * tallentaa tulosteeseen, vaikka tuloste ei näy eclipsessä (löytyy tietokoneelta)
 */

public class Lennonvarausjärjestelmä {
	static ArrayList<Varaus> varaukset;

	public static void main(String[] args) throws KohdePoikkeus, asiakasPoikkeus, IOException {
		
		varaukset=uusiTaiVanha();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("Valitse, mitä haluat tehdä.");
		System.out.println("1: Tee uusi varaus.");
		System.out.println("2: Näytä aiemmat varaukset.");
		System.out.println("3: Lopeta ohjelma.");

		int valinta = Integer.parseInt(sc.nextLine());
		
			if (valinta==1) {
				Katalogi l=new Katalogi();
				Asiakas o=new Asiakas();
				
				l.Kohteenvalinta();
				l.Päivämäärä();
				l.Paikat();
				l.LentokentätjaPvm();
				o.alkuTiedot();
				o.tiedot();
				
				Varaus v=new Varaus(l, o);
				
				varaukset.add(v);
				tallennaVaraukset(varaukset);
				
				//sitten kun tiedot onnistuneesti tallennettu
				System.out.println("Varaus suoritettu onnistuneesti.");
				
			}
			if (valinta==2) {
				Scanner read=new Scanner(new File("tuloste.txt"));
				while (read.hasNext()) {
					String str = read.nextLine();
					System.out.println(str);
				}
				read.close();
				
				//varauksen tulostus
				
			}
			if (valinta==3) {
				tallennaVaraukset(varaukset);
				System.out.println("Kiitos käynnistä ja tervetuloa uudelleen.");
				break;
			}
		}
	}
		private static ArrayList<Varaus> uusiTaiVanha(){
			File f = new File("tuloste.txt");
			
			if (!f.exists()) {
				return new ArrayList<Varaus>();
			}
			ArrayList<Varaus> varaukset=new ArrayList<Varaus>();
			try {
				Scanner sc1=new Scanner(f);
				
				while (sc1.hasNextLine()) {
					String varaus=sc1.nextLine();
					String[] s=varaus.split("#");
				}
				sc1.close();
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
			return varaukset;
		}
		private static void tallennaVaraukset(ArrayList<Varaus> varaukset2) {
			File f=new File("tuloste.txt");//viitataan tiedostoon, tiedosto ja ohjelma samassa kansiossa
			
			try {
				FileWriter fw=new FileWriter(f);//kirjoitetaan tiedostoon
				
				for (Varaus v: varaukset2) {
					fw.write(v.toString()+"\n");//"\n"=rivinvaihto
				}
				fw.flush();//varmistaa, että tieto on tallennettu levylle
				fw.close();//sulkee filewriterin
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
}
