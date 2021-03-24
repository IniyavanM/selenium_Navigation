package navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.remote.DesiredCapabilities;

public class TestNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome-Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("quality analyst");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("I am quality analyst");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
