package Listeler;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<musteri> mlist = new ArrayList<musteri>();

		musteri m1 = new musteri();
		
		m1.setAd("Ali");
		m1.setSoyad("Soyad");
		m1.setTelefon("0 222 333 2244");
		
		mlist.add(m1);
		
		musteri m2 = new musteri();
		m2.setAd("Musteri2");
		m2.setSoyad("MüþteriSoyad");
		m2.setTelefon("0 333 255 6655");

		mlist.add(m2);
		
		//System.out.println(mlist.get(0).getAd());
		
		for (musteri item : mlist) {
			System.out.println("********************");
			System.out.println("Müþteri Adý.....:"+item.getAd());
			System.out.println("Müþteri Soyadý.....:"+item.getSoyad());
			System.out.println("Müþteri Telefonu.....:"+item.getTelefon());
			System.out.println();
			
		}
		
	}

}










