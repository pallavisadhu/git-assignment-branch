package git.branch_assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatchUp {
	
	public int matchUp(String[] a, String[] b) {
	int count=0;
	  for(int i=0;i<a.length;i++){
		     String t1 = a[i];
		     String t2 = b[i];
		     if(!t1.equals("") && !t2.equals("")) {
		       if(t1.charAt(0)==t2.charAt(0)){
		         count++;
		       }
		     }
		    
		  }
		  return count;
		}
	
	@Test
	public void testCase1() {
		String[] a = {"aa","bb","cc"};
		String[] b = {"aaa","xx","bb"};
		Assert.assertEquals(matchUp(a,b), 1);
		
	}
	
	@Test
	public void testCase2() {
		String[] a = {"aa","bb","cc"};
		String[] b = {"aaa","b","bb"};
		Assert.assertEquals(matchUp(a,b), 2);
		
	}
	@Test
	public void testCase3() {
		String[] a = {"aa","bb","cc"};
		String[] b = {"","","ccc"};
		Assert.assertEquals(matchUp(a,b), 1);
		
	}

}
