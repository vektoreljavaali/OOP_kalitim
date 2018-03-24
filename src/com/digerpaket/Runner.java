package com.digerpaket;

import com.kalitim.arabaspor;

import DAO.VTIslemleri;

public class Runner {

	public static void main(String[] args) {
		arabaspor arabas = new arabaspor(); 

		VTIslemleri vt = new VTIslemleri();
		
		boolean durum =vt.Kaydet(null);
		
		if(durum==true)
			System.out.println("Kayýt edilmiþtir.");
		else
			System.out.println("Kayýt yapýlamamýþtýr");
		
		
	}

}
