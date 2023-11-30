package cmdline;

public class HP2 {

	public static void main(String[] args) {
		float r = Float.parseFloat(args[0]);
		System.out.println("Radius(r)= "+r);
		float h =Float.parseFloat(args[1]);
		System.out.println("Height(h)= "+h);
		float a = (float)((Math.PI*r*r) + (2*Math.PI*r*h));
		System.out.println("Area = "+a);

	}

}
