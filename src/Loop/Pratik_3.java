package Loop;
import java.util.Scanner;

public class Pratik_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Sayı Girin: ");
		n = input.nextInt();
		int counter_1 = 0, counter_2 = 0;
		
		System.out.println("Girilen sayıya kadar;");

		for (int i= 1; i <= n; i *= 4) 
		{
			System.out.println("4' ün " + counter_1 +".kuvveti " + i);
			counter_1++;
		};
		
		for (int i= 1; i <= n; i *=5) 
		{
			System.out.println("5'in " + counter_2 +".kuvveti " + i);
			counter_2++;
		};

	}

}
