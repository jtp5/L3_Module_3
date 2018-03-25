package abstract_classes.farm;

public abstract class Animal {
	protected String species;

	public Animal(String s) {
		species = s;
	}

	public abstract void makeNoise();

	public abstract String getSpecies();

}
