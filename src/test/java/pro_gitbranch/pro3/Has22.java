package pro_gitbranch.pro3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Has22 {
	private boolean has(int[] x) {
		boolean res = false;
		int num = x[0];
		if (x.length < 2) {
			return false;
		}
		for (int i = 1; i < x.length; i++) {
			if (x[i] == num && x[i] == 2 && num == 2) {
				return true;
			} else {
				num = x[i];
			}
		}
		return false;
	}
	@Test
	public void test1() {
		int[] x = { 1, 2, 2, 3 };
		boolean ans = has(x);
		System.out.println(ans);
		Assert.assertEquals(ans, true);
	}

	@Test
	public void test2() {
		int[] x = { 1, 2, 1 };
		boolean ans = has(x);
		System.out.println(ans);
		Assert.assertEquals(ans, false);
	}

	@Test
	public void test3() {
		int[] x = { 2, 1, 2 };
		boolean ans = has(x);
		System.out.println(ans);
		Assert.assertEquals(ans, false);
	}
}
