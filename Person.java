package java_inheritance;

public class Person {
	
	int age;
	String name;
	String surname;
	char gender;
	
	public String getName() {
		return name;
	}
	
	public String setName(String newname) {
		
		name = newname;
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String setSurname(String newsurname) {
		
		surname = newsurname;
		return surname;
	}
	
	public char getGender() {
		
		return gender;
	}
	
	public char setGender(char newgender) {
		
		gender = newgender;
		
		if(newgender == 'F' || newgender == 'f') {
			System.out.println("You are being evaluated because your gender");
		}
		else if(newgender == 'M' || newgender == 'm') {
			System.out.println("You are not being evaluated because your gender");
		}
		else {
			System.out.println("Please enter valid gender");
		}
		
		return newgender;
	}
	
	public int getAge() {
		return age;
	}
	
	public int setAge(int newage) {
		
		age = newage;
		
		if(newage>18 && newage<35) {
			System.out.println("Your age is suitable for this job");	
		}
		else if(newage>35 && newage<58) {
			System.out.println("Your age is considered suitable for this job");
			
		}
		else {
			System.out.println("Unfortunately you are over the age limit for this job");
		}
		
		return newage;
		
	}
	
}





