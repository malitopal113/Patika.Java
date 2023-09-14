package Methods;
import java.util.Scanner;
public class rec_prime {

	static boolean isPrime(int num, int divisor) {	
		if (divisor == 1) {
            return true;
        }

        if (num % divisor == 0 || num == 1) {
            return false;
        }

        return isPrime(num, divisor - 1);
		
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("Enter the Number: ");
			num = inp.nextInt();
			if (num <= 0 || num ==1) {
				System.out.println("Please enter a bigger number than 1");
			}else {
				if (isPrime(num, num / 2)) {
					System.out.println(num + " is a prime number");
				}else {
					System.out.println(num + " is not a prime number");
				}
			}
			
		}
		
	}

}
