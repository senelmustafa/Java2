package Day02_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		//kullan�c�dan de�er almak i�in 3 ad�m takip edilir
		//1. ad�m scanner objesi olu�turmak
		
		
		Scanner scan=new Scanner(System.in);
		
		//2. ad�m kullan�c�ya ne istedi�ini s�ylemek
		System.out.println("L�tfen �sminizi Yaz�n�z :");
		
		 String isim=scan.next();
		 System.out.println("isminiz : "+isim);
	
	//scan bir tarama objesidir
		 //isim olarak farkl� bir isim yazsak da �al���r  ama scan demeyi tercih etmek laz�m
		 //scan bir obje oldu�u i�in dat tr� non-primitive dir
		 //primitive data t�rleri sadece de�er i�erirken 
		 //->> non primitive data t�rkeri de�errin yan�nda method lar barindirir
		 //scan. dedi�imizde bu methodlar� kullanabiliriz.
		 
		 scan.close();
	}

}
