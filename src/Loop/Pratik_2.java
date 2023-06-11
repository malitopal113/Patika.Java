package Loop;
import java.util.Scanner;

public class Pratik_2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int sayi;
		
		
		int sum = 0;
		int quantity = 0;
		boolean isOdd = false;
		
		while (!isOdd) 
		{
			System.out.print("Sayı girin: ");
			sayi = inp.nextInt();
			
			if(sayi % 2 == 1) 
			{
				isOdd = true;
			}
			else 
			{
				if(sayi % 4 == 0) 
				{
					sum += sayi;
					quantity++;
				}
			}
		}
		
		System.out.println("Girilen sayılardan çift ve 4'e bölünebilenlerin toplamı: " + sum);

	}

}
