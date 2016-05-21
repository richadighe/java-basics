import java.util.*;

public class PrintGrade {

	public static void main(String[] args) {
		String input;
		float number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter CGPA(out of 5) value to get the grade");
		input = scanner.nextLine();
		number = Float.parseFloat(input);
		printGrade(number);
	}

	public static void printGrade(float num) {
		char grade;
		if (num >= 5)
			grade = 'A';
		else if (num < 5 && num > 4)
			grade = 'B';
		else if (num <= 4 && num > 3)
			grade = 'C';
		else if (num <= 3 && num > 2)
			grade = 'D';
		else if (num <= 2 && num > 1)
			grade = 'E';
		else
			grade = 'F';
		System.out.println("Your grade is : " + grade);
		return;
	}

}
