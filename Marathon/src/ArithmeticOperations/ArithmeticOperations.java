package ArithmeticOperations;

public class ArithmeticOperations {
	public static void main(String[] args) {
		
		int res1 = subtractNumbers(20,5);
		System.out.println(res1);
		int res2 = multiplyNumbers(4,5);
		System.out.println(res2);
		double res3 = divideNumbers(20,4);
		System.out.println(res3);
		int res4 = findRemainder(10,3);
		System.out.println(res4);
		
	}
	public static int subtractNumbers(int num1, int num2)
	
	{
		
		return num1-num2;
	}
	public static int multiplyNumbers(int a, int b)
	{
		
		return a*b;
	}
	public static double divideNumbers(int i, int j)
	{
		
		return i/j;
	}
	public static int findRemainder(int s, int t)
	{
		
		return s%t;
	}

}
