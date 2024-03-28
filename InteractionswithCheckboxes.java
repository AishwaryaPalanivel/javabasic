package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionswithCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//- Initialize ChromeDriver
				ChromeDriver driver = new ChromeDriver();
				//- Load the URL https://leafground.com/checkbox.xhtml
				driver.get("https://leafground.com/checkbox.xhtml");
				//- Maximize the browser window
				driver.manage().window().maximize();
				//- Add an implicit wait to ensure the web page elements are fully loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//- Click on the "Basic Checkbox.”
				driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();
				//- Click on the "Notification Checkbox."
				driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
				//- Verify that the expected message is displayed.
				if(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed()) {
					System.out.println("Notification is displayed");
				}else {
					System.out.println("Notification is not displayed");
					
				}
				//- Click on your favorite language (assuming it's related to checkboxes).
				driver.findElement(By.xpath("//label[text()='Python']")).click();
				driver.findElement(By.xpath("//label[text()='Javascript']")).click();
				
				//- Click on the "Tri-State Checkbox."
				driver.findElement(By.xpath("(//div[contains(@id,'TriState')]//div)[2]")).click();
				//- Verify which tri-state option has been chosen.
				WebElement stateMsg = driver.findElement(By.xpath("//span[contains(text(),'State has been changed')]"));
				if(stateMsg.isDisplayed()) {
					System.out.println("Tri State is selected");
				}else {
					System.out.println("Tri State is not selected");
				}
		
				//- Click on the "Toggle Switch."
				driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
				//- Verify that the expected message is displayed.
				if(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed()) {
					System.out.println("Toggle Notification is displayed");
				}else {
					System.out.println("Toggle Notification is not displayed");
					
				}
			
				//- Verify if the Checkbox is disabled.
				WebElement isEnab = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]//input"));
				if(isEnab.isEnabled()) {
					System.out.println("Checkbox is enabled");	
					}else {
						System.out.println("Checkbox is disabled");
					}
				//- Select multiple options on the page (details may be needed).
				driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
				driver.findElement(By.xpath("//li[@data-item-value='London']//div[contains(@class,'ui-state-default')]")).click();
				driver.findElement(By.xpath("//li[@data-item-value='Rome']//div[contains(@class,'ui-state-default')]")).click();
				driver.findElement(By.xpath("//a[@aria-label='Close']//span")).click();
				
				WebElement London = driver.findElement(By.xpath("//span[text()='London']"));
				WebElement Rome = driver.findElement(By.xpath("//span[text()='Rome']"));
				if(London.isDisplayed()&&Rome.isDisplayed()) {
					System.out.println("Multiple cities are selected");
				}else {
					System.out.println("Multiple selection is not done");
				}
				//- Perform any additional actions or verifications required.
				//- Close the web browser when done.
				driver.close();

	}

}
