package day03_Increment;

public class C06_PreIncrementPostIncrment {

	public static void main(String[] args) {
		//PreIncrementPostIncrment sayi++ sayi-- i�in ge�erlidir
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi);

		
		System.out.println(sayi++);//13
		System.out.println(sayi);//16.sat�rda say�y� yazd�rd�ktan sonra 13 � 14 yapt�rd��� i�in
		//bizim say�m�z� 14 yapt�.
		
		
		System.out.println(++sayi);
	}

}
