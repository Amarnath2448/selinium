package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class FileUpload {
public static void main(String args[])throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completeted");
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("Amar");
	driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Amar");
	WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
	fileInput.sendKeys("C:\\Users\\AmarV\\OneDrive\\Pictures\\Saved Pictures\\flower.jpg");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='button'][@value='Save']")).click();
	System.out.println("fileupload is sucessfully");
	Thread.sleep(3000);
	System.out.println("new emp added");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
	
	
	
}
}
