package BoxMatch_ClassesProject;

public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("Conor McGregor", 10, 120, 100,25);
		Fighter f2 = new Fighter("Khabib Nurmagomedov", 20, 155, 70,50);
		
		Match match = new Match(f1,f2,69,120);
		match.run();
	}

}


