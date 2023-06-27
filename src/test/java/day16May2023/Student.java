package day16May2023;

public class Student {

		Student()
		{
			System.out.println("o args user defined constructor....");
		}
		Student(int age)
		{
			System.out.println("1 args user defined constructor....");
		}
		Student(int age,String name)
		{
			System.out.println("2 args user defined constructor....");
		}
		static
		{
			System.out.println("static block#1");
		}
		static
		{
			System.out.println("static block#2");
		}
		{
			System.out.println("instance block");
		}
		int age;
		protected String name;
		 void learning()
		 {
			 System.out.println("Student learn");
		 }
		 boolean getResult() {
			 return true;
			 
		 }
		public static void main(String[] args) {
			Student s=new Student(20);
				
		}

}
