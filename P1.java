package cmdline;

class P1{
	public static void main(String[] args) 
	{
		int x=Integer.parseInt(args[0]);
		System.out.println("Dividend: "+x);
		int y=Integer.parseInt(args[1]);
		System.out.println("Divisor: "+y);
		int q= x/y;
		int r=x%y;
		System.out.println("Quotient= "+q);
		System.out.println("Remainder= "+r);
	}
}