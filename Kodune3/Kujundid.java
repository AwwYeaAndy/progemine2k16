import java.util.*;
public abstract class Kujundid {
	double korgus;
	double pindalakokkuR;
	public Kujundid(double uusKorgus){
		korgus = uusKorgus;
	}
	//List<Kolmnurk> kolmnurgad = new ArrayList<Kolmnurk>();
	//List<Risttahukas> tahukad = new ArrayList<Risttahukas>();
	public abstract double pohjaPindala();
	public double ruumala() {
		return pohjaPindala()*korgus;
	}
}