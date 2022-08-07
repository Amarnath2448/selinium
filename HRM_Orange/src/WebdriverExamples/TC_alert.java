package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
public class TC_alert {
public static void main(String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("login completed");
	Thread.sleep(3000);
	
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	System.out.println("clicked on login button");
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Amarnath");
	driver.findElement(By.id("btnEdit")).click();
	System.out.println("new emp added");
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout is completed");	
	
	driver.close();
	
	
}
}
