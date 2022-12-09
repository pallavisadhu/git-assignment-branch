package javaprogrames;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayHas2B {
	public boolean arrayHas2(int[] arr) {

		Boolean match = false;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == 2 && arr[i + 1] == 2) {

				match = true;
				break;

			}

		}
		return match;

	}

	@Test
	public void testcase1() {
		int[] arr1 = { 1, 2, 2 };
		boolean b = arrayHas2(arr1);
		System.out.println(b);
		Assert.assertEquals(b, true);

	}

	@Test
	public void testcase2() {
		int[] arr1 = { 2, 1, 2 };
		boolean b = arrayHas2(arr1);
		System.out.println(b);
		Assert.assertEquals(b, false);

	}

}
