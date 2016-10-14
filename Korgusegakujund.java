public abstract class Korgusegakujund {
	double korgus;
	public Korgusegakujund(double uusKorgus) {
		korgus = uusKorgus;
	}
	public abstract double pohjaPindala();
	public double ruumala() {
		return pohjaPindala()*korgus;
	}
}