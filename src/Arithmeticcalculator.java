import java.util.*;

public class Arithmeticcalculator {
	static int n1, n2;
	Scanner sc = new Scanner(System.in);
	int addition()
	{
		System.out.println("Enter two numbers for addition");
		n1=sc.nextInt();
		n2=sc.nextInt();
		return n1+n2;
	}
	int subtraction()
	{
		System.out.println("Enter two numbers for subtraction");
		n1=sc.nextInt();
		n2=sc.nextInt();
		return n1-n2;
	}
	int multiply()
	{
		System.out.println("Enter two numbers for multiply");
		n1=sc.nextInt();
		n2=sc.nextInt();
		return n1*n2;
	}
	int divide()
	{
		System.out.println("Enter two numbers for divide");
		n1=sc.nextInt();
		n2=sc.nextInt();
		return n1/n2;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiply");
		System.out.println("Divide");
		System.out.println("Enter the mode you use");
		String str = s.nextLine();
		Arithmeticcalculator obj = new Arithmeticcalculator();
		int n=0;
		switch(str)
		{
		case "Addition":
			n=obj.addition();
			break;
		case "Subtraction":
			n=obj.subtraction();
			break;
		case "Multiply":
			n=obj.multiply();
			break;
		case "Divide":
			n=obj.divide();
			break;
		default:
			System.out.println("Wrong Mode");
		}
		System.out.println("Answer = "+n);
	}
}
