package Lennonvaraus;

/**
 * 
 * @author oonal
 * Kooste ongelmista:
 * - muutama if-lause valittaa equals() out of range
 */
public class pvmTarkistus extends Katalogi{
	public pvmTarkistus() {
		super();
	}
		public boolean tarkastaaPvm(String pvm) {
			String s="";
			s=pvm.substring(4, 8);
			if(s.equals(2019)==true) {
				return true;
			}
			if (s.equals(2020)==true) {
				return true;
			}
			else {
				return false;
			}
			
			String s2=pvm.substring(2, 4);
			String s3=pvm.substring(0, 2);
			if(s2.equals(01) || s2.equals(03) || s2.equals(05) || s2.equals(07) || s2.equals(08) || s2.equals(10) || s2.equals(12)) {
				if (Integer.parseInt(s3)>0 && Integer.parseInt(s3)<32){
					return true;
				}
				else {
					return false;
				}
				}
			else {
				return false;
			}
		
		if(s2.equals(04) || s2.equals(06) || s2.equals(09) || s2.equals(11)) {
			if (Integer.parseInt(s3)>0 && Integer.parseInt(s3)<31){
				return true;
			}
			else {
				return false;
			}
			}
		else {
			return false;
		}
		if(s.equals(02)) {
			if (Integer.parseInt(s3)>0 && Integer.parseInt(s3)<29){
				return true;
			}
			else {
				return false;
			}
			}
		else {
			return false;
		}
	}
}
