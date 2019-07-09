package pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class hotelSearchPage{
	
	WebDriver driver;
	long startTime=0;
	
	long endTime=0;
	
	
	By hotelslink = By.xpath("//span[text()='Hotels']");
	By hoteldestinationvalue = By.xpath("//input[@type='text'][@data-id='hotelDestination']");
	By selecthotelfromlist = By.className("_2LpZW");
	By guestandroomsfeild = By.xpath("//input[@type='text'][@value='1 guest, 1 room']");
	By increaseguestcount = By.xpath("(//div[@class='_856b_'])[2]");
	By increaseroomcount = By.xpath("(//div[@class='_856b_'])[4]");
	By donelink = By.xpath("//span[@class='_1bxVQ']");
	By durationdropdown= By.xpath("//input[@type='text'][@data-id='durationOfNights']");
	By selectdurationofnights = By.xpath("//div[@data-id='durationOfNights-2']");
	By searchbutton =By.xpath("(//button[@type='button'])[5]");
	By hotelselect = By.xpath("//div[@class='_1z5je _10ZQX tvat-hotelName']");
	By booknowhotel = By.xpath("(//button[@data-id='hotelBookRoomBtn'])[1]");
	By entercontactname = By.xpath("//input[@name='contactName']");
	By enterphonenumber = By.xpath("//input[@name='contactPhone']");
	By entercontactemail = By.xpath("//input[@name='contactEmail']");
	By enterguestname = By.xpath("//input[@name='guestName']");
	By continuetoreview = By.xpath("//div[@class='_3JGHc']");
	By clcikoncorrectbutton = By.xpath("//button[@data-id='mainButton']");
	By clcikoncontinuepaymentbutton = By.xpath("//button[@data-id='submitBtn']");
	

	 public  void enterHotelsearchDetails() throws InterruptedException
	 {
		 
		
		 System.setProperty("webdriver.chrome.driver","/Users/kondababu/Downloads/chromedriver 3");
		 driver = new ChromeDriver();
		 driver.get("https://www.traveloka.com/en-id/hotel");
	 	
	 	driver.findElement(hoteldestinationvalue).click();
	 	driver.findElement(hoteldestinationvalue).sendKeys("Singapore");
	 	Thread.sleep(5000);
	 	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	 	driver.findElement(selecthotelfromlist).click();
	 	//hoteldestinationvalue.sendKeys("Singapore");	
	 }
	 	
	 	 public  void selectGuestsAndRooms() throws InterruptedException
		 {
	 	driver.findElement(guestandroomsfeild).click();
	 	driver.findElement(increaseguestcount).click();
	 	driver.findElement(increaseroomcount).click();
	 	driver.findElement(donelink).click();
		 }
	 	 
	public void selectDurationAndContinue() throws InterruptedException
	 	 {
	 	driver.findElement(durationdropdown).click();
	 	driver.findElement(selectdurationofnights).click();
	 	driver.findElement(searchbutton).click();
	 	
	 	Thread.sleep(5000);
	 }

	 public void selecthotel() throws InterruptedException {
	 	
		driver.findElement(hotelselect).click();
	 	String mainWindow=driver.getWindowHandle();
	 	 // It returns no. of windows opened by WebDriver and will return Set of Strings
	 	 Set<String> set =driver.getWindowHandles();
	 	 // Using Iterator to iterate with in windows
	 	 Iterator<String> itr= set.iterator();
	 	 while(itr.hasNext()){
	 	 String childWindow=itr.next();
	 	    // Compare whether the main windows is not equal to child window. If not equal, we will close.
	 	 if(!mainWindow.equals(childWindow)){
	 	 driver.switchTo().window(childWindow);
	 	 System.out.println(driver.switchTo().window(childWindow).getTitle());
	 	 
	 	 driver.findElement(booknowhotel).click(); 
	 	 Thread.sleep(5000);
	 	 driver.findElement(entercontactname).click(); 
	 	 driver.findElement(entercontactname).sendKeys("myname");
	 	 driver.findElement(enterphonenumber).click(); 
	 	 driver.findElement(enterphonenumber).sendKeys("81249338155");
	 	 driver.findElement(entercontactemail).click();
	 	 driver.findElement(entercontactemail).sendKeys("test@traveloka.com");
	 	 driver.findElement(enterguestname).click();
	 	 driver.findElement(enterguestname).sendKeys("myfullname");
	      Thread.sleep(3000);
	 	 driver.findElement(continuetoreview).click();
	 	 Thread.sleep(3000);
	 	 driver.findElement(clcikoncorrectbutton).click();
	 	 Thread.sleep(3000);
	 	 driver.findElement(clcikoncontinuepaymentbutton).click();
	 	 Thread.sleep(3000);
	 	 driver.close();
	 	 }
	 	 }
	 	 // This is to switch to the main window
	 	driver.switchTo().window(mainWindow);
	 	driver.close();
	 	endTime=System.currentTimeMillis();
	 	long timeElapsed=endTime-startTime;
	 	System.out.println("Total Execution time: " + timeElapsed + " milli seconds");
	 }
	 	
	 }


Public void test()
{
println("test")
}
}


public void testgit(){
	println("testgitnih")
		}




public void trainingsdetbatch2()
		{
			println("well");
		}



		public testing();


