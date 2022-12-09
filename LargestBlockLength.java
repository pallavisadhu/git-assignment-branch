import org.testng.Assert;
import org.testng.annotations.Test;
public class LargestBlockLength {
	//Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

	@Test
	public void blockLength()
	{
		String str = "abbCCCddBBBxx";
		Assert.assertEquals(2, maxBlock(str));
	}

	public int maxBlock(String str) {
		int count=0,max=0;
		for(int i=0; i<str.length(); i++)
		{
			if(i==0){
				count++;
				max = count;
			}
			else
			{
				if(str.charAt(i)==str.charAt(i-1))
				{
					count++;
					if(max<count)
							max = count;
				}
					
				else
				{
					count = 1;
				}
			}
				
		}
			
		return max;

	}

}
