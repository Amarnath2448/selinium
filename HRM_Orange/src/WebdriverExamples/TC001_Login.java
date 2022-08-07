package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC001_Login {
public static void main(String args[])throws Exception {
System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://opensource-demo.orangehrmlive.com");
Thread.sleep(7000);
driver.close();
}
}
