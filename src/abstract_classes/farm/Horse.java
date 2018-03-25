package abstract_classes.farm;

public class Horse extends Animal {

	public Horse(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Neigh");
	}

	@Override
	public String getSpecies() {
		// TODO Auto-generated method stub
		return species;
	}

}
