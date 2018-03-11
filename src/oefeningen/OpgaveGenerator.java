package oefeningen;

public class OpgaveGenerator {
	private final int OPTELLEN = 1;
	private final int AFTREKKEN = 2;
	private final int VERMENIGVULDIGEN = 3;
	private int opgaveInstelling;

	public OpgaveGenerator(int opgaveInstelling) {
		this.opgaveInstelling = opgaveInstelling;
	}
	
	public Opgave maakOpgave() {
		Opgave opgave = null;
		
		if (this.opgaveInstelling == OPTELLEN) {
			opgave =  new Optellen();
		} else if (this.opgaveInstelling == AFTREKKEN) {
			opgave = new Aftrekken();
		} else if (opgaveInstelling == VERMENIGVULDIGEN) {
			opgave =  new Vermenigvuldigen();
		}
		
		return opgave;
	}

}