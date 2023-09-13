package Methods;
import java.util.Scanner;
public class Recursive_power {
	static int recpow(int x, int y) {
		int result = 1;
		if(y == 0) {
			return result;
		}
		return result *= x * recpow(x, --y);
	}
	public static void main(String[] args) {
		while(true) {
			Scanner inp = new Scanner(System.in);
			System.out.print("Base: ");
			int base = inp.nextInt();
			System.out.print("Power: ");
			int power = inp.nextInt();
			System.out.println("Result: " + recpow(base, power));
		}

	}

}
