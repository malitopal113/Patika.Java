package Loop;
import java.util.Scanner;
public class Gcd_Lcm_Finder {

	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		int n1, n2;
		int i =1;
		int gcd = 1;
		int lcm =1;
		System.out.print("N1: ");
		n1 = inp.nextInt();
		System.out.print("N2: ");
		n2 = inp.nextInt();
		
		
		while (i <= n1) {			
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
			i++;			
		}
		lcm = (n1 * n2)/ gcd;
		System.out.println("GCD: " + gcd +"\nLCM: " + lcm);
	}

}
