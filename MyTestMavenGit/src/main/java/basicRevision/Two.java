package basicRevision;

public class Two extends One {
	private int hra;
	private int pf;

	public void setHRA(int hra) {
		this.hra = hra;
	}

	public void calculateHRA() {
		hra = ((5 * basicpay) / 100);
	}

	public int getHRA() {
		calculateHRA();
		return hra;
	}

	public void setPF(int pf) {
		this.pf = pf;
	}

	public void calculatePF() {
		pf = ((20 * basicpay) / 100);
	}

	public int getPF() {
		calculatePF();
		return pf;
	}
}
