package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/");
		//to maximize the window
		driver.manage().window().maximize();
		//- Enter the username.//	- Enter the password.
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
		//- Click the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		//- Click the "crm/sfa" link.
		driver.findElement(By.partialLinkText("CRM")).click();
		//- Click the "Leads" link.
		driver.findElement(By.linkText("Leads")).click();
		//- Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
		//- Click on the "Phone" tab.
		driver.findElement(By.linkText("Phone")).click();
		//- Enter the phone number.
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("108");
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");

		//- Click the "Find leads" button.
		driver.findElement(By.linkText("Find Leads")).click();
		//- Capture the lead ID of the first resulting lead.
		String LeadID = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')])[1]//a")).getText();
		System.out.println(LeadID);
		//- Click the first resulting lead.
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')])[1]//a")).click();
		if(driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed()) {
			System.out.println("Record is deleted");
		}
		else {
			System.out.println("Record is not deleted");
		}
		
		driver.close();
		

	}

}
