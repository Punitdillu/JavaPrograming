package stringPrograms.com;

public class ReverseOfaString {
	
	public static void main(String[] args) {
		
		String  str = "Malayalamp";
		String str1 = str.toLowerCase();
		char[]strArr= str1.toCharArray();
		String finalstr="";
		for (int i = strArr.length-1; i >= 0 ; i--) {
			
		 finalstr = finalstr + strArr[i];
		 
		}
		
		if(finalstr.equals(str1))
		{
			System.out.println("String is pelindrome");
		}
		else
		{
			System.out.println("String is not pelindrome");
		}
		
	}

}
