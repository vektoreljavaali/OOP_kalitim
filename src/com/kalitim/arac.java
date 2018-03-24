package com.kalitim;


public class arac {

	// aracýn özellikleri -> Deðiþkenler
	public String renk;
	public int tekerleksayisi;
	public String direksiyontipi;
	public int koltuksayýsý;
	public String aracindurumu="Araç Duruyor";
	
	// aracýn iþlevleri -> Methodlar
	public void ilerigit() {
		aracindurumu="Araç Ýleri Gidiyor";
		
	}
	
	public void gerigit() {
		aracindurumu="Araç Geri Gidiyor";
	}
	
	public void frenyap()  {
		aracindurumu ="Araç Duruyor";		
	}
	
	
}
