package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Frames {
	public static void main(String args[]) throws Exception {
System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println("Application Opened");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);

driver.findElement(By.name("Submit")).click();
System.out.println("Login Completed");
Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
driver.findElement(By.name("txtEmpLastName")).sendKeys("Amar");
driver.findElement(By.id("btnEdit")).click();
driver.switchTo().defaultContent();
Thread.sleep(3000);
System.out.println("Employee details Added");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
driver.close();

	}

}
