package Loop;
import java.util.Scanner;
public class Practise_6 {


	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int number;
		System.out.print("Sayıyı Girin: ");
		number = inp.nextInt();
		
		int basValue, result = 0;
		while (number != 0) {
			
			basValue = number % 10;
			result += basValue;
			number /= 10;
		}
		
		System.out.println("Girilen Sayının Basamaklarının Toplamı:  " + result);
		
		
		
	}

}
