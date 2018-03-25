package abstract_classes.farm;

public class Cow extends Animal {

	public Cow(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Moo");
	}

	@Override
	public String getSpecies() {
		// TODO Auto-generated method stub
		return species;
	}

}
