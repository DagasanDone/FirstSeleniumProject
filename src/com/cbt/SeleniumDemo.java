package com.cbt;

  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.firefox.FirefoxDriver;
  
  public class SeleniumDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,
				"C:\\Users\\yolcu\\OneDrive\\Masaüstü\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://google.com");
		
	}

}
