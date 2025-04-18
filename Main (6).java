package test;

class Person {
 private String firstName;
 private String lastName;

 public Person(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 public String getFirstName() {
     return firstName;
 }

 public String getLastName() {
     return lastName;
 }
}

class Employee extends Person {
 private String employeeId;
 private String jobTitle;

 public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
     super(firstName, lastName);
     this.employeeId = employeeId;
     this.jobTitle = jobTitle;
 }

 public String getEmployeeId() {
     return employeeId;
 }

 public String getLastName() {
     return super.getLastName() + " (" + jobTitle + ")";
 }
}


public class Main {
 public static void main(String[] args) {
     Person person = new Person("Alice", "Walker");
     System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

     Employee employee = new Employee("John", "Doe", "EMP123", "Software Engineer");
     System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
     System.out.println("Employee ID: " + employee.getEmployeeId());
 }
}

