package Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class home_Page2 {
	
WebDriver driver ;

	
	@Given("^Browser is open$")
	public void Browser_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Sample_Test_Scripts\\Wiki_Scripts\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	    
	}

	@When("^I enter the sucasa url$")
	public void I_enter_the_sucasa_url() throws Throwable {
		driver.get("http://sucasa.realtor.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	}

	@Then("^I should navigate to the home page$")
	public void I_should_navigate_to_the_home_page() throws Throwable {
		String header = driver.findElement(By.xpath("//div[@class='srch_cont1 page_heading']//span")).getText();
		System.out.println(header);
		if(header.contains("Encontrar un"))
		{
			System.out.println("on home page");
			
		}else
		{
			System.out.println("on home page");
		}
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	}
	
}
