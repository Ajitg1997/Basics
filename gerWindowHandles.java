package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gerWindowHandles 
{
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.hyrtutorials.com/p/window-handles-practice.html");
		System.out.println(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.findElement(By.id("newWindowBtn")).click();
		System.out.println(driver.getWindowHandles());
		
		driver.findElement(By.id("newWindowsBtn")).click();
		System.out.println(driver.getWindowHandles());
		
		

	}
}
