package Generic_libraries;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericMethodForDropDown {

	
		public void selectIndex(WebElement ele, int index)
		{
			Select s=new Select(ele);
			s.selectByIndex(index);
		}
		
		public void selectValue(WebElement ele,String Value)
		{
			Select s=new Select(ele);
			s.selectByValue(Value);
		}
		
		public void selectText(WebElement ele, String text)
		{
			Select s=new Select(ele);
			s.selectByVisibleText(text);
		}
		
		public void deselectIndex(WebElement ele, int index)
		{
			Select s=new Select(ele);
			s.deselectByIndex(index);
		}
		
		public void deselectValue(WebElement ele, String value)
		{
			Select s=new Select(ele);
			s.deselectByValue(value);
		}
		
		public void deselectText(WebElement ele, String text)
		{
			Select s=new Select(ele);
			s.deselectByVisibleText(text);
		}
		
		public int countAlloptions(WebElement ele)
		{
			Select s=new Select(ele);
			List<WebElement> allopt = s.getOptions();
			int count=allopt.size();
			return count;
		}
		
		public WebElement firstOption(WebElement ele)
		{
			Select s=new Select(ele);
			WebElement add1 = s.getFirstSelectedOption();
			return add1;
		}
		
		public int selectedOptions(WebElement ele)
		{
			Select s=new Select(ele);
			List<WebElement> selectopt = s.getAllSelectedOptions();
			int count=selectopt.size();
			return count;
		}
		
		
}
