class array667
{
	public int array667(int[] nums) 
	{
		int count=0;
  		for(int i=0;i<nums.length-1;i++)
  		{
  			if(nums[i]==6 && nums[i+1]==6)
  			{
  			count++;
  			}
  			else if(nums[i]==6 && nums[i+1]==7)
  			{
			count++;
			}
  		}
  		return count;
	}
}
public class testarray667
{
public static void main(String args[])
	{
	int [] arr={6,6,7,6};
	array667 a=new array667();
	System.out.println(a.array667(arr));
	}
}