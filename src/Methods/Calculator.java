package Methods;
import java.util.Scanner;

public class Calculator {
	
	static void sum () {
		Scanner inp = new Scanner(System.in);
		int number, result = 0, i = 1;
		while(true) {
			System.out.print(i++ + "-Number: ");
			number = inp.nextInt();
			if (number == 0) {
				break;
			}
			result += number;
		}
		System.out.println("Result = " + result);
	};
	static void minus() {
		Scanner inp = new Scanner(System.in);
		int counter, number, result = 0;
		System.out.print("How many numbers will you enter: ");
		counter = inp.nextInt();
		for (int i = 1; i <= counter; i++) {
			System.out.print(i + "-Number: ");
			number = inp.nextInt();
			if(i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}
		System.out.println("Result = " + result);
	};
	static void multiple() {
		Scanner inp = new Scanner(System.in);
		int number, result = 1, i=1;
		System.out.println("Please enter 1 at last to see the result");
		while(true) {
			System.out.print(i++ + ". Number: ");
			number = inp.nextInt();
			if (number == 1) {
				break;
			}
			if (number == 0) {
				result = 0;
				break;
			}
			result *=number;
		}	
		System.out.println("Result = " + result);
	}
	static void divided() {
		Scanner inp = new Scanner(System.in);
		int counter, number;
		double result = 0.0;
		System.out.print("How many numbers will you enter: ");
		counter = inp.nextInt();
		for (int i = 1; i <= counter; i++) {
			System.out.print(i + "-Number: ");
			number = inp.nextInt();
			if(i == 1) {
				result = number;
				continue;
			}
			if(i != 1 && number == 0) {
				System.out.println("Can not be entered 0 as a divisor");
				continue;
			}
			result /= number;
		}
		System.out.println("Result = " + result);
	}
	static void power() {
		Scanner inp = new Scanner(System.in);
		int number, pow;
		System.out.print("Number: ");
		number = inp.nextInt();
		System.out.print("Power: ");
		pow = inp.nextInt();
		int result = number;
		for (int i = 1; i < pow; i++) {
			result *= number;
		}
		System.out.println("Result = " + result);
	}
	static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number :");
        int number = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }
	static void mode() {
		 Scanner scan = new Scanner(System.in);
	        System.out.print("1.Number :");
	        int number = scan.nextInt();
	        System.out.print("2.Number :");
	        int number_2 = scan.nextInt();
	        int result = number % number_2;
	        System.out.println("Result : " + result);
	}
	static void rectangle() {
		 Scanner scan = new Scanner(System.in);
	        System.out.print("1. side length :");
	        int a= scan.nextInt();
	        System.out.print("2. side length :");
	        int b = scan.nextInt();
	        int area = a* b;
	        int perimeter = 2 * (a + b);
	        System.out.println("Area = " + area+", Perimeter: " + perimeter);
		
	}

	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int select;
		System.out.println("***CALCULATOR***");
		String menu = "==============\n"
				+ "1- Addition\r\n"
				+ "2- Subtraction\r\n"
				+ "3- Multiplication\r\n"
				+ "4- Dividing\r\n"
				+ "5- Exponential number\r\n"
				+ "6- Faktorial\r\n"
				+ "7- Mode\r\n"
				+ "8- Area and Perimeter of Rectangle\r\n"
				+ "0- Exit\r\n"
				+ "==============\n";
		do {
			System.out.println(menu);
			System.out.print("Enter the transaction number you want to make: ");
			select = inp.nextInt();
			switch(select) {
			case 1:
				sum ();
				break;
			case 2:
				minus();
				break;
			case 3:
				multiple();
				break;
			
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mode();
				break;
			case 8:
				rectangle();
			}
		}while(select !=0);	

	}

}
