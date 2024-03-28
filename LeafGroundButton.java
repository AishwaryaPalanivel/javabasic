package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LeafGroundButton {
	public static void main(String[] args) throws InterruptedException {
	
	//Launch the Chrome browser
	ChromeDriver driver = new ChromeDriver();
	// Load the url
	driver.get("https://leafground.com/button.xhtml");
	//to maximize the window
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	String title = driver.getTitle();
	if(title.equals("Dashboard")) {
		System.out.println("The title of the page is 'Dashboard'");
	}
	else {
		System.out.println("The title of the page is not changed");
	}
	
	driver.navigate().back();
	Thread.sleep(3000);
	//check if button is disabled
	WebElement eleDisabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button"));
	if(eleDisabled.isEnabled()) {
		System.out.println("Button is enabled");
	}else {
		System.out.println("Button is disabled");
	}
	
	//Find Submit element's position
	WebElement submitPos = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
	System.out.println(submitPos.getLocation());
	
	// Print background color of the button 'Find the Save button color.’'
	WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
	System.out.println(saveButton.getCssValue("background-color"));
	
	//height and width
	WebElement heightWidth = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[2]"));
	Dimension size = heightWidth.getSize();		
	System.out.println(size);
	
	driver.close();
}
}
