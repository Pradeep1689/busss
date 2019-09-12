package Generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Generic_Popup {

	public void alert_popup_Ok(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		a.accept();
	}

	public void alertConfrm_popup_Text(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		String txt=a.getText();
		System.out.println(txt);
	}
	
	public void confrmation_popup_Ok(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		a.accept();
		String txt=a.getText();
		System.out.println(txt);
	}
	
	public void confrmation_popup_Cancel(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}

	
	public void child_popup(WebDriver driver)
	{
		String pid = driver.getWindowHandle();
		System.out.println(pid);

		Set<String> allid = driver.getWindowHandles();
		
		for(String we:allid)
		{
			driver.switchTo().window(we);
			System.out.println(driver.getTitle());
		}
	}
	
	public void child_popup_close(WebDriver driver)
	{

		String pid = driver.getWindowHandle();
		System.out.println(pid);

		Set<String> allid = driver.getWindowHandles();
		
		allid.remove(pid);
		for(String we:allid)
		{
			driver.switchTo().window(we);
			driver.close();
		}
	}

	public void close_parent_popup(WebDriver driver)
	{
		String pid = driver.getWindowHandle();
		System.out.println(pid);

		Set<String> allid = driver.getWindowHandles();
		
		allid.remove(pid);
		for(String we:allid)
		{
			driver.switchTo().window(we);
			if(pid.equals(we))
			{
				driver.close();
			}
		}
	}

	
	public void window_popup(WebDriver driver, String path) throws IOException
	{
		Runtime.getRuntime().exec(path);
	}
	
	public void filedownloadPopup(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
}
