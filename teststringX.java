class stringX
{
	public String stringX(String str) 
	{
  		String result = "";
  		for (int i=0; i<str.length(); i++) 
		{
    			if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) 
			{
      			result = result + str.charAt(i);
    			}
  		}
  	return result;
	}
}
public class teststringX
{
public static void main(String args[])
	{
	stringX s=new stringX();
	System.out.println(s.stringX("xsdcacdxax"));
	}
}