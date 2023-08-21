package Loop;
import java.util.Scanner;
public class Inverted_Triangle {

	public static void main(String[] args) {
		int k,l,m;
        Scanner input = new Scanner(System.in);
        System.out.print("NUMBER OF STEPS: ");
        k = input.nextInt();
        for(l=1;l<=k;l++){
            for(m=k; m>=l; m--){
                System.out.print("*");
            }
            System.out.println("");
        }

	}

}
