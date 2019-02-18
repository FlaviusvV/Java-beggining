package zFlavius;

public class cityApp {

	public static void main(String[] args) {

		City city = new City();
		city.nrPop=20000;
		city.sectoare=5;
		city.numeOras = "Toronto";
		
		
		//country.afis();
		
		Country country = new Country();
		city.country=country;
		country.name="Canada";
		country.continent="SUA";
		city.afisare();
	}

}
