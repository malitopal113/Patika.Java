package Loop;
import java.util.Scanner;

public class Practise_5 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int number, power;
		
		System.out.print("Sayıyı Girin: ");
		number = inp.nextInt();
		
		System.out.print("Kuvveti Girin: ");
		power = inp.nextInt();
		
		int result = 1;
		
		if (power == 0) 
		{
			System.out.print(number + " sayısının " + power + ".kuvveti: 1'dir  " );
		}
		else 
		{
			for(int i = 1; i <= power; i++) 
			{	
				result *= number;
			}
			
			System.out.print(number + " sayısının " + power + ".kuvveti:  " + result );
		}
		
	}

}
