package series;

import java.util.Scanner;

public class calculator {
	
	public static void main(String args[])throws Exception{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number1");
		int a= s.nextInt();
		System.out.println("enter the number2");
		int b=s.nextInt();
		
		System.out.println("enter the operation");
		char c= s.next().charAt(0);
		if(c=='+')
		{
		   int sum=a+b;
		   System.out.println(sum+"");
		}
		else if(c=='-')
		{
			int sub=a-b;
			 System.out.println(sub+"");
		}
		else if(c=='*')
		{
			int multiply=a*b;
			 System.out.println(multiply+"");
		}
		else if(c=='/')
		{
			int divide=a/b;
			 System.out.println(divide+"");
		}
		else
		{
			 System.out.println("Operation not supported");
		}
		
	}
}
