package Generic_libraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_JSE {

	public void JSE(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Point loc = ele.getLocation();
		System.out.println(loc);
		
		int x = loc.getX();
		System.out.println(x);
				
		int y=loc.getY();
		System.out.println(y);
		
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void disableElement(WebDriver driver,WebElement ele, String id,String txt)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('id').value='txt'");
	}
	
	public void clearElement(WebDriver driver,WebElement ele, String id)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('id').value=' '");
	}
}
