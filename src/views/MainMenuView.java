package views;

public abstract class MainMenuView {

	public static void printOpgavenKeuzeMenu() {
		System.out.println(
				"Kies wat voor opgaven je wilt oefenen?\n[1] - Optellen\n[2] - Aftrekken\n[3] – Vermenigvuldigen");
	}

	public static void printAantalOpgavenVraag() {
		System.out.println("\nHoeveel opgaven wil je oefenen?");
	}

	public static void printKeuzeInputTekst() {
		System.out.print("Keuze: ");
	}

	public static void printAantalOpgavenInputTekst() {
		System.out.print("Aantal: ");
	}

}
