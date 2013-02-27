class stringMatch
{
	public int stringMatch(String a, String b) 
	{
	int count=0;
	String small=a.length()>b.length()?b:a;
  	for(int i=0;i<small.length()-1;i++)
  		{
  		if(a.substring(i,i+2).equals(b.substring(i,i+2)))
  		{
  			++count;
  		}
		}
  		return count;
	}
}
public class teststringMatch
{
public static void main(String args[])
	{
	stringMatch s=new stringMatch();
	System.out.println(s.stringMatch("foran","for"));
	}
}