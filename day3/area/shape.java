package abst;

public abstract class shape {
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	abstract double calculateArea(int n);
}
