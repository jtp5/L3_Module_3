package abstract_classes.farm;

public class Sheep extends Animal {

	public Sheep(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Baaaaa");
	}

	@Override
	public String getSpecies() {
		// TODO Auto-generated method stub
		return species;
	}

}
