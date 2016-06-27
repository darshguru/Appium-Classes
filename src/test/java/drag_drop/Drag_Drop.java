package drag_drop;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Drag_Drop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("deviceName", "Darsh Mi 4i");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0,2");
		
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		Thread.sleep(10000);

		driver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();
		Thread.sleep(10000);
		
		
		List<WebElement> drag_ele = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		System.out.println(drag_ele.size());
	

		List<WebElement> drag_elements = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		System.out.println(drag_elements.size());
		
		
		TouchAction action = new TouchAction(driver);
		action.longPress(drag_ele.get(0)).moveTo(drag_ele.get(5)).release().perform();
		

	}

}
