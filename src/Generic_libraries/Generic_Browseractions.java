package Generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Generic_Browseractions {

	public void Maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void Minimize(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}
	
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}
	
	public void clearCookies(WebDriver driver)
	{
		driver.manage().deleteAllCookies();
	}
	
	public void resize(WebDriver driver)
	{
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
	}
	
	public void dragBrowser(WebDriver driver)
	{
		Point p=new Point(100,200);
		driver.manage().window().setPosition(p);
	}
	
	public void refreshBrowser(WebDriver driver)
	{
		driver.navigate().refresh();
	}

	public void forwordBrowser(WebDriver driver)
	{
		driver.navigate().forward();
	}
	
	public void backwordBrowser(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	public void closeBrowser1(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_C);
	}
	public void closecompleteBrwsr(WebDriver driver)
	{
		driver.quit();
	}
}
