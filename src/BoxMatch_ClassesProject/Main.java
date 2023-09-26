package BoxMatch_ClassesProject;

public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("Batuhan Bashan", 10, 120, 100,15);
		Fighter f2 = new Fighter("Mehmet Ali", 20, 155, 70,50);
		
		Match match = new Match(f1,f2,69,120);
		match.run();
	}

}


