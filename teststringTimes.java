class stringTimes
{
	public String stringTimes(String str, int n) 
	{
	  String result="";
	  for(int i=1;i<=n;i++)
	  {
	  result=result+str;
	  }
	  return result;
	}
}
public class teststringTimes
{
	public static void main(String args[])
	{
	stringTimes s=new stringTimes();
	System.out.println(s.stringTimes("foran",2));
	}
}