package hrms1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TC005FileUplode {
	public static void main(String args[])throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='txtEmpLastName']")).sendKeys("ganesh");
		driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("sanjay");
		WebElement fileinput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		fileinput.sendKeys("C:\\Users\\dalei\\OneDrive\\Pictures\\Camera Roll\\Snapchat-218340929.jpg");
		Thread.sleep(4000);
		System.out.println("photo uplode completed");
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		Thread.sleep(4000);
		System.out.println("New Employed added");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
		
	}