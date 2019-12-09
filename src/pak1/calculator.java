package pak1;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class calculator {

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		 App.open("Calc.exe");
		 Screen s=new Screen();
		 
		 s.click("C:\\Users\\pc\\herok\\Sikuli\\Pic\\pic1.png");
		 s.click("C:\\Users\\pc\\herok\\Sikuli\\Pic\\pic2.png");
		 s.click("C:\\Users\\pc\\herok\\Sikuli\\Pic\\pic3.png");
		 s.click("C:\\Users\\pc\\herok\\Sikuli\\Pic\\pic4.png");
		 
		 
		 Thread.sleep(3000);
		 
		 App.close("Cale.exe");

	}

}
