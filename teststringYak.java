class stringYak
{
	public String stringYak(String str) 
	{
		String result="";
  		for(int i=0;i<str.length();i++)
 		{
     			if((i+2)<str.length()&& str.charAt(i)=='y'&& str.charAt(i+1)=='a' &&              str.charAt(i+2)=='k')
     			{
      				i+=2;
     			}
     			else
       				result=result+str.charAt(i);
  		}
  		return result;
	}	
}
public class teststringYak
{
public static void main(String args[])
	{
	stringYak s=new stringYak();
	System.out.println(s.stringYak("yakpakyak"));
	}
}