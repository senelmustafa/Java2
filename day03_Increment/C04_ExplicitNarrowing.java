package day03_Increment;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		int sayi1=300;
		
		short sayi2= (short) sayi1 ;
		//hatay� gidermek i�in b�y�k data t�r�ndeki de�erin �n�ne onay�m�z� alarak (short) yaz�l�r
		System.out.println(sayi2);
		
		byte sayi3= (byte) sayi2;
		System.out.println(sayi3);
//de�er byte s�n�rlar�ndan b�t�k oldu�u i�in java 300 � kendi y�ntemine g�re byte d�n��t�r�r.
		double sayi4=87.3;
		int sayi5= (int) sayi4;
		
		System.out.println(sayi5);
		
		//de�er , oldu�undan int 'da ondal�kl� olmad���ndan java onadal�kl� k�sm� keser.
		//bundan dolay� data kayb� olu�ur.
		
		int sayi6=27;
		int sayi7=4;
		
		System.out.println(sayi6/sayi7);
		//b�lme i�lemi yap�lan i�lemin ikiside int oldu�u i�in sonucuda int kabul eder.

		double sayi8=4;
		double sayi9=17;
		System.out.println(sayi8/sayi9);//6,75 i�lem yap�lan say�lardan daha genl turune sahip oldupundan double olur sonu�ta
	
		
		
	}

}
