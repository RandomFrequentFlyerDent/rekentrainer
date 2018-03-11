package mainrekentrainer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import oefeningen.Opgave;
import oefeningen.OpgaveGenerator;
import views.OpgaveView;

public class Rekentrainer {
	private List<Opgave> opgaven;
	int totaal;

	public Rekentrainer(OpgaveGenerator gen, int totaal) {
		this.opgaven = new ArrayList<Opgave>(totaal);
		this.totaal = totaal;
		for (int i = 0; i < totaal; i++) {
			opgaven.add(gen.maakOpgave());
		}

		Collections.sort(opgaven, Collections.reverseOrder());
	}

	// Methode start() loopt de collectie opgaven door. Voor elke opgave laat deze
	// de opgave tekst zien en er kan antwoord gegeven worden. Er volgt
	// toepasselijke feedback. Na het doorlopen van alle opgaven wordt het
	// percentage goede antwoorden getoond samen met het absolute aantal getoonde
	// opgaven.
	public void start() {
		final int GOED = 1;
		final int FOUT = 0;
		int gegevenAntwoord;
		int aantalGoedeAntwoorden = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println();

		for (Opgave opgave : this.opgaven) {
			OpgaveView.toonOpgave(opgave);
			gegevenAntwoord = scanner.nextInt();
			OpgaveView.toonFeedback(opgave, gegevenAntwoord);
			aantalGoedeAntwoorden += opgave.controleerAntwoord(gegevenAntwoord) ? GOED : FOUT;
		}

		OpgaveView.toonScore(aantalGoedeAntwoorden, this.totaal);
	}

}
