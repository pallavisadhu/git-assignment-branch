import org.testng.Assert;
import org.testng.annotations.Test;
public class ComparingStringsAndCount {

	@Test
	public void comparingStrings()
	{
		/*
		 * BLACK:Given 2 arrays that are the same length containing strings, compare the
		 * 1st string in one array to the 1st string in the other array, the 2nd to the
		 * 2nd and so on.Count the number of times that the 2 strings are non-empty and
		 * start with the same char. The strings may be any length, including 0.
		 */
		String[] st1 = {"aa", "bb", "cc"}, st2 = {"aaa", "xx", "bb"},st3 = {"aaa", "b", "bb"}, st4 = {"", "", "ccc"};
		Assert.assertEquals(1, matchUp(st1,st2));
		Assert.assertEquals(2, matchUp(st1 ,st3));
		Assert.assertEquals(1, matchUp(st1 ,st4));
	}

	public int matchUp(String[] str1, String[] str2) {
		int count =0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]!="" && str2[i]!="")
			{
				if(str1[i].charAt(0)==str2[i].charAt(0))
					count++;
			}
		}
		return count;
	}

	//public int matchUp(String[] str1, String[] str2) {
		
		//return null;
	//}
}
