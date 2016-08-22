
public class Duplicate {
	public static void main(String[] args) {
		 String input = "ABB";

		    String output = "";
		    for (int index = 0; index < input.length(); index++) {
		        if (input.charAt(index % input.length()) != input
		                .charAt((index + 1) % input.length())) {

		            output += input.charAt(index);

		        }
		    }
		    System.out.println(output);
	}
}