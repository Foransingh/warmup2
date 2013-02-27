class stringBits
{
	public String stringBits(String str) 
	{
   	String result = "";
  		for (int i=0; i<str.length(); i+=2) 
		{
    		result = result + str.charAt(i);
  		}
  	return result;
	}
}
public class teststringBits
{
public static void main(String args[])
	{
	stringBits s=new stringBits();
	System.out.println(s.stringBits("foran"));
	}
}