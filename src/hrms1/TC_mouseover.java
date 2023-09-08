package hrms1;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class TC_mouseover {
	public static void main(String args[])throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Login completed");
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("mouseover completed");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(4000);
	System.out.println("Clicked on submenu");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4000);
	
	System.out.println("Logout completed");
	driver.close();
	
	
	}
	
}

