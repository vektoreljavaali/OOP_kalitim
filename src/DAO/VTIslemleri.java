package DAO;

import java.util.List;

import util.ICRUD;

public class VTIslemleri implements ICRUD{

	@Override
	public boolean Kaydet(Object o) {
		
		if(o==null)
		{
			return false;	
		}
		else
		{
			
			return true;
		}
		
	}

	@Override
	public boolean Duzenle(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Sil(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Object> Listele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object Bul(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
