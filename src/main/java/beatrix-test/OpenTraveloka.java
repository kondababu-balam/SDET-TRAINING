import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTraveloka {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","/Users/valencia.beatrix/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.traveloka.com");

        driver.findElement(By.xpath("//button[@data-id='tvat-confirmDiscoverProduct']")).click();

       String title = driver.getTitle();
        if(title.equals("Traveloka.com - The No. 1 solution for all your travel needs")){
            System.out.println("we are in correct page");
        } else{
            System.out.println("Something wrong :(");
        }

        Thread.sleep(2000);
        //click on Transport tab
       driver.findElement(By.xpath("//span[contains(text(),'Transports')]")).click();


        //click flight
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Flights')]")).click();

        //enter origin
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Origin']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Origin']")).sendKeys("Manado");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='TSlys']")).click();

        //enter destination
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Destination']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Destination']")).sendKeys("Ambon");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='TSlys']")).click();
    }
}
