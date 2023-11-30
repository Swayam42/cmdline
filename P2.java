package cmdline;

public class P2 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		
		System.out.println("a= " + a);
		int b = Integer.parseInt(args[1]);
		System.out.println("b= " + b);
		int p = (int) Math.pow(a, b);
		System.out.println("a^b= "  + p);

	}

}
