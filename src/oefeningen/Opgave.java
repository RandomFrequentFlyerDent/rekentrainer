package oefeningen;

import java.util.Random;

public abstract class Opgave implements Comparable<Opgave> {
	protected int getal01;
	protected int getal02;
	protected int antwoord;
	protected final String OPGAVE_TEKST = "Wat is ";
	
	public Opgave() {
		this.getal01 = new Random().nextInt(100);
		this.getal02 = new Random().nextInt(100);
		
	}
	
	public boolean controleerAntwoord(int gegevenAntwoord) {
		return gegevenAntwoord == this.antwoord;
	}
	
	@Override
	public int compareTo(Opgave opgave) {
		return  ((Integer)this.antwoord).compareTo(opgave.antwoord);
	}
	
	@Override
	public String toString() {
		return OPGAVE_TEKST;
	}
}
