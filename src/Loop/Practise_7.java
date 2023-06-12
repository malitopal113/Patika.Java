package Loop;
import java.util.Scanner;


public class Practise_7 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int number;
		System.out.print("Sayıyı Girin: ");
		number = inp.nextInt();
		
		double result = 0 ;
		
		for (int i = 1; i <= number; i++ ) 
		{
			result += (1.0/i);
		};
		
		System.out.println("Girilen sayının harmonik serisinin toplamı: " + result);
	}

}
