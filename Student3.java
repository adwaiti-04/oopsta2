package text;
class Students{
	int id;
	String name;
}

public class Student3 {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		s1.id= 100;
		s1.name= "Siddhi";
		s2.id= 101;
		s2.name= "Sanjana";
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}

}
