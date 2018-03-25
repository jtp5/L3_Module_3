package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Cow c = new Cow("Cow");
		Horse h = new Horse("Horse");
		Pig p = new Pig("Pig");
		Sheep s = new Sheep("Sheep");
		Cow bob = new Cow("Cow");
		Pig walter = new Pig("Pig");
		farm.add(c);
		farm.add(h);
		farm.add(p);
		farm.add(s);
		farm.add(bob);
		farm.add(walter);
		for (int i = 0; i < farm.size(); i++) {
			System.out.println(farm.get(i).getSpecies());
			farm.get(i).makeNoise();
		}
	}
}
