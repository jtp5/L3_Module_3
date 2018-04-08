package interfaces;

public class BackwardsString extends SpecialString implements TextFunkifier {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String str) {
		// TODO Auto-generated method stub
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}
		return output;
	}

}
