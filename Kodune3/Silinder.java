public class Silinder extends Kujundid {
	double raadius, pindala, murdosaruumist;
	public Silinder(double raadius, double murdosaruumist, double korgus){
		super(korgus);
		this.raadius = raadius;
		this.murdosaruumist = murdosaruumist;
	}
	public double pohjaPindala(){
		pindala = 3.14*Math.pow(raadius,2);
		return pindala;
	}
	public double murdPindala(){
		if(murdosaruumist == 0.5){
			pindala = pohjaPindala()*0.5;
		}
		return pindala;
	}
	public double murdRuumala(){
		if(murdosaruumist == 0.5){
			pindala = ruumala()/2;
		}
		return pindala;
	}
}