package Generic_libraries;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Generic_WebElements {
	
	public void sendData(WebElement ele, String txt)
	{
		ele.sendKeys(txt);
	}

	public Point location(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		
		int x = loc.getX();
		System.out.println(x);
				
		int y=loc.getY();
		System.out.println(y);
		return loc;
	}
	
	public String toolTip(WebElement ele, String value)
	{
		String tooltip = ele.getAttribute(value);
		System.out.println(tooltip);
		return tooltip;
		
	}
	
	public String CssValue(WebElement ele, String value)
	{
		String txt = ele.getCssValue(value);
		System.out.println(txt);
		return txt;
		
	}
	
	public void clickElement(WebElement ele) 
	{
			ele.click();
	}
	
	
	
	
}
