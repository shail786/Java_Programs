
public class Palindrome {
	
	public static void main(String[] args)
	{
		String str = "Madam";
		String rev="";
		char[] ch = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		if(rev.toLowerCase().equals(str.toLowerCase()))
		{
			System.out.println("palindrome");
			
		}
		else
			System.out.println("Not palindrome");
		
	}

}
