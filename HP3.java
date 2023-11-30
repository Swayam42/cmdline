package cmdline;

public class HP3 {
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		System.out.println("4 digit no.: "+a);
		int x= a%10;
		int y=a/1000;
		int sum=x+y;
		System.out.println("Sum of first and last digit: "+sum);
	}

}
