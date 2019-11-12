package Apstraktna;

public class Glavna {

	public static void main(String[] args) {
		Kablovi k = new Kablovi();
		
		k.dodatak = "Kabl";
		k.modelKabla = "Ja sam pomocni kabl";
		
		k.katalog();
		k.testiraj();
		k.install();
		k.uninstall();

	}

}
