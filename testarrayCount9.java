class arrayCount9
{
	public int arrayCount9(int[] nums) 
	{
		int count=0;
  		for(int i=0;i<nums.length;i++)
  		{
  			if(nums[i]==9)
  			{
				count++;
			}
  		}
  		return count;
	}
}
public class testarrayCount9
{
public static void main(String args[])
	{
	arrayCount9 a=new arrayCount9();
	int [] num1={1,9,2,9};
	System.out.println(a.arrayCount9(num1));
	}
}