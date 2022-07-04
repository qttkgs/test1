import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVAHELL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\PACKEGES\\CHROMEDRIVE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");


	}

}
