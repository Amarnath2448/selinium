package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_Verify {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
if(driver.getTitle().equals("Orange HRM-New Level of HR Mangement")){
System.out.println("title  matched");
}
else {
	System.out.println("title not matched");
	System.out.println(driver.getTitle());
	
}

driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("log in completed");

if(driver.getTitle().equals("Orange HRM")) {
	System.out.println("Title is matched");
}
else {
	System.out.println("title is not matched");
	System.out.println(driver.getTitle());}
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("log out completed");
driver.close();
}
}



