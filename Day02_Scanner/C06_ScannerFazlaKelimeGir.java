package Day02_Scanner;

import java.util.Scanner;

public class C06_ScannerFazlaKelimeGir {

	public static void main(String[] args) {
		/* Scanner i�leminde String i�in 2 method vard�r.
		  scan.next denildi�inde sadece bir kelime al�r 
		  2. kelimeyi almaz 
		  e�er kullan�c�dan daha fazla kelime gelme ihtimali varsa
		  scan.nexLine() kullanmal�y�z.
		  		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen �sminizi Giriniz : ");
		String isim=scan.nextLine();
		
		System.out.println("Soyisim L�tfen :");
		String soyisim=scan.nextLine();
		
		System.out.println("girilen �sim :"+ isim +" "+soyisim);
		
	}

}
