package JavaTraining;


	class Person {

	    void walk() {
	        System.out.println("Person can walk");
	    }
	}

	class Student extends Person {

	    void study() {
	        System.out.println("Student is studying");
	    }
	}

	class CollegeStudent extends Student {

	    void attendClass() {
	        System.out.println("College student attends class");
	    }
	}

	public class MultiLevel {

	    public static void main(String[] args) {

	        CollegeStudent s = new CollegeStudent();

	        s.walk();
	        s.study();
	        s.attendClass();
	    )
)
	
