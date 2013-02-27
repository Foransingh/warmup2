class frontTimes
{
	public String frontTimes(String str, int n) 
	{
		String result="";
		String str1;
  		if(str.length()>=3)
  			{
  			str1=str.substring(0,3);
  			}
  		else
  			str1=str;
 		 for(int i=0;i<n;i++)
  			{
  			result=result+str1;
  			}
  	return result;
	}	
}
public class testfrontTimes
{
public static void main(String args[])
	{
	frontTimes f=new frontTimes();
	System.out.println(f.frontTimes("foran",3));
	}
}