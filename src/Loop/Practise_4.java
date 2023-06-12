package Loop;
import java.util.Scanner;

public class Practise_4 {
		
	static int factorial(int x) {
		int total = 1;
		for (int i = 1; i <= x; i++) 
		{
			total *= i;
		}
		return total;
	};
	
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int n, r, f,c;
		
		
		System.out.println("N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.Aşağıya n ve r değerlerini girin.");
		System.out.print("n: ");
		n = inp.nextInt();
		
		System.out.print("r: ");
		r = inp.nextInt();
		f = n-r;
		
		c = factorial(n) / (factorial(r) * factorial(f));
		System.out.println("N’in r’li kombinasyonu C(n,r): " + c);
		
		
	}

}
