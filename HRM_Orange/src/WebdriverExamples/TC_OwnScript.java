package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC_OwnScript {
static String url ="http://183.82.103.245/nareshit/login.php";
static String username ="nareshit";
static String password ="nareshit";
static String title1 = "Orenge HRM- new level of HR mangaement";
static String title2 ="Orange HRM";
public static void main (String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromrdriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to(url);
	if(driver.getTitle().equals(title1)) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("submit")).click();
	Thread.sleep(4000);
	System.out.println("login completed");
	if(driver.getTitle().equals(title2)) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());}
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(3000);
	System.out.println("mourseover completed");
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.name("txtEmpLastName")).sendKeys("selenium");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Amar");
	driver.findElement(By.id("btnEdit")).click();
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Back']")).click();
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
}
