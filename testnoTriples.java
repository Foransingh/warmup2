class noTriples
{
	public boolean noTriples(int[] nums) 
	{
  		for(int i=0;i<nums.length-2;i++)
  		{
  			if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2])
  			{
  				return false;
  			}
  		}
  		return true;
	}
}
public class testnoTriples
{
public static void main(String args[])
	{
	int arr[]={6,6,7,6};
	noTriples n=new noTriples();
	System.out.println(n.noTriples(arr));
	}
}