package day01_02Veriables;

public class C03_veriables {

	public static void main(String[] args) {
		int sayi1= 10;
		int sayi2= 20;
		
		String sayi3= "10";
		String sayi4= "20";
		System.out.println(sayi1+sayi3);
		System.out.println(sayi3+sayi4);
		String harf1="A";
		char harf2='A';
		System.out.println(harf1+" "+harf2);
		
		//yukar�daki de�i�kenleri kullanarak 30A yazd�r�n
		System.out.println(sayi1+sayi2+harf1); //30A
		System.out.println(sayi1+sayi2+harf2);//char �zelli�i sebebiyle matematiksel i�lemlerde numeric de�eri al�r
		System.out.println(harf1+sayi1+sayi2);
		System.out.println(sayi1+harf1+sayi2);
		System.out.println((sayi1+sayi2)+harf1);
		System.out.println(harf1+(sayi1+sayi2));
	}

}
