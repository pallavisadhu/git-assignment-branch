package git.branch_assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxBlock {
	
public int maxBlock(String s) {
		
		int count = 0,t=0;
		
		if(s.length()==0) {
			return 0;
		}
		
		for(int i=0;i<s.length()-1;i++)       
		{
				if(s.charAt(i) == s.charAt(i+1)) 
					count = count + 1;
				else
					count = 1;
				
				if(count > t) {
					t = count;
				}
		}
		
		System.out.println(t);
		return t;

		
	}
	
	
	
	@Test
	public void testCase1() {
		String str = "hoopla";
		int output = maxBlock(str);
		Assert.assertEquals(output, 2);
	}
	
	@Test
	public void testCase2() {
		String str = "abbCCCddBBBxx";
		int output = maxBlock(str);
		Assert.assertEquals(output, 3);

	}
	@Test
	public void testCase3() {
		String str = "";
		int output = maxBlock(str);
		Assert.assertEquals(output, 0);

	}


}
