package mainrekentrainer;

import java.util.InputMismatchException;
import java.util.Scanner;

import oefeningen.OpgaveGenerator;
import views.ErrorView;
import views.MainMenuView;

/**
 * Deze applicatie is om rekensommen te oefenen. Er wordt een x aantal opgaven
 * getoond waarop de gebruiker na elke opgave een antwoord kan geven. De
 * gebruiker krijgt feedback of het antwoord goed of fout was. Na afloop krijgt
 * de gebruiker te zien hoeveel procent van antwoorden goed was samen met het
 * totaal doorlopen opgaven.
 * 
 * @author Nathalie Everts - 500799821
 *
 */
public class RekentrainerLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int KEUZE_MENU_MINIMUM = 1;
		final int KEUZE_MENU_MAXIMUM = 3;
		final int AANTAL_OPGAVEN_MENU_MINIMUM = 1;
		Rekentrainer rekentrainer;
		RangeValidator validatieKeuzeMenu, validatieAantalMenu;
		int opgaveInstelling, aantalInstelling;

		// Gebruiker laten interacteren met keuze menu inclusief validatie van invoer
		MainMenuView.printOpgavenKeuzeMenu();
		MainMenuView.printKeuzeInputTekst();
		opgaveInstelling = getKeuze();
		validatieKeuzeMenu = new RangeValidator(KEUZE_MENU_MINIMUM, KEUZE_MENU_MAXIMUM);
		validatieKeuzeMenu.valideer(opgaveInstelling);
		while (!validatieKeuzeMenu.isValid()) {
			ErrorView.printError(validatieKeuzeMenu);
			MainMenuView.printKeuzeInputTekst();
			opgaveInstelling = getKeuze();
			validatieKeuzeMenu.valideer(opgaveInstelling);
		}

		// Gebruiker laten interacteren met aantal opgaven menu inclusief validatie van
		// invoer
		MainMenuView.printAantalOpgavenVraag();
		MainMenuView.printAantalOpgavenInputTekst();
		aantalInstelling = getKeuze();
		validatieAantalMenu = new RangeValidator(AANTAL_OPGAVEN_MENU_MINIMUM);
		validatieAantalMenu.valideer(aantalInstelling);
		while (!validatieAantalMenu.isValid()) {
			ErrorView.printError(validatieAantalMenu);
			MainMenuView.printAantalOpgavenInputTekst();
			aantalInstelling = getKeuze();
			validatieAantalMenu.valideer(aantalInstelling);
		}

		// Rekentrainer opstarten met aangegeven keuzes
		rekentrainer = new Rekentrainer(new OpgaveGenerator(opgaveInstelling), aantalInstelling);
		rekentrainer.start();

	}

	private static int getKeuze() {
		do {
			try {
				Scanner scanner = new Scanner(System.in);
				return scanner.nextInt();
			} catch (InputMismatchException exception) {
				System.out.print("  Ongeldige invoer, vul een numeric in: ");
			}
		} while (true);

	}

}