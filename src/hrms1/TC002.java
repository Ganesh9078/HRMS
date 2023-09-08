package hrms1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC002 {
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username ="nerashit";
	static String password ="nerashit";
	static String titel1="OrangeHRM - New Level of HR Management";
	static String titel2="OrangeHRM";
	public static void main(String arg[])throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url); 
		System.out.println("Application open");
		if(driver.getTitle().equals(titel1)) {
			System.out.println("Titel matched");
		}
		else {
			System.out.println("Titel not mached");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.className("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtpassword")).sendKeys(password);
		Thread. sleep(4000);
		driver.findElement(By.name("Sumbit")).click();
		Thread.sleep(4000);
		System.out.println("login complited");
		if(driver.getTitle().equals(titel2)) {
			System.out.println("titel mached");
		}
		else {
			System.out.println("Titel not mached");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("Logout completed");
		driver.close();	
		}
	}
			



