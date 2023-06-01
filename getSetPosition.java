package Basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSetPosition 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		Point p=driver.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
		Point P=new Point(350, 150);
		driver.manage().window().setPosition(P);
		
	}
}
