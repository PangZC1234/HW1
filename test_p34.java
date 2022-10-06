public class test_p34 {
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("Mathematical operations of num1 and num2:");
		System.out.println("Value of num1 + num2 is "+(num1 + num2));
		System.out.println("Value of num1 - num2 is "+(num1 - num2));
		System.out.println("Value of num1 * num2 is "+(num1 * num2));
		System.out.println("Value of num1 / num2 is "+(num1 / num2));
		System.out.println("Value of num1 % num2 is "+(num1 % num2));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("b is assigned as a before a is increased by 1, therefore b is "+ b);
		System.out.println("c is assigned as a after a is increased by 1, therefore b is "+ c);
	}
}
