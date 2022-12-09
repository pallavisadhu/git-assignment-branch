import org.testng.Assert;
import org.testng.annotations.Test;
public class ReplacingWord {

	@Test
	public void replacingWordIs()
	{
		Assert.assertEquals("is not test",notReplace("is test"));
		Assert.assertEquals("is not-is not",notReplace("is-is"));
		Assert.assertEquals("This is not right", notReplace("This is right"));
		
	}

	public String notReplace(String str) {
		String output = "";
		str = " " + str + "  ";
		for(int i=0; i <=str.length()-2; i++) {
			if(str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1))
	                  && !Character.isLetter(str.charAt(i+2)))
	    {
	      output= output+ "is not";
	      i = i+1;
	    }
	    else {
	      output= output+ str.charAt(i);
	    }
	  }
	  return output.substring(1,output.length()-1);
		
	}
	
}
