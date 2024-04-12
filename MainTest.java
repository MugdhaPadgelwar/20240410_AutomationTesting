package aspire;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;

public class MainTest {
	@BeforeMethod
	  public void beforeMethod() {
	    System.out.println("Before Test");
	  }

	  @AfterMethod
	  public void afterMethod() {
	    System.out.println("After Test");
	  }

	  @Test
	  public void testReverseString() {
	    // Test Case 1: Test with a regular string
	    String input1 = "hello";
	    String expected1 = "olleh";
	    String actual1 = StringUtils.reverseString(input1);
	    System.out.println("Reversed string: " + actual1);
	    Assert.assertEquals(actual1, expected1, "Reversed string is incorrect for input1");

	    // Test Case 2: Test with an empty string
	    String input2 = "";
	    String expected2 = "";
	    String actual2 = StringUtils.reverseString(input2);
	    System.out.println("Reversed string: " + actual2);
	    Assert.assertEquals(actual2, expected2, "Reversed string is incorrect for input2");

	    // Test Case 3: Test with a palindrome
	    String input3 = "racecar";
	    String expected3 = "racecar";
	    String actual3 = StringUtils.reverseString(input3);
	    System.out.println("Reversed string: " + actual3);
	    Assert.assertEquals(actual3, expected3, "Reversed string is incorrect for input3");
	  }

	}

	class StringUtils {
	  
	  public static String reverseString(String str) {
	    StringBuilder reversed = new StringBuilder();
	    for (int i = str.length() - 1; i >= 0; i--) {
	      reversed.append(str.charAt(i));
	    }
	    return reversed.toString();
	  }
  
}
