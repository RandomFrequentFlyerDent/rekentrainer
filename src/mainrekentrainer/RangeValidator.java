package mainrekentrainer;

public class RangeValidator implements ValidatorInterface {
	private int minimum;
	private int maximum;
	private boolean valid;

	public RangeValidator(int minimum) {
		this.minimum = minimum;
		this.maximum = minimum - 1;
	}

	public RangeValidator(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public boolean isValid() {
		return valid;
	}

	@Override
	public void valideer(int keuze) {
		if (minimum > maximum) {
			if (keuze >= minimum) {
				this.valid = true;
			}
		} else if (keuze >= minimum && keuze <= maximum) {
			this.valid = true;
		}
	}

}
