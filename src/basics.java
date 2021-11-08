import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{
	
	public static void main(String[] args) throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath //tagname[@attribute='value'] here tagName use Class value
		
		//driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
		//driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementById("android:id/title").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("SomAyan");
		driver.findElementById("android:id/button1").click();
		
	}
	

}
