package TestNG;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGClass
{
WebDriver driver = new FirefoxDriver();
@BeforeTest
public void launchapp()
{
//Puts an Implicit wait, Will wait for 10 seconds
// before throwing exception
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Launch website
driver.navigate().to("http://www.calculator.net");
driver.manage().window().maximize();
}
/*
@Test
public void calculatepercent()
{
// Click on Math Calculators
driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
// Click on Percent Calculators
driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
// Enter value 10 in the first number of the percent Calculator
driver.findElement(By.id("cpar1")).sendKeys("10");
// Enter value 50 in the second number of the percent Calculator
driver.findElement(By.id("cpar2")).sendKeys("50");
// Click Calculate Button
driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();
// Get the Result Text based on its xpath
String result=driver.findElement(By.xpath(".//*[@id='content']/p[2]/font/b")).getText();
// Print a Log In message to the screen
System.out.println(" The Result is " + result);
if(result.equals("5"))
{
System.out.println(" The Result is Pass");
}
else
{
System.out.println(" The Result is Fail");
}
}*/
@Test
public void calculatefraction() throws Exception
{
	// Click on Math Calculators
	driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
	// Click on Fractional Calculators
	driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[2]")).click();
	//driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[4]/td/input[2]")).click();
	List<WebElement> rows = driver.findElements(By.xpath("//table[class='panel']/tbody/tr"));
	System.out.println("Total rows - "+ rows.size());
	/*driver.findElement(By.xpath(".//*[@id='t1']")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='b1']']")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='t2']")).sendKeys("3");
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='b2']")).sendKeys("3");
	Thread.sleep(1000);
	String num=driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[1]/td[5]")).getText();
	String den=driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[3]/td[3]")).getText();
	System.out.println(" The Result is:"+num+" / "+den);
	if(num.equals("1")&&den.equals("1"))
	{
	System.out.println(" The Result is Pass");
	}
	else
	{
	System.out.println(" The Result is Fail");
	}	*/
}
/*
@AfterTest
public void terminatetest()
{
driver.close();
}*/
}
