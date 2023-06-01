package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSetSize 
{
	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		Dimension Size = driver.manage().window().getSize();
		System.out.println("Window Size : "+driver.manage().window().getSize());
		Dimension d=new Dimension(300,250);
		driver.manage().window().setSize(d);
	}
}
