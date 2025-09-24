package program_java;

public class Identifiers {

	public static void main(String[] args) {

		// int for = 13;
		// System.out.println("value of the number variable is : "+ for);

		// int number 2 = 13;
		// System.out.println("value of the number variable is : "+ number 2);

		// error because Identifier can not starts with @, #
		// int @number3 = 10;

		// Valid Identifier Examples

		 // starts with $
		int $number = 20;
		System.out.println("value of the number variable is : " + $number);

		 // use camelcase
		String studentName = "Aniket";
		System.out.println("value is : " + studentName);

	}

}