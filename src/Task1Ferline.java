
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1Ferline {

	@Test
	public void ferline() throws Exception{
		System.setProperty("webdriver.chrome.driver","chromedriver1011.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("ferlini.it");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit' and@value ='Google Search' ])[2]")).click();
		String sttext= driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
		System.out.println(sttext);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Federico Ferlini Srl']")).click();
		Thread.sleep(2000);
		driver.close();
		
}
	
	
	
}
