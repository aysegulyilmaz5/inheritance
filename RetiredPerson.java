package java_inheritance;

public class RetiredPerson extends Person{
	
	String health_problems;
	
	
	
	public String gethealth_problems() {
		return health_problems;
	}
 
	public String sethealth_problems(String problems) {
		
		health_problems = problems;
		
		if(("problems").equals("yes")) {
			System.out.println("You are not suitable for this job");
		}
		else {
			System.out.println("You are suitable for this job");
		}
		
		return problems;
	}
}
