package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class JSE {
public static void main(String args[])throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://183.82.103.245/nareshit/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	WebElement loginbtn =driver.findElement(By.name("Submit"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",loginbtn);
	Thread.sleep(4000);
System.out.println("log in completed");
WebElement logoutbtn=(driver.findElement(By.linkText("Logout")));
JavascriptExecutor executor1=(JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();",logoutbtn);
Thread.sleep(4000);
System.out.println("logout complrted");
driver.quit();

	
	
	
	
	
	
	
}
}
