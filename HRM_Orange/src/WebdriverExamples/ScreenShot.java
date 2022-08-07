package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenShot {
public static void main(String args[])throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	try {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		WebElement element= driver.findElement(By.linkText("PIM"));
		Actions action =new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee1")).click();
		Thread.sleep(3000);
		System.out.println("clicked add submenu");
		driver.findElement(By.linkText("Logout")).click();
	}
	catch(Exception e) {
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("D:\\TestResults.jpg"));
		
	}
	driver.quit();
}
}
