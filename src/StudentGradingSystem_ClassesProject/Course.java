package StudentGradingSystem_ClassesProject;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	
	Course(String name, String code, String prefix){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
	}
	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		} else {
			System.out.println("Teacher name and Course do not match!");
		}
	}
	void printTeacherInfo() {
		this.teacher.print();
	}
}
