package arithmatic.com;

public class Fibnocci {

	public static void main(String[] args) {
		
		// 0, 1, 1, 2, 3, 5, 8, 13
		
		int x= 0;
		int sum = 0;
		int y = 1;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print(sum +", ");
			sum = x+y;
			x=y;
			y= sum;
		}

	}

}
