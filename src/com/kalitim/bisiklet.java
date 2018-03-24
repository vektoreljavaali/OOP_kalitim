package com.kalitim;


public class bisiklet extends arac{

	public String pedalsekli;
	public int vitessayisi=12;
	public int vitesdurumu=0;
	public int hizi=0;
	
	public void hizlan() {
		hizi++;
	}
	
	public void yavasla() {
		hizi--;
	}
	
	public void vitesarttir() {
		vitesdurumu++;		
	}
	public void viteskucult() {
		vitesdurumu--;		
	}
	
}
