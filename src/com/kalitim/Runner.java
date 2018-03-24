package com.kalitim;

import models.modeltblmusteri;

public class Runner {

	public static void main(String[] args) {
	
	
	modeltblmusteri musteri = new modeltblmusteri();
	
//	System.out.println(musteri.setTckimlik("54545455454", 1));
//	System.out.println(musteri.getTckimlik());
	
	islem islm = new islem();
	
	
	ekranayaz yaz = new ekranayaz();
	yaz.ekranayaziyaz();
	
	ezensinif ezn = new ezensinif();
	
	ezn.ekranayaziyaz();
		

	}

}










