package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;


public class PetitPrince implements Sujet {
	
	private String nom;
	
	private int argent;
	
	private ConsoleJavaBoy console;
	
	private int cpt;
	
	public PetitPrince(String nom) {
		
		this.nom = nom;
			
		this.argent = 0;
		
		this.cpt = 0;
		
		this.console = new ConsoleJavaBoy(this);
	}

	@Override
	public int getArgent() {
		
		return this.argent;
	}
	
	@Override
	public String getNom() {
		
		return this.nom;
	}
	
	@Override
	public void run() {
		
		String s = "Bonjour je m'appelle " + this.nom + ", j'ai " + this.argent + " euros; j'ai joué " + this.cpt +
				" fois";
		
		this.console.parler(s);
		
		this.console.seDirigerVers(0);
		
		this.cpt++;
		
	}
}
