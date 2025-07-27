package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoID {
     WebDriver driver;
     
     @Test
    
     public void DemoTestID() throws Exception {
    	 driver = new ChromeDriver();
    	 driver.get("https://auth.hollandandbarrett.com/u/login?state=hKFo2SBxM1RwRG1DMFBMdmNnWW1hZ3o5ajNPRERLRjZnb0hHMKFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIHJQSDdicWNlN2NYbnhoV1hkdUtCVGM2ajZFSVR1bkFyo2NpZNkgSmwzRWF2a010RDNpcjhLOTNSTlM4TldBVVFKcks4bnI");
    	 driver.manage().window().maximize();
    	 driver.findElement(By.id("username")).sendKeys("suhela");
    	 driver.findElement(By.name("password")).sendKeys("Password@1");
    	 driver.findElement(By.xpath("//button[@name='action']")).click();
         Thread.sleep(5000);
		 driver.quit();}
   
	

}
