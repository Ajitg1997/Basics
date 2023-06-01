package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_Quit 
{
      public static void main(String[] args) throws InterruptedException 
      {
		
    	ChromeDriver driver =new ChromeDriver();
  		driver.get("http://www.hyrtutorials.com/p/window-handles-practice.html");
  		Thread.sleep(3000);
		driver.findElement(By.id("newWindowsBtn")).click();
  		System.out.println(driver.getWindowHandles());
		//driver.quit();	

	}
}
