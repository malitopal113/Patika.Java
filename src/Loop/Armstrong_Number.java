package Loop;
import java.util.Scanner;
public class Armstrong_Number {
	static int countDig (int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int number;
		
		System.out.print("Sayıyı Girin: ");
		number = inp.nextInt();
		
		int tempNumber = number;		
		int basNumber = countDig(number);
		
		int basValue;
		int result = 0;
		int realNumber = number;
		while(number != 0) 
		{
			basValue = number % 10;
			int basPow = 1;
			for (int i = 1; i <= basNumber; i++) 
			{
				basPow *= basValue;		 
			}
			result += basPow;
			number /= 10;
		};
		
		System.out.println(result);
		
		if (realNumber == result) {
			System.out.println("Sayınız Armstrong bir sayıdır");
		}else
			System.out.println("Sayınız armstrong bir sayı değildir");
	}

}
