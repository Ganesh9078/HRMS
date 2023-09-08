package hrms1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class EX_001 {
	public static void main(String args[])throws Exception {
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(4000);
		System.out.println("open application");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(4000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("login complited");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4000);
	System.out.println("logout complited");
	driver.close();
	}
	


}
