package abstract_classes.cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double base = population * growthRate;
		return base + (population * .5);
	}

}
