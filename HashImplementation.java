package collectionFramwork;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashImplementation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.name("email")).sendKeys(getUserName("sales"));
		driver.findElement(By.name("password")).sendKeys(getPassword("sales"));
	}
	public static Map<String,String> getCredentialsMap() {
		HashMap<String, String> usercred=new HashMap<>();
		usercred.put("admin", "dharmiqualisys@gmail.com:Test@123");
		usercred.put("customer", "test2:Test2@123");
		usercred.put("support", "test3:Test3@123");
		usercred.put("inventory", "test4.com:Test4@123");
		usercred.put("sales", "test5.com:Test5@123");
		return usercred;
	}

	public static String getUserName(String role) {
		String cred= getCredentialsMap().get(role);
		String username=cred.split(":")[0];
		return username;
	}
	
	public static String getPassword(String role) {
		String cred= getCredentialsMap().get(role);
		String password=cred.split(":")[1];
		return password;
	}
}
