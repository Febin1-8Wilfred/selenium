package projectpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GrandparentClass 
	{
		WebDriver driver;
		static final String URL                 = "https://www.healthsherpa.com/?_agent_id=ammer-cabrera-c4_hbw";
		
		static final String xPathForZipcode     = "//input [@type = 'tel' and @name = 'zip_code']";
		static final String zipCode			    = "33430";
		
		static final String xPathForName        = "//input [@type = 'text' and @name = 'name']";
		static final String name			    = "Claudio";
		
		static final String xPathForEmail       = "//input [@type = 'text' and @name = 'email']";
		static final String email			    = "claudiogardok@gmail.com";
		
		static final String xPathForPhoneNumber = "//input [@type = 'tel' and @name = 'phone']";
		static final String phoneNumber		    = "(340)422-2380";
		
		static final String xPathForSeePlans    = "//body/div[@id='wrap']/div[@id='main']/div[@id='agent-index']/div[@id='hero-agent']/div[2]/div[2]/form[1]/div[5]/button[1]";
		
		
		
		static final String xPathForAge         = "//input[@id='mui-1']";
		static final String age		            = "65";
		
		static final String gender        		= "Female";
		static final String xPathForGender	    = "//button[contains(text(),'+gender+')]";
		
		static final String xPathForEligibility = "//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]";
		
		static final String xPathForAddMySpouse = "//button[contains(text(),'+gender+')]";
		int size, i;
		public void forms(WebDriver driver) throws InterruptedException
			{
				driver.findElement(By.xpath(xPathForZipcode)).sendKeys(zipCode);
				driver.findElement(By.xpath(xPathForName)).sendKeys(name);
				driver.findElement(By.xpath(xPathForEmail)).sendKeys(email);
				driver.findElement(By.xpath(xPathForPhoneNumber)).sendKeys(phoneNumber);
				driver.findElement(By.xpath(xPathForSeePlans)).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(xPathForAge)).sendKeys(age);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[contains(text(),'Male')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[3]/div[3]/div[1]/span[1]/span[1]/label[1]/div[1]/span[1]")).click();
				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[contains(text(),'Add my spouse')]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("30");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[3]/div[3]/div[1]/span[1]/span[1]/label[1]/div[1]/span[1]")).click();
//				driver.findElement(By.xpath("//button[contains(text(),'Add a dependent')]")).click();
//				driver.findElement(By.xpath("//input[@id='mui-3']")).sendKeys("18");
//				driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
//				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[3]/div[1]/span[1]/span[1]/label[1]/div[1]/span[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
				
				driver.findElement(By.xpath("//input[@id='mui-4']")).sendKeys("15000");
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/span[1]/span[1]/label[1]/div[1]/span[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[10]/div[2]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'Start application')]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='temp']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/label[1]/span[1]/input[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='temp']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/label[1]/span[1]/input[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/div[@id='temp']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Claudio");
				
				driver.findElement(By.xpath("//button[@id='page-nav-on-next-btn']")).click();
				Thread.sleep(10000);
//				driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Claudio");
//				driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("Gardo Canizarez");
//				driver.findElement(By.xpath("//input [@type = 'text' and @aria-label = 'Date of birth ']")).click();
//				driver.findElement(By.xpath("//input [@type = 'text' and @aria-label = 'Date of birth ']")).sendKeys("05171959");
//				driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]/button[1]")).click();
//				driver.findElement(By.xpath("//button[@id='page-nav-on-next-btn']")).click();
//				Thread.sleep(10000);
//				driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test address 1");
//				driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test");
////				Thread.sleep(2000);
////				driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
////				Thread.sleep(2000);
////				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div/div/div[3]/div/div/div/form/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/input")).sendKeys("Alaska",Keys.ENTER);
//				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div/div/div[3]/div/div/div/form/div[2]/div/div/div[4]/div/div/div/div/div[2]/button")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//button [contains (@class, 'btn layouts')]")).click();
//				driver.findElement(By.xpath("//button [contains (text(), 'Continue')]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//input [@placeholder = '(XXX) XXX-XXXX']")).click();
//				driver.findElement(By.xpath("//input [@placeholder = '(XXX) XXX-XXXX']")).sendKeys("9876543210");
//				driver.findElement(By.xpath("//span [contains (text(), 'Send me paper notices in the mail')]")).click();
//				driver.findElement(By.xpath("//button [contains (text(), 'Continue')]")).click();
				
			}
	}

//xPath for SSN: 
//	*[@id="mui-4"]
//	/html/body/div[2]/div[3]/div/div/div/div/div/div/div/div[3]/div/div/div/form/div[2]/div/div/div[2]/div/div[3]/div/fieldset/div[1]/div/div/div/input

// //body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/label[1]

//Send me emails and text:
// //body/div[@id='wrap']/div[@id='main']/div[@id='temp']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/span[1]/button[1]/label[1]/div[1]/span[1]

//Email me:
// //body/div[@id='wrap']/div[@id='main']/div[@id='temp']/div[@id='react-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/label[1]/div[1]/span[1]
