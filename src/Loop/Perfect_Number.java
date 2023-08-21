package Loop;
import java.util.Scanner;

public class Perfect_Number {
	public static boolean checkNumber(int n) {
		int sum =0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}		
		};
		return sum == n;
	};
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		boolean perfect;
		int n;
		
		do {
			System.out.print("Number: ");
			n = inp.nextInt();
			perfect = checkNumber(n);
			if(perfect) {
				System.out.println("Your Number is a Perfect Number");
			}else {
				System.out.println("Your Number is not a Perfect Number");
			}
		}while(!perfect);
		
		
	}

};
