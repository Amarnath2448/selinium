package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.ArrayList;
public class TC_WindHand {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("file:///D:/Driver/multiplewindows.html");
Thread.sleep(3000);
driver.findElement(By.id("btn1")).click();
Thread.sleep(3000);
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
driver.findElement(By.id("btn3")).click();
Thread.sleep(3000);
ArrayList<String>Windowinfo=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(Windowinfo.get(0));
Thread.sleep(3000);
//driver.close();
driver.quit();	
}
}
