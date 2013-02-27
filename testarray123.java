class array123
{
	public boolean array123(int[] nums) 
	{
  		for(int i=0;i<(nums.length-2);i++)
     		{
       			if(nums[i]==1&&nums[i+1]==2 && nums[i+2]==3)
        		return true;
     		}
 
  		return false;
	}
}
public class testarray123
{
public static void main(String args[])
	{
	int []arr={5,1,2,3,4};
	array123 a=new array123();
	System.out.println(a.array123(arr));
	}
}