package InputSupporter;

import java.util.Scanner;

public class Input {
	public static int intInput(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.println(title);
		return Integer.parseInt(scan.nextLine());
	}

	public static float floatInput(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.println(title);
		return Float.parseFloat(scan.nextLine());
	}

	public static String stringInput(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.println(title);
		return scan.nextLine();
	}

	public static double doubleInput(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.println(title);
		return Double.parseDouble(scan.nextLine());
	}

}
