package Singleton_Class;

public class Student_Driver {
	public static void main(String[] args) {
		Student s1=Student.getStudent();
		System.out.println(s1);
		Student s2=Student.getStudent();
		System.out.println(s2);
		Student s3=Student.getStudent();
		System.out.println(s3);
	}
}
