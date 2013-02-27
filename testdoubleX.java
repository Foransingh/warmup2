class doubleX
{
	boolean doubleX(String str) 
	{
		int count=0;
  		for(int i=0;i<str.length()-1;i++)
  		{
  			if(str.charAt(i)=='x')
  			{
  				return (str.charAt(i+1)=='x')?true:false;
  			}
  		}
 		return false;
	}
}
public class testdoubleX
{
public static void main(String args[])
	{
	doubleX d=new doubleX();
	System.out.println(d.doubleX("axxb"));
	}
}