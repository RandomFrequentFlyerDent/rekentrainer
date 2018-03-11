package oefeningen;

public class Vermenigvuldigen extends Opgave{
	
	public Vermenigvuldigen() {
		super();
		super.antwoord = this.getal01 * this.getal02;
	}
	
	@Override
	public String toString() {
		return String.format("%s%d x %d?", super.toString(), this.getal01, this.getal02);
	}

}