package hrms1;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WindowHandlers {
	public static void main(String args[])throws Exception {
		 WebDriver driver= new FirefoxDriver();
		  driver.get("file:///D:/multiplewindows.html");
		  Thread.sleep(2000);
		  driver.findElement(By.id("btn2")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("btn3")).click();
		  Thread.sleep(2000);
		  ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
		  driver.switchTo().window(windinfo.get(0));
		  Thread.sleep(2000);
		 // driver.close();
		  driver.quit();
	}

}
