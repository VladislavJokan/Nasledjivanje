package Apstraktna;

public abstract class dodatnaOprema {
	
	public String dodatak;
	
	// ovo je klasicna metoda
	public void katalog() {
		System.out.println("Prikaz dodatne opreme");
	}
	
	// ovo je apstraktna metoda
	public abstract void testiraj();
}
