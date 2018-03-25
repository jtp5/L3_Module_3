package abstract_classes.farm;

public class Pig extends Animal {

	public Pig(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Oink");
	}

	@Override
	public String getSpecies() {
		// TODO Auto-generated method stub
		return species;
	}

}
