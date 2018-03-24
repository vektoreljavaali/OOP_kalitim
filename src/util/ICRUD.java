package util;

import java.util.List;

public interface ICRUD {

	public boolean Kaydet(Object o);
	public boolean Duzenle(Object o);
	public boolean Sil(int id);
	public List<Object> Listele();
	public Object Bul(int id);
	 
	
}
