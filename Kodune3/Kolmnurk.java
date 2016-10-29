public class Kolmnurk extends Kujundid {
	double pikkus, laius, tundmatu, pindala;
	public Kolmnurk(double pikkus, double laius, double korgus){
		super(korgus);
		this.pikkus = pikkus;
		this.laius = laius;
	}
	public double pohjaPindala() {
		tundmatu = Math.pow(pikkus, 2) +  Math.pow(laius, 2);
		tundmatu = Math.sqrt(tundmatu);
		pindala = (pikkus * laius) / 2;
		return pindala;
	}
}