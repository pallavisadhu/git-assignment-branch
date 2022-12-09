package javaprogrames;

import org.testng.annotations.Test;

public class LargestBlockV {

	public int maxblock(String s) {
		int currentlen = 1;
		int longestlen = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				// currentlen = s.charAt(i);
				currentlen++;
			} else {
				if (currentlen > longestlen) {
					longestlen = currentlen;
				}
				currentlen = 1;
			}

		}
		return longestlen;

	}

	@Test
	public void testcase1() {

		int num1 = maxblock("aaaaabbcccccccccdd");

		System.out.println("the length of longest block " + num1);

	}

}
