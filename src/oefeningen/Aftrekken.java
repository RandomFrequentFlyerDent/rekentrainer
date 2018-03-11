package oefeningen;

public class Aftrekken extends Opgave {

	public Aftrekken() {
		super();
		super.antwoord = this.getal01 - this.getal02;
	}
	
	@Override
	public String toString() {
		return String.format("%s%d - %d?", super.toString(), this.getal01, this.getal02);
	}

}
