package cmdline;

public class P6 {

	public static void main(String[] args) 
	{
		char a= args[0].charAt(0);
		System.out.println("Provide a character: "+a);
		int b=(int)a;
		System.out.println("ASCII value of "+a+" is "+b);
	}

}
