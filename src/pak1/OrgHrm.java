package pak1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class OrgHrm {

	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		
		 WebDriver driver =new ChromeDriver();
		 driver.get("http://orangehrm.uftselenium.com");
		 Thread.sleep(6000);
		 
		 Screen s=new Screen();
		 
		 s.type("C:\\Users\\pc\\herok\\Sikuli\\Pic\\img1.png", "sreekanthsreekanth4");
		 s.type("C:\\Users\\pc\\herok\\Sikuli\\Pic\\img2", "sreekanth@123324");
		 s.click("C:\\Users\\pc\\herok\\Sikuli\\Pic\\img3");
		 
		 
		 
		 

	}

}
