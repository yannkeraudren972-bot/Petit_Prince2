package jeu;

import java.util.Random;


public class JeuDe extends JeuSimple {

	
	public JeuDe(String nom) {
		
		this.nom = nom;
	}
	
	
	
	
	@Override
	public int arbitrer(String c1, String c2) {
		

		int val1 = Integer.parseInt(c1);
	    int val2 = Integer.parseInt(c2);
	
			
		if (val1 == val2) {
			return 0;
		}
		if (val1 > val2) {
				return -1;
		}else {
			return 1;
		}
	}
	
	
	@Override
	public String jouerUnTour() {
		
		Random r = new Random();
		
		int alea = r.nextInt(6);
		
		return "" + alea;
	}
	
	
}
