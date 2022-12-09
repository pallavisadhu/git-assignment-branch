package pro_gitbranch.pro1;

import org.testng.annotations.Test;

public class LargestBlock {
	private int maxBlock(String str) {
		int len = str.length();

		int count = 0;

		int tmpcount = 1;

		if (len == 0)
		{
			return 0;

		}

		for (int i = 0; i < len; i++) {

			if (i < len - 1 && str.charAt(i) == str.charAt(i + 1))
			{
				tmpcount++;
			}
			else
			{
				tmpcount = 1;
			}
			if (tmpcount > count)
				{count = tmpcount;
				}
		}

		return count;

		}


	@Test
	public void test1() {
		String str = "hooplao";
		int ans = maxBlock(str);
		System.out.println(ans);
	}

}
