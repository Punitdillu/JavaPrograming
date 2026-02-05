package stringPrograms.com;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String str = "Today Is good Day And Tommorow Will be Also a Good Day" ;
		String strLower = str.toLowerCase();
		System.out.println(strLower);
		
		String strArray[] = strLower.split(" ");
		
		for (int i = 0; i < strArray.length; i++) 
		{
			
			int count =0;
			int j ;
			
			for (j=0; j < strArray.length; j++) 
			{
				
				
				if(strArray[i].equals(strArray[j]))
				{
					if(j>=i)
				{
					count++;
				}
					
				}
				else
				{
					
				}
				
				
			}
			System.out.println(strArray[i] +" is present : "+ count + " times");
			
		}
		
	}
}
