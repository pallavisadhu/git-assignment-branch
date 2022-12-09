package git.branch_assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Has22 {
	
	public boolean has22(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==2 && a[i+1]==2) {
				return true;
			}
		}
		return false;
	}
	
	
	
	@Test
	public void testCase1() {
		int[] a = {1,2,2};
		Assert.assertTrue(has22(a));
	}
	
	@Test
	public void testCase2() {
		int[] a = {1,2,1,2};
		Assert.assertFalse(has22(a));
	}
	
	@Test
	public void testCase3() {
		int[] a = {2,1,2};
		Assert.assertFalse(has22(a));
	}

}
