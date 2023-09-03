package Methods;
import java.util.Scanner;
public class Palindroms_Number {
	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}
		if (reverseNumber == number) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int number;
		System.out.println("Palindrom Number Checker");	
		System.out.print("Number: ");
		number = inp.nextInt();
		
		if (isPalindrom(number)) {
			System.out.println(number+" is a Polindrom Number");
		} else {
			System.out.println(number+" is NOT a Polindrom Number");
		}

	}

}
