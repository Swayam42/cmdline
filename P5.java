package cmdline;

public class P5 {

	public static void main(String[] args) 
	{
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int c =Integer.parseInt(args[2]);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		int min=Math.min(Math.min(a,b),c);
		int max=Math.max(Math.max(b,c),c);
		int mid=a+b+c-min-max;
		System.out.println("Ascending Order: "+min+","+mid+","+max);
	}

}
