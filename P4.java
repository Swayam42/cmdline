package cmdline;

public class P4 {

	public static void main(String[] args) 
	{
	    double t = Double.parseDouble(args[0]);
		System.out.println("t= "+t);
		double b= Math.cos(5*t)+Math.sin(7*t);
		System.out.println("cos(5t)+ sin(7t)= "+b);

	}

}
