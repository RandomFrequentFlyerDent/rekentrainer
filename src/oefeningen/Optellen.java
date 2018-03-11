package oefeningen;

public class Optellen extends Opgave{
	
	public Optellen() {
		super();
		super.antwoord = this.getal01 + this.getal02;
	}
	
	@Override
	public String toString() {
		return String.format("%s%d + %d?", super.toString(), this.getal01, this.getal02);
	}
}
