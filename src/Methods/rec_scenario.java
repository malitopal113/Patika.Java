package Methods;
import java.util.Scanner;
public class rec_scenario {
	
	static int addRemoveFive(int number, boolean increase,int initNum) {
		int variable;
        if (number > initNum && increase) {
            return 1;
        }
        if (number <= 0) {
            increase = true;
        }
        if (increase) {
            variable = 5;
        } else {
            variable = -5;
        }
        System.out.print(number + " ");
        return addRemoveFive(number+variable, increase, initNum);
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		while(true) {			
			System.out.print("Number: ");
			int number = inp.nextInt(); 
			addRemoveFive(number, false, number);
			System.out.println();
		}
	}
	

}
