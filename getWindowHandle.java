package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.id("newWindowBtn")).click();
		System.out.println(driver.getWindowHandle());		

	}
}
