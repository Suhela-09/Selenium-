package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EaseMyTripRadioButtons {
	@Test
	public void TestRadioButton() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gad_campaignid=788997081&gbraid=0AAAAADo_0-jGIZEZAW_2Yz6jiDLFY0pRS&gclid=Cj0KCQjwnJfEBhCzARIsAIMtfKLt5pW9NrkOWtkBeQhoEGkYu_WdCcJI2AcreHJDUgwHZI1YnKAhgVYaAtReEALw_wcB");
		
		int radiobutton = driver.findElements(By.xpath("(//input[@type='radio'])")).size();
	    System.out.println("Number Of Radio Buttons...." + radiobutton);
	    driver.quit();
	}

}
