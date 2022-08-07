package WebdriverExamples;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

public class TC_DragDrop {
public static void main(String args[])throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(3000);
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("title matched");
	driver.switchTo().frame(0);
	Actions ac =new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.className("ui-widget-content")), driver.findElement(By.id("droppable"))).perform();
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	driver.quit();
	
	
}
}
