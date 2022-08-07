package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
public class TC_Retrieve_Ddown {
	public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://183.82.103.245/nareshit/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	driver.switchTo().frame("rightMenu");
	Thread.sleep(4000);
	
	
    Select st = new Select(driver.findElement(By.id("loc_code")));
    List<WebElement> all = st.getOptions();
    System.out.println("The dropdown options are:");
    for(WebElement options: all) {
    	
    
        System.out.println(options.getText());
    }
    driver.switchTo().defaultContent();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Logout")).click();
    driver.close();

}
}