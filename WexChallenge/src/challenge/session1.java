package challenge;

import java.util.Scanner;

public class session1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insert one number for division");
		int value = scan.nextInt();
		String valor = String.valueOf(value);

		if (value % 3 == 0 && valor.contains("5")) {

			System.out.println("CiraDinha");

		} else if (valor.contains("5")) {

			System.out.println("Dinha");
		} else {
			if (value % 3 == 0)

				System.out.println("Cira");

		}
	}

}
