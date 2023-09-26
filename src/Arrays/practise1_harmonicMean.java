package Arrays;

public class practise1_harmonicMean {
	static double harmonicAverage(int[] list) {
		double sum = 0.0;
		int n = list.length;
		for (int i = 1; i <= n; i++) {
			sum += 1.0/i; 
		}
		double average = n / sum;
		return average;
	}
	public static void main(String[] args) {
		int[] list = {0,1,2,3,4,5,6,7,8,9};
		int[] list2 = {1,2,3};
		
		System.out.println(harmonicAverage(list));
		System.out.println(harmonicAverage(list2));
	}

}
