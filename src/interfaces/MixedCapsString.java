package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String str) {
		// TODO Auto-generated method stub
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 1) {
				output += Character.toUpperCase(str.charAt(i));
			} else {
				output += Character.toLowerCase(str.charAt(i));
			}
		}
		return output;
	}

}
