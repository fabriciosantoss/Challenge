package challenge;

import java.util.Scanner;

public class session2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert one number for sum");
		int value = scan.nextInt();
		String valor = String.valueOf(value);
		int sum = 0;
		int numbers[] = new int[valor.length()];
		String NumberString = null;
		
		for(int i=0;i<valor.length();i++) {
			char carac = valor.charAt(i);
			NumberString =	Character.toString(carac);
			numbers[i] = Integer.valueOf(NumberString);
		}
		
		for (int i=0;numbers.length>i;i++) {
			
			int n = numbers[i];
			sum += n;
		}
		
		System.out.println("The sum is: " + sum);

		
	}

}
