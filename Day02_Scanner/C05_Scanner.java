package Day02_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		 
		/*Kullan�c�dan isim ve soyismini ayr� isteyip
		 girilen isme a�a��daki gibi yazd�r�n�z
		 Girilen isim :Mustafa �ENEL
		 */
		
		Scanner scan=new Scanner(System.in);
		
			System.out.println("L�tfen �sminizi Giriniz : ");
			String isim=scan.next();
			
			System.out.println("Soyisim L�tfen :");
			String soyisim=scan.next();
			
			System.out.println("girilen �sim :"+ isim +" "+soyisim);
		
	}

}
