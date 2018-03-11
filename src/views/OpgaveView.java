package views;

import oefeningen.Opgave;

public abstract class OpgaveView {
	
	public static void toonOpgave(Opgave opgave) {
		System.out.println(opgave.toString());
	}
	
	public static void toonFeedback(Opgave opgave, int gegevenAntwoord) {
		String feedback = new String((opgave.controleerAntwoord(gegevenAntwoord) ? "GOED!\n" : "Helaas, dat is fout.\n"));
		System.out.println(feedback);
	}
	
	public static void toonScore(int aantalGoedeAntwoorden, int totaal) {
		System.out.printf("%.0f%% goed beantwoord: je hebt %d van de %d opgaven goed beantwoord.",
				((double) aantalGoedeAntwoorden / totaal) * 100, aantalGoedeAntwoorden, totaal);
	}
}
