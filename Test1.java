package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args)
	{
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		
	}
}
