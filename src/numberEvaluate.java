import java.util.*;

public class NumberEvaluate {

	static String input;
	static int number;

	public static void evaluateNumber(int num) {
		if (num == 10)
			System.out.println("Number is equal to 10");
		else if (num < 10)
			System.out.println("Number is less than 10");
		else
			System.out.println("Number is greater than 10");
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		input = scanner.nextLine();
		number = Integer.parseInt(input);
		evaluateNumber(number);
	}

}
