public class Sample14 {
	public static void main(String[] args)
	{
		int d = 2;
		double pi = 3.14;
		
		System.out.println("For a circle with diameter of "+d+"cm,");
		System.out.println("its circumference is "+(d*pi)+"cm");
		
		int num1 = 5;
		int num2 = 4;
		
		double div1 = num1/num2;
		double div2 = (double)num1/(double)num2;
		
		System.out.println("5/4 is "+div1);
		System.out.println("5/4 is "+div2);
	}
}
