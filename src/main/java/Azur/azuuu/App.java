package Azur.azuuu;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


  //Hell 
//pulll
public class App 
{
    public static void main( String[] args )
    {
    	 System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    	WebDriver driver = new ChromeDriver();
		
	    
	    	//WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://bit-albania.com/upt6.php");
         driver.findElement(By.id("username")).sendKeys("Dejvis Muka");
         driver.findElement(By.id("password")).sendKeys("xe30");
         driver.findElement(By.xpath("//*[@id=\"kokaEpalevizshme\"]/input[4]")).click();
         String a= driver.findElement(By.xpath("//*[@id=\"MesPond\"]")).getText();
      
         char b=a.charAt(28);
         	System.out.println("Kredite "+b);
         driver.quit();
    }
    
}
