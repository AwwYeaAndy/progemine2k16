 import java.util.*;
public class Proov {
	public static void main(String[] args){
		Risttahukas r1 = new Risttahukas(4,3,2.5);
		Kolmnurk k1 = new Kolmnurk(4,3,2.5);
		Silinder s1 = new Silinder(2,0.5,2.5);
		double pindalakokku = r1.pohjaPindala()+k1.pohjaPindala()+s1.murdPindala();
		double ruumalakokku = r1.ruumala()+k1.ruumala()+s1.murdRuumala();
		List<Kujundid> kujundid = new ArrayList<Kujundid>();
		List<Silinder> silinder = new ArrayList<Silinder>();
		kujundid.add(r1);
		kujundid.add(k1);
		//kujundid.add(s1);
		silinder.add(s1);
		System.out.println("----------Kujundid-----------");
		for(Kujundid k: kujundid){
			System.out.println("Põhjapindala: "+k.pohjaPindala());
			System.out.println("Ruumala: "+k.ruumala());
		}
		System.out.println("----------Silinder-----------");
		for(Silinder s: silinder){
			System.out.println("Pindala: "+s.pohjaPindala());
			System.out.println("Murdpindala: "+s.murdPindala());
			System.out.println("Murdruumala: "+s.murdRuumala());
		}
		System.out.println("----------Kogu pindala-----------");
		System.out.println("Pindala kokku(RT,KN,S) "+pindalakokku);
		System.out.println("Ruumala kokku(RT,KN,S) "+ruumalakokku);
	}
}