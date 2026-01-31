package arithmatic.com;

public class StrongNumber {
	
	
	//get factorial of a integer
	public static  int fact(int digit)
	{
		int num = 1;
		for (int i = digit; i > 0; i--) {
			
			num = num*i;
		}
		System.out.println(num);
		return num;
	}
	
	//check weather a number is strong or not
	public static void main(String[] args) {

		int n = 145;
		int sum = 0;

		while (n > 0) {

			int r = n % 10;
			sum= sum + fact(r);
			n=n/10;
			
		}
		System.out.println(sum);
	}
}
