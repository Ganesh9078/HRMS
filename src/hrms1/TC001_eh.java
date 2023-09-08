package hrms1;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
//To access objectInd/Element Loc methods
import org.openqa.selenium.By;




public class TC001_eh {
	public static void main(String args[]) throws Exception{
		  //Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(4000); //Wait sometime
		driver.close();
		 
		}

}
