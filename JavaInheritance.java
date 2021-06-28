package java_inheritance;

public class JavaInheritance {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("--------------");
		System.out.println("Student");
		s1.setName("Ahmet");
		System.out.println(s1.getName());
		s1.setSurname("Göksu");
		System.out.println(s1.getSurname());
		s1.setAge(17);
		System.out.println(s1.getAge());
		s1.setGender('M');
		System.out.println(s1.getGender());
		s1.setGrade(75);
		System.out.println(s1.getGrade());
		System.out.println("--------------");
		
		WorkinPerson w1 = new WorkinPerson();
		System.out.println("--------------");
		System.out.println("Working Person");
		w1.setName("Hande");
		w1.setSurname("Yýlmaz");
		w1.setAge(30);
		w1.setGender('F');
		w1.setgraduation_degree(89);
		System.out.println(w1.getName());
		System.out.println(w1.getSurname());
		System.out.println(w1.getAge());
		System.out.println(w1.getGender());
		System.out.println(w1.getgraduation_degree());
		System.out.println("--------------");
		RetiredPerson r1 = new RetiredPerson();
		System.out.println("--------------");
		System.out.println("Retired Person");
		r1.setName("Nesrin");
		r1.setSurname("Tanyeri");
		r1.setAge(60);
		r1.setGender('F');
		r1.sethealth_problems("Yes");
		System.out.println(r1.getName());
		System.out.println(r1.getSurname());
		System.out.println(r1.getAge());
		System.out.println(r1.getGender());
		System.out.println(r1.gethealth_problems());
		System.out.println("--------------");
		
		
	}

}
