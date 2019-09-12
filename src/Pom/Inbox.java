package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inbox {
	
	@FindBy(xpath="(//div[.='Compose'])[2]")
	private WebElement cmp;
	
	@FindBy(xpath="//textarea[@name='to' and @role='combobox']")
	private WebElement to;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement sub;
	
	@FindBy(xpath="(//div[.='Send'])[2]")
	private WebElement send;
	
	public Inbox(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void compose()
	{
		cmp.click();
	}
	public void to(String recp)
	{
		to.sendKeys(recp);
	}
	public void sub(String subject)
	{
		sub.sendKeys(subject);
	}
	public void send()
	{
		send.click();
	}
	
	
	
	
	
	

}
