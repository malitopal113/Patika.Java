package Loop;
import java.util.Scanner;
public class Prime_Numbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Prime Numbers");
		System.out.print("Number:");
		int sayi = inp.nextInt();
		
		for (int i = 2; i < sayi; i++) {
			int control = 0;
			for (int j = 2; j < i; j++) {
				if ( i%j == 0) {
					control +=1;
				}
			}
		if (control == 0) {
			System.out.print(i + " ");
		}

		}
	}

}
