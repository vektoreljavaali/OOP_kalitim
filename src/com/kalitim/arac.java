package com.kalitim;


public class arac {

	// arac�n �zellikleri -> De�i�kenler
	public String renk;
	public int tekerleksayisi;
	public String direksiyontipi;
	public int koltuksay�s�;
	public String aracindurumu="Ara� Duruyor";
	
	// arac�n i�levleri -> Methodlar
	public void ilerigit() {
		aracindurumu="Ara� �leri Gidiyor";
		
	}
	
	public void gerigit() {
		aracindurumu="Ara� Geri Gidiyor";
	}
	
	public void frenyap()  {
		aracindurumu ="Ara� Duruyor";		
	}
	
	
}
