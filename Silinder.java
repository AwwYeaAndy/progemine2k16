public class Silinder extends Korgusegakujund {
	double r;
	public Silinder(double korgus, double raadius) {
		super(korgus);
		r = raadius;
	}
	public double pohjaPindala(){
		return 3.14*r*r;
	}
}