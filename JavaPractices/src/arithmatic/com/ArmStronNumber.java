package arithmatic.com;

public class ArmStronNumber {
	
	public static int multiplywithpower(int n,int count)
	{
		// 
		int result = 1;
		
		for (int i = 1; i <=count ; i++) {
			
			result= result*n;
			
		}
		return result;
	}
	
	public static int getCountVal(int n)
	{
		int count= 0;
		while(n > 0)
		{
			n= n/10;
			count++;
		}
		System.out.println("Count : "+ count);
		
		return count;
		
	}
	
	public static void main(String[] args) {
		int givenNum = 153;
		int temp = givenNum;
		int count = getCountVal(temp);
		int sum =0;
		while(temp>0)
		{
			int r = temp % 10;
			sum = sum+multiplywithpower(r , count);
			temp = temp/10;
		}
		
		if(sum == givenNum)
		{
			System.out.println(sum +" Is ArmStrong Number");
		}
		
		else
		{
			System.out.println(sum +" Is Not ArmStrong Number");
		}
	}

}
