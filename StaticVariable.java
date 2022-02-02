package company;

class Student{
	int rollno;
	String name;
	static String college ="ITS";

  Student(int r, String n){
	  rollno= r;
	  name = n;
  }

  void Display() {
	  System.out.println(rollno+" "+name+" "+college);
	  
  }

 static void change() {
	college ="BBTS";
	
}
}
public class StaticVariable {

	public static void main(String[] args) {
		Student.change();
		Student s1 = new Student(111, "Aryan");
		Student s2 = new Student(222, "Rahul");
		s1.Display();
		s2.Display();

	}

}
