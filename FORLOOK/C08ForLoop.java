package FORLOOK;

import java.util.Scanner;

public class C08ForLoop {

	public static void main(String[] args) {
//		Kullanicidan bir String isteyin ve Stringi tersine ceviren 
//		bir merhod yazin.
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersten yazdırmak için bir yazı  giriniz...");
		String str = scan.nextLine();

		System.out.print(tersineCevir(str));
				scan.close();
	}

	public static String tersineCevir(String str) {
		
		String tersStr="";
		for (int i = str.length()-1; i >=0; i--) {
			tersStr+=str.substring(i,i+1);
		}
		return tersStr;
		 
		
	}

}
