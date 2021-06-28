package java_inheritance;

public class WorkinPerson extends Person {
	int graduation_degree;
	
	public int getgraduation_degree() {
		return graduation_degree;
	}
	
	public int setgraduation_degree(int newgraduation_degree) {
		
		graduation_degree = newgraduation_degree;
		
		if(newgraduation_degree<60) {
			System.out.println("Unfortunately your graduation degree is not enough");
		}
		else if(newgraduation_degree>60 && newgraduation_degree<80) {
			System.out.println("Your graduation degree is good you can get hired ");
		}
		else {
			System.out.println("You are graduation degree is perfect.You have been hired");
		}
		
		return newgraduation_degree;
		
	}

}


