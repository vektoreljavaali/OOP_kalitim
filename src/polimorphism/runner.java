package polimorphism;

public class runner {

	public static void main(String[] args) {
		
		Hayvan h = new Hayvan();
		h.yemekye();
		
		Hayvan h1 = new kopek();//upcasting
		
		Hayvan h2 = new kedi();
		
		h1.yemekye();
		h2.yemekye();
				
		
		

	}

}
