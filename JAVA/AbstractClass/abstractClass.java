import java.util.Scanner;

class Teacher implements resume{
	private String name;
	private String qualification;
	private String achievements;
	private int exp;
	
	public void readTeacher()
	{
		Scanner s = new  Scanner(System.in);
		System.out.print("<-----> TEACHER DETAILS <----->");
		System.out.print("\nEnter name: ");
		name = s.nextLine();
		System.out.print("\nEnter the qualification: ");
		qualification = s.nextLine();
		System.out.print("\nEnter achievements: ");
		achievements = s.nextLine();
		System.out.print("\nEnter experience: ");
		exp = s.nextInt();
	}
	public void bioData()
	{
		System.out.print("<-----> TEACHER BIODATA <----->");
		System.out.format("\nNAME: %s", name);
		System.out.format("\nQUALIFICATION: %s", qualification);
		System.out.format("\nACHIEVEMENTS: %s", achievements);
		System.out.format("EXPERIENCE: %s", exp);
	}
}

class Student implements resume{
	private String name;
	private String grade;
	private int marks;
	
	public void readStudent()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\n<-----> STUDENT DETAILS <----->");
		System.out.print("\nEnter name: ");
		name = s.next();
		System.out.print("\nEnter marks: ");
		marks = s.nextInt();
		System.out.print("\nEnter grade: ");
		grade = s.next();
	}
	public void bioData()
	{
		System.out.print("\n<-----> STUDENT BIODATA <----->");
		System.out.format("\nNAME: %s", name);
		System.out.format("\nGRADE: %s", grade);
		System.out.format("MARKS: %d", marks);
	}
}



public class abstractClass {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.readTeacher();
		t.bioData();
		
		Student s = new Student();
		s.readStudent();
		s.bioData();
	}

}
