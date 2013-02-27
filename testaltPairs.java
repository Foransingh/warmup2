class altPairs
{
	public String altPairs(String str) 
	{
  		String result = "";
  		for (int i=0; i<str.length(); i += 4) 
		{
    			int end = i + 2;
    			if (end > str.length()) 
			{
      				end = str.length();
    			}
    			result = result + str.substring(i, end);
  		}
  
  		return result;
	}
}

public class testaltPairs
{
public static void main(String args[])
	{
	altPairs a=new altPairs();
	System.out.println(a.altPairs("foransingh"));
	}
}