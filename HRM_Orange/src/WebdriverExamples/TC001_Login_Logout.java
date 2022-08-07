package WebdriverExamples;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class TC001_Login_Logout {
public static void main(String args[])throws Exception {
System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver object=new ChromeDriver();
object.navigate().to("http://183.82.103.245/nareshit/login.php/");
Thread.sleep(3000);
object.close();


}
}
