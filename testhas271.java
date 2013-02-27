class has271
{
	public boolean has271(int[] nums) 
	{
  		for (int i=0; i < (nums.length-2); i++) 
		{
    			int val = nums[i];
    			if (nums[i+1] == (val + 5) && Math.abs(nums[i+2] - (val-1)) <= 2)  
      			return true;
  		}
  	return false;
}
}
public class testhas271
{
public static void main(String args[])
	{
	int arr[]={6,2,7,1,6};
	has271 h=new has271();
	System.out.println(h.has271(arr));
	}
}