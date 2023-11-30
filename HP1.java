package cmdline;

public class HP1 {

	public static void main(String[] args) 
	{
		int p=Integer.parseInt(args[0]);
		System.out.println("Principle= "+p);
		int r=Integer.parseInt(args[1]);
		System.out.println("Rate= "+r);
		int t=Integer.parseInt(args[2]);
		System.out.println("Time= "+t);
		float SI = (p*r*t)/100;
		System.out.println("Simple Interest= "+SI);
		System.out.println();

	}       
	

}
