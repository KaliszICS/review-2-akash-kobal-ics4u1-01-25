import java.util.Scanner;
public class PracticeProblem {
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here "Get a String using "In: " as the prompt. Output the string."
		Scanner reader = new Scanner(System.in);
		System.out.print("Int: ");
		String prompt = reader.nextLine();
		System.out.println(prompt);
	}

	public static void q2() {
		//Write question 2 code here "Get two integers from user input using "In: " as the prompt. Output the quotient (rounded down) and the remainder on separate lines."
		Scanner reader = new Scanner(System.in);
		System.out.print("Int 1: ");
		int integer1 = reader.nextInt();
		System.out.print("Int 2: ");
		int integer2 = reader.nextInt();
		System.out.println(integer1 / integer2);
		System.out.println(integer1 % integer2);
		
	}

	public static void q3() {
		//Write question 3 code here "'Get a String using "In: " as the prompt. Output the String + " was the text you wrote" on the same line."
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		String integerprompt = reader.nextLine();
		System.out.println(integerprompt + " was the text you wrote on the same line.");
	}

	public static void q4() {
		//Write question 4 code here "Get an integer from user input using "In: " as the prompt. Output the result of the integer times by 5."
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		int integerinput = reader.nextInt();
		System.out.println(integerinput * 5);
	}

	public static void q5() {
		//Write question 5 code here "Get a boolean using "In: " as the prompt. Output the boolean followed by " is a boolean""
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		boolean booleaninput = reader.nextBoolean();
		System.out.println(booleaninput + " is a boolean");
	}

	public static void q6() {
		//Write question 6 code here "Get a double using "In: " as the prompt. Output the double - 3.2."
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		double doubleinput = reader.nextDouble();
		System.out.println(doubleinput);
	}

}

