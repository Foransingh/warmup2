class arrayFront9
{
	public boolean arrayFront9(int[] nums) 
	{
  		int end = nums.length;
  		if (end > 4) end = 4;
  		for (int i=0; i<end; i++) 
		{
    		if (nums[i] == 9) return true;
  		}
  
  	return false;
	}
}

public class testarrayFront9
{
public static void main(String args[])
	{
	int []nums1={1,3,9,0,1};
	arrayFront9 a=new arrayFront9();
	System.out.println(a.arrayFront9(nums1));
	}
}