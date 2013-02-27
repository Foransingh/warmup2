class stringSplosion
{
	public String stringSplosion(String str) 
	{
  		String answer="";
  		int length=0;
		length=str.length()-1;
  		for(int i=0;i<str.length();i++)
  		{
			answer=answer+str.substring(0,i+1);
  			length--;
  		}
		  return answer;
	}	
}
public class teststringSplosion
{
public static void main(String args[])
	{
	stringSplosion s=new stringSplosion();
	System.out.println(s.stringSplosion("foran"));
	}
}