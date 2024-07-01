package projectpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParentClass extends GrandparentClass
	{
		@BeforeClass
		public void settingUp() 
			{
				driver = new ChromeDriver();
				driver.get(URL);
		 		driver.manage().window().maximize();
			}
	}
