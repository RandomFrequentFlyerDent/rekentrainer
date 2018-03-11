package views;

import mainrekentrainer.RangeValidator;

public abstract class ErrorView {

	public static void printError(RangeValidator validatie) {
		System.out.println("  Geen geldige invoer.");
	}

}
