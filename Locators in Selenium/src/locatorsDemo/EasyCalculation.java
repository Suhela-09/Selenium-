package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EasyCalculation {

 WebDriver driver;
     
     @Test
    
     public void EasyCalculationSearch() throws Exception {
    	 driver = new ChromeDriver();
    	 driver.get("https://www.easycalculation.com/");
    	 driver.manage().window().maximize();
    	 driver.findElement(By.xpath("//input[@id='googleSearchId']")).click();
    	 driver.findElement(By.id("googleSearchId")).sendKeys("Chennai");
    	 driver.findElement(By.xpath("//button[@class='search_button']")).click();
    	 Thread.sleep(5000);
    	 driver.findElement(By.xpath("This element is in iframe - //div[@class='gs-title']//a[@class='gs-title'][contains(text(),'Cost of Living in India,')]")).click();
    	 Thread.sleep(5000);
		 driver.quit();}
   

}
