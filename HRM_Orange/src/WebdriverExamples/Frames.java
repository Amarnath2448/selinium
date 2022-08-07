package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Frames {
public static void main(String args[])throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("log in completed");
Thread.sleep(9000);
//to enter frame
driver.switchTo().frame("rightMenu");
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
driver.findElement(By.name("txtEmpLastName")).sendKeys("harika");
driver.findElement(By.name("txtEmpFirstName")).sendKeys("pasumarthi");
driver.findElement(By.name("txtEmpNickName")).sendKeys("chinni");
Thread.sleep(7000);
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(5000);
System.out.println("newemp detalis added");
//exit frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("lod out completed");
driver.close();




	
}

}
