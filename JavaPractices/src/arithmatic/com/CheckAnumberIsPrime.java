package arithmatic.com;

public class CheckAnumberIsPrime {

	public static void main(String[] args) {
		
		
		
		int count1 =0 ;
		for (int j = 1; true; j++) {
			int count =0;	
			
		for (int i = 1; i <= j; i++) {
			
			if(j%i == 0)
			{
				count++;
			}
			else
			{
				
			}
		}
		
		if(count==2)
		{
			System.out.print(j+", ");
			count1++;
		}
		else if(count1 == 100)
		{
			break;
		}
		}
		System.out.println("Prime Number List");
	}
	
}
