package pro_gitbranch.pro4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialScore {

	private int max(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 10 == 0 && a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
		return max;
	}
	@Test
	public void test1() {
int[] a= {11,12,20};
int[] b= {20,30,40};
int ans=max(a)+max(b);
int exp=60;
System.out.println(ans);
Assert.assertEquals(ans, exp);
	}

	@Test
	public void test2() {
		int[] a = { 20, 10, 4 };
		int[] b = { 2, 20, 10 };
		int ans = max(a) + max(b);
		int exp = 40;
		System.out.println(ans);
		Assert.assertEquals(ans, exp);
	}

	@Test
	public void test3() {
		int[] a = { 12, 11, 4 };
		int[] b = { 2, 20, 31 };
		int ans = max(a) + max(b);
		int exp = 20;
		System.out.println(ans);
		Assert.assertEquals(ans, exp);
	}
}
