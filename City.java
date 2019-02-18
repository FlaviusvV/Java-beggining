package zFlavius;

public class City {

	int nrPop;
	int sectoare;
	String numeOras;
	Country country;
	
	void afisare() {
		System.out.println("numar pop: "+nrPop);
		System.out.println("sectoare: "+sectoare);
		System.out.println("nume: "+ numeOras);
		country.afis();
		
	}
}
