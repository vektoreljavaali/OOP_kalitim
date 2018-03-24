package models;

public class modeltblmusteri {

	private String tckimlik;
	private String ad;
	private String soyad;
	private String adres;
	private String telefon;
	
	
	public String getTckimlik() {
		return tckimlik;
	}
	public String setTckimlik(String tckimlik,int yetkiid) {
		String durum="";
		if(yetkiid==1) {
			this.tckimlik = tckimlik;
			durum="deðiþiklik yapýldý";
		}
		else {
			durum="yetkiniz yok";
		}
			return durum;
		
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
	
}
