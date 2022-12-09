import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;
public class ScoresSpecial {

	/*
	 * RED:Given two arrays, A and B, of non-negative int scores. A "special" score
	 * is one which is a multiple of 10, such as 40 or 90. Return the sum of largest
	 * special score in A and the largest special score in B. To practice
	 * decomposition, write a separate helper method which finds the largest special
	 * score in an array. Write your helper method after your scoresSpecial() method
	 * in the JavaBat text area.
	 */
	@Test
	public void findingScoresSpecial()
	{
		int[] arr1 = {12, 10, 4}, arr2 = {2, 20, 30};
		Assert.assertEquals(40,scoresSpecial(arr1,arr2));
		int[] arr3 = {20, 10, 4}, arr4 = {2, 20, 10};
		Assert.assertEquals(40,scoresSpecial(arr3,arr4));
		int[] arr5 = {12, 11, 4}, arr6 = {2, 20, 31};
		Assert.assertEquals(20,scoresSpecial(arr5,arr6));
		
	}

	public int scoresSpecial(int[] arr1, int[] arr2)
	{
		
		int score1 = largestSpecialScore(arr1);
		int score2 = largestSpecialScore(arr2);
		int splscore = score1 + score2;
		return splscore;
	}
	public int largestSpecialScore(int[] arr)
	{
		System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        int[] rev= new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
        	rev[j] = arr[i];
        	j++;
        }
		/*
		 * int[] rev = Arrays.stream(arr).boxed() .sorted(Collections.reverseOrder())
		 * .mapToInt(Integer::intValue) .toArray();
		 */
        System.out.println("\nThe sorted array is: ");
        for (int num : rev) {
            System.out.print(num + " ");
        }
        int value =0;
		for(int i=0;i<rev.length;i++)
		{
			if(rev[i]%10 == 0)
			{
				value = rev[i];
				break;
			}
		}
		return value;
	}

}
