package Loop;
import java.util.Scanner;
public class Max_Min_Finder {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int qNumber;
		int max = 0;
		int min = 0;
		int number;
		System.out.print("How many numbers will you enter?: ");
		qNumber = inp.nextInt();
		
		for (int i = 1; i <= qNumber; i++) {
			System.out.print(i+"-Number: ");
			number = inp.nextInt();
			if (number < min  || min == 0) {
				min = number;
			} 
			if (number > max) {
				max = number;
			}
		}
		System.out.println("The maximum number which you entered is: " + max);
		System.out.println("The minimum number which you entered is: " + min);
	}

}
