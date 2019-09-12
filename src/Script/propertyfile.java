package Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;





public class propertyfile {
	
	@Test
	public void getData() throws FileNotFoundException, IOException 
	{
		
		
		
	Properties p=new Properties();
	
	p.load(new FileInputStream("./prpty.properties"));
	
	String value = p.getProperty("city");
	System.out.println(value);
	}

}
