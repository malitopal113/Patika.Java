package StudentGradingSystem_ClassesProject;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Hoca", "05538670111", "HI");
		Teacher t2 = new Teacher("Graham Bell", "0533545222","PHY");
		Teacher t3 = new Teacher("Faruk Önen", "0533545333","MAT");
		
		Course history = new Course("History", "101", "HI");
		Course physics = new Course("Physics", "102", "PHY");
		Course mathematic = new Course("Mathematic", "103", "MAT");
		history.addTeacher(t1);
		physics.addTeacher(t2);
		mathematic.addTeacher(t3);
		
		Student mali= new Student("Mehmet Ali Topal", "2113", "5", history, physics, mathematic);
		mali.addBulkExamNote(85, 75, 90);
		mali.isPass();
		
		Student furkan = new Student("Furkan Dursun", "2106", "5", history, physics, mathematic);
		furkan.addBulkExamNote(70, 95, 100);
		furkan.isPass();

	}

}
