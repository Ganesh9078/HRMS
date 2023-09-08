package hrms1;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class TC001_FRAME {
	public static void main(String args[]) throws Exception{
		    //Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		System.out.println("Login completed");
		//Enter into frame
		driver.switchTo().frame("rightMenu");
		//Click on Add button
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(4000);
		System.out.println("New Emp added");
		//Exit from
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		driver.close();
		}
		}