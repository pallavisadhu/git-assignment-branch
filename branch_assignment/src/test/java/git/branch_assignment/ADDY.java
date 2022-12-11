package git.branch_assignment;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ADDY {
	
	public ArrayList<String> addY(ArrayList<String> al) {
		
		ArrayList<String> output = new ArrayList<String>();
		if(al.isEmpty()) {
			output.add("");
		}
		for(String s : al) {
			output.add("y"+s+"y");
		
		}
		System.out.println(output);
		return output;
	}
	
	
	
	@Test
	public void testCase1() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		ArrayList<String> actual = addY(al);
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("yay");
		expected.add("yby");
		expected.add("ycy");
		Assert.assertEquals(actual, expected);

	}
	
	@Test
	public void testCase2() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("there");
		ArrayList<String> actual = addY(al);
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("yhelloy");
		expected.add("ytherey");
		Assert.assertEquals(actual, expected);

	}
	@Test
	public void testCase3() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("yay");
		ArrayList<String> actual = addY(al);
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("yyayy");
		Assert.assertEquals(actual, expected);

	}
	
	@Test
	public void testCase4() {
		ArrayList<String> al = new ArrayList<String>();
		al.add(" ");
		ArrayList<String> actual = addY(al);
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("y y");
		Assert.assertEquals(actual, expected);

	}

}
