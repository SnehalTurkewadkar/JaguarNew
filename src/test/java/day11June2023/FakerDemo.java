package day11June2023;

import com.github.javafaker.Faker;

public class FakerDemo {

	public static void main(String[] args) {
		String fn;
		Faker data=new Faker();
		System.out.println("dn"+data.internet().domainName());
		
		for(int i=1;i<=5;i++)
		{
			fn=data.name().firstName();
			System.out.println(fn);
		}
		System.out.println("fullName"+data.name().fullName());
		System.out.println("lastname"+data.name().lastName());
		System.out.println("middleName"+data.name().nameWithMiddle());

	}

}
