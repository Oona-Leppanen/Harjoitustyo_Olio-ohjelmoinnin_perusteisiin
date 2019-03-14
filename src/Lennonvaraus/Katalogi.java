package Lennonvaraus;

/*
 * Luokassa valitaan lähtöpaikka, määränpää ja haluttu matkustuspäivä
 * Annetaan lennolle ID
 */
import java.util.Random;
import java.util.Scanner;


public class Katalogi{
	String lk1;
	String lk2;
	String lk3;
	String lk4;
	String lk5;;
	int lpaikka;
	int mpaikka;
	String päiväys;
	private String paikka1;
	private String paikka2;
	private String ID;
	
	//luodaan uusi olio konstruktorin avulla (1. konstruktori)
	public Katalogi() {
		lk1="Helsinki-Vantaa";
		lk2="Turku";
		lk3="Jyväskylä";
		lk4="Oulu";
		lk5="Rovaniemi";
		lpaikka=0;
		mpaikka=0;
		paikka1="";
		paikka2="";
		päiväys="";
		ID="";
	}
	//luodaan konstruktori (saa parametrit), jotta luokka voidaan periä
	public Katalogi(String lk1, String lk2, String lk3, String lk4, String lk5, int lpaikka, int mpaikka, String paikka1, String paikka2, String päiväys, String ID) {
		this.lk1=lk1;
		this.lk2=lk2;
		this.lk3=lk3;
		this.lk4=lk4;
		this.lk5=lk5;
		this.lpaikka=lpaikka;
		this.mpaikka=mpaikka;
		this.paikka1=paikka1;
		this.paikka2=paikka2;
		this.päiväys=päiväys;
		this.ID=ID;
		
	}

	private  Scanner sc=new Scanner(System.in);

		public void Kohteenvalinta() throws KohdePoikkeus{
			
		try {
			System.out.println("Valitse lähtöpaikka:");
			System.out.println("1. Helsinki-Vantaa");
			System.out.println("2. Turku");
			System.out.println("3. Jyväskylä");
			System.out.println("4. Oulu");
			System.out.println("5. Rovaniemi");
			int lp=sc.nextInt();
			
			System.out.println("Valitse määränpää:");
			System.out.println("1. Helsinki-Vantaa");
			System.out.println("2. Turku");
			System.out.println("3. Jyväskylä");
			System.out.println("4. Oulu");
			System.out.println("5. Rovaniemi");
			int mp=sc.nextInt();
	
			if (lp==mp) {
				throw new KohdePoikkeus();
			}
			if (lp<1 || lp>5 || mp>5 || mp<1) {
				throw new KohdePoikkeus();
			}
			lpaikka=lp;
			mpaikka=mp;
		}
		
		catch(KohdePoikkeus kp) {
			System.out.println("Valitse mahdollinen kohde!");
			Kohteenvalinta();
		}
		}

		public void Päivämäärä(){
			System.out.println("Lentoja voi tällä hetkellä varata vain vuosille 2019 ja 2020.");
			System.out.println("Anna päivämäärä (muodossa PPKKVVVV):");
			päiväys=sc.next();
			 
			String s=päiväys.substring(4, 8);
			String s2=päiväys.substring(2, 4);
			String s3=päiväys.substring(0, 2);
			boolean x=false;
			if (päiväys.length()==8) {
				if(s.equals("2019")==true) {
					x=true;
				}else {
					if (s.equals("2020")==true) {
						x=true;
					}else {
						System.out.println("Virheellinen päivämäärä!");
						Päivämäärä();
					}
				}

				if(s2.equals("01") || s2.equals("03") || s2.equals("05") || s2.equals("07") || s2.equals("08") || s2.equals("10") || s2.equals("12")) {
					if (Integer.parseInt(s3)>0 && Integer.parseInt(s3)<32){
						x=true;
					}else {
						System.out.println("Virheellinen päivämäärä!");
						Päivämäärä();
					}
				}else {
					if(s2.equals("04") || s2.equals("06") || s2.equals("09") || s2.equals("11")) {
						if (Integer.parseInt(s3)>0 && Integer.parseInt(s3)<31){
							x=true;
						}else {
							System.out.println("Virheellinen päivämäärä!");
							Päivämäärä();
						}
					}else {
						if(s.equals("02")) {
							if (Integer.parseInt(s3)>0 && Integer.parseInt(s3)<29){
								x=true;
							}else {
								System.out.println("Virheellinen päivämäärä!");
								Päivämäärä();
							}
						}
					}
				}
			}else {
				System.out.println("Virheellinen päivämäärä!");
				Päivämäärä();
			}
		}

		public void Paikat() {
			Random rnd=new Random();
			int kaikkiPaikat=rnd.nextInt(201);
			System.out.println("Paikkoja vapaana:" + kaikkiPaikat);
			System.out.println("Paikka varattu. Syötä tietosi.");
		}
		
		public void LentokentätjaPvm() {
			
			String loppu="";
			String alku="FA";
			
			if (lpaikka==1) {
				paikka1=lk1;
			}
			if (lpaikka==2) {
				paikka1=lk2;
			}
			if (lpaikka==3) {
				paikka1=lk3;
			}
			if (lpaikka==4) {
				paikka1=lk4;
			}
			if (lpaikka==5) {
				paikka1=lk5;
			}
			
			if (mpaikka==1) {
				paikka2=lk1;
			}
			if(mpaikka==2) {
				paikka2=lk2;
			}
			if(mpaikka==3) {
				paikka2=lk3;
			}
			if(mpaikka==4) {
				paikka2=lk4;
			}
			if(mpaikka==5) {
				paikka2=lk5;
			}
			
			Random ran=new Random();
			int idNum=ran.nextInt((10000-3000)+1)+3000;
			loppu=String.valueOf(idNum);
			ID=alku+loppu;
			
		}
		public String toString() {
			return paikka1+","+paikka2+","+päiväys+","+ID;
		}
		
}
