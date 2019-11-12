package Apstraktna;

import Interface.Iconstruct;

public class Kablovi extends dodatnaOprema implements Iconstruct {
	
	public String modelKabla;
	
	@Override
	public void katalog() {
		System.out.println("Katalog kablova.....................");
	}

	@Override
	public void testiraj() {
		System.out.println("Testriram kablove");
		
	}

	@Override
	public void install() {
		System.out.println("Polozi kablove...");
		
	}

	@Override
	public void uninstall() {
		System.out.println("Iscupaj kablove...");
		
	}
}
