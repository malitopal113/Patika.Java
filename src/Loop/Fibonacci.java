package Loop;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Number: ");
		int num = inp.nextInt();
		int x = 0;
		int y = 1;
		int sum;
		for (int i = 0; i <= num; i++) {
			System.out.print(x+ " ");
			sum = x + y;
			x = y;
			y = sum;
		}

	}

}
