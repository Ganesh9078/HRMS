package hrms1;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//To access objectInd/Element Loc methods
import org.openqa.selenium.By;


public class TC001 {
	public static void main(String args[]) throws Exception{
	      //Test Steps
	  WebDriver driver = new ChromeDriver();
	  
	  driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	  Thread.sleep(4000); //Wait sometime
	  System.out.println("Application Opened");
	  driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	  driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	  Thread.sleep(3000);
	  driver.findElement(By.name("Submit")).click();
	  Thread.sleep(3000);
	  System.out.println("Login completed");
	  driver.findElement(By.linkText("Logout")).click();
	  System.out.println("Logout completed");
	  Thread.sleep(3000);
	  driver.close();
	}
}
