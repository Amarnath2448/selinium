package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_Verify1 {
static String url ="http://183.82.103.245/nareshit/login.php";
static String username ="nareshit";
static String password = "nareshit";
static String title1 = "OrangeHRM - new level of HR Management";
static String title2 ="Orange HRM";
public static void main(String args[])throws Exception{
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to(url);
if(driver.getTitle().equals(title1)) {
	System.out.println("title mached");}
else {
	System.out.println("title not mached");
	System.out.println(driver.getTitle());
}
driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("log in completed");
if(driver.getTitle().equals(title2)) {
	System.out.println("title mached");}
else {
	System.out.println("title not mached");
	System.out.println(driver.getTitle());}
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout completed");
driver.close();

}
}
