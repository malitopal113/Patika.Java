package Loop;
import java.util.Scanner;

public class Pratik_1 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int sayi;
		System.out.print("Lütfen Bir Sayı Girin: ");
		sayi = inp.nextInt();
		int sum = 0;
		int quantity = 0;
		
		
		
		
		for (int i = 1; i <= sayi; i++) 
		{
			if ((i % 3 == 0) && (i % 4 == 0) ) 
			{
				sum +=i;
				quantity++;
			}
				
				
		}
		System.out.println("Girilen sayıya kadar 3 ve 4 bölünebilen sayıların toplamı: " + sum);
		
		
		System.out.println("Girilen sayıya kadar 3 ve 4 bölünebilen sayıların ortalaması: " + (sum/quantity));

	}

}
