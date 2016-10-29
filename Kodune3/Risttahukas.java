public class Risttahukas extends Kujundid {
	double pikkus, laius;
	public Risttahukas(double pikkus, double laius, double korgus){
		super(korgus);
		this.pikkus = pikkus;
		this.laius = laius;
	}
	public double pohjaPindala() {
		return pikkus*laius;
	}
}