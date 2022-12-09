package git.branch_assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScoresSpecial {
	
	public int scoresSpecial(int[] a,int[] b) {
		return max(a) + max(b);
		
	}
	
	private int max(int[] n) {
		int high = 0;
		for (int i = 0; i < n.length; i++) {
		if (n[i] > high && n[i] % 10 == 0) {
		high = n[i];
		}
		}
		return high;
	}

	@Test
	public void testCase1() {
		int a[]= {12,10,4};
		int b[]= {2,20,30};
		Assert.assertEquals(scoresSpecial(a,b),40);
		
	}
	@Test
	public void testCase2() {
		int a[]= {20,10,4};
		int b[]= {2,20,10};
		Assert.assertEquals(scoresSpecial(a,b),40);
		
	}
	@Test
	public void testCase3() {
		int a[]= {12,11,4};
		int b[]= {2,20,31};
		Assert.assertEquals(scoresSpecial(a,b),20);
		
	}
	

}
