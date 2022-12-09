package git.branch_assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotReplace {
	
	public String noReplace(String s) {
		String result = "";
		int len = s.length();
		for(int i = 0; i < len; i++){
			if(i-1 >= 0 && Character.isLetter(s.charAt(i-1))
					|| i+2 < len && Character.isLetter(s.charAt(i+2))) {
				result += s.charAt(i);
			}
			else if(i+1 < len && s.substring(i, i+2).equals("is")) {
				result += "is not";
				i++;
			}
			else result += s.charAt(i);
		}
		return result;

	}
		
	
	@Test
	public void testCase1() {
		String str = "is test";
		Assert.assertEquals(noReplace(str),"is not test");
		
	}
	
	@Test
	public void testCase2() {
		String str = "is-is";
		Assert.assertEquals(noReplace(str),"is not-is not");
		
	}
	
	@Test
	public void testCase3() {
		String str = "This is right";
		Assert.assertEquals(noReplace(str),"This is not right");
		
	}

}
