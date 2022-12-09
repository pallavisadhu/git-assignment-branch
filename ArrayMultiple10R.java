package javaprogrames;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayMultiple10R {
	public int multi10(int[] arr) {

		int largenum = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 10 == 0) && (arr[i] > largenum)) {
				largenum = arr[i];
			}

		}

		return largenum;
	}

	public int sumOfMultiples(int[] arr1, int[] arr2) {

		int num1 = multi10(arr1);
		int num2 = multi10(arr2);

		return num1 + num2;

	}

	@Test
	public void testcase() {
		int arr1[] = { 12, 10, 4 };
		int arr2[] = { 2, 20, 30 };
		int sum = sumOfMultiples(arr1, arr2);
		System.out.println(sum);
		Assert.assertEquals(sum, 40);

	}

}
