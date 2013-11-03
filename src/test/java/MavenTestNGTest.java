import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MavenTestNGTest 
{
ChromeDriver driver=new ChromeDriver();
@BeforeTest
public void star()
{
driver.get("http://www.facebook.com");	
}
@AfterTest
public void end()
{
driver.quit();	
}
@Test
public void testsignup()
{
driver.findElement(By.id("u_0_0")).sendKeys("asad");	
}
}
