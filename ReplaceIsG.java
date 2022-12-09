package javaprogrames;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceIsG {
	public String rePlace(String s) {

		boolean b = s.contains(" is ");
		System.out.println("boolean value " + b);
		if (b == true) {
			s = s.replace(" is ", " is not ");
			System.out.println("replace string is " + s);

		}

		return s;

	}

	@Test
	public void testcase1() {
		String s = rePlace("This is right");
		System.out.println("new string " + s);
		String actual = "This is right";
		String expected = "This is not right";
		Assert.assertEquals(s, expected);
	}

}
