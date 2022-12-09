import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayNextTwo {
	//BLUE:Given an array of ints, return True if the array contains a 2 next to a 2 somewhere.
	@Test
	public void arrayNext2()
	{
		int[] a1 = {1, 2, 2};
		int[] a2 = {1, 2, 1, 2};
		int[] a3 = {2, 1, 2};
		Assert.assertEquals(true,has22(a1));
		Assert.assertEquals(false,has22(a2));
		Assert.assertEquals(false,has22(a3));
	}
	public boolean has22(int[] arr)
	{
		boolean b = false;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==2 && arr[i+1]==2)
				b=true;
		}
		return b;
		
	}
}
