package aspire;


import org.openqa.selenium.*; 
import org.openqa.selenium.firefox.FirefoxDriver;
public class Main {
 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.calculator.net/");
			driver.findElement(By.id("calcSearchTerm")).sendKeys("calorrieeee"); 
			
			
			driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("Mugdha");
			
		// Locating elements using ID locator
	        driver.findElement(By.id("calcSearchTerm")).sendKeys("calorrie");

        // Locating elements using XPath locator
	        driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("dfadsf");	       
	        
	        // Locating elements using CSS Selector
	        driver.findElement(By.cssSelector("input#calcSearchTerm"));

        // Locating elements using class name locator
	        driver.findElement(By.className("scifunc"));

	        // Locating elements using name locator
	        driver.findElement(By.name("description"));

	        // Locating elements using link text locator
	        driver.findElement(By.linkText("Mortgage Calculator"));

	        // Locating elements using partial link text locator
	        driver.findElement(By.partialLinkText("Financial"));

        // Locating elements using tag name locator
	        driver.findElement(By.tagName("body"));  
			
	        driver.get("https://www.calculator.net/calorie-calculator.html");
        
        
	        driver.findElement(By.xpath("(//SPAN[@class='rbmark'])[2]")).click();
			

		}


}
