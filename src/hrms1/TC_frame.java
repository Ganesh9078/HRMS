package hrms1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_frame {
	public static void main(String args[])throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("login complited");
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("ganesh");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("sanjay");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(4000);
		System.out.println("new emp added");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		driver.close();
	}
	

}
