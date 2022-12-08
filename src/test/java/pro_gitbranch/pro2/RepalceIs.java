package pro_gitbranch.pro2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RepalceIs {

	private String replaceis(String str) {
		String result = "";

		int len = str.length();

		for (int i = 0; i < len; i++) {

			if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))

					|| i + 2 < len && Character.isLetter(str.charAt(i + 2))) {

				result += str.charAt(i);

			}

			else if (i + 1 < len && str.substring(i, i + 2).equals("is")) {

				result += "is not";
		
		      i++;

			}

			else
				result += str.charAt(i);

		}

		return result;

		}


	@Test
	public void test1() {
		String str = "is test";
		String ans = replaceis(str);
		System.out.println(ans);
		String exp = "is not test";
		Assert.assertEquals(ans, exp);
	}

	@Test
	public void test2() {
		String str = "This  test";
		String ans = replaceis(str);
		System.out.println(ans);
		String exp = "This test";
		Assert.assertEquals(ans, exp);
	}

	@Test
	public void test3() {
		String str = "this is right";
		String ans = replaceis(str);
		System.out.println(ans);
		String exp = "this is not right";
		Assert.assertEquals(ans, exp);
	}

	@Test
	public void test4() {
		String str = "is is";
		String ans = replaceis(str);
		System.out.println(ans);
		String exp = "is not is not";
		Assert.assertEquals(ans, exp);
	}
}
