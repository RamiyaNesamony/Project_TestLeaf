package salesForce_TestCase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateIndividuals extends baseClass {
/*
 * "Test Steps:
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Individuals from App Launcher
4. Click on the Dropdown icon in the Individuals tab
5. Click on New Individual
6. Enter the Last Name as 'Kumar'
7.Click save and verify Individuals Name"

 */
	@Test
	public  void individualCreation()
	{		
	
	
	WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
	driver.executeScript("arguments[0].scrollIntoView();", scroll);
	WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
	driver.executeScript("arguments[0].click();", individual);
	//doubt inside Individual
	//driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
	driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none']//a)[last()]")).click();
	WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
	driver.executeScript("arguments[0].click();", clk);
	driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys("Ashok");
	driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	//verify Individuals Name
	System.out.println(message);
}
}