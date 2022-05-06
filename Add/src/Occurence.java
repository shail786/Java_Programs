import java.util.*;
public class Occurence {
	public static void main(String[] args)
	{
		String str = "Shailendra";
		char[] ch = str.toCharArray();
		HashMap<Character,Integer>  map = new HashMap<Character,Integer>();
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
			
		}
		
		for(Map.Entry entry : map.entrySet())
		{

			System.out.print(entry.getKey()+" ");
			System.out.print(entry.getValue());
		}
		
		
		
		
		
		
	}
	
	
	

}
