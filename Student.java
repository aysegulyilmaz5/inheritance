package java_inheritance;

public class Student extends Person{
	int grade;
	
	public int getGrade(){
		return grade;
	}
	
	public int setGrade(int newgrade) {
		
		grade = newgrade;
		
		if(grade <85) {
			System.out.println("Your grade is not enough for this job");
		}
		else {
			System.out.println("Your grade is enough for this job");
		}
		
		return newgrade;
	}
}
