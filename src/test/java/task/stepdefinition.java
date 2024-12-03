 package task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pojoclass.Pojo;

public class stepdefinition{
	base basee=base.getInstance();
	Pojo pojo = new Pojo();

	
	public static WebDriver driver;
	

	
	@Given("Launch the application")
	public void launch_the_application() {
//		 WebDriverManager.edgedriver().setup();
////		   EdgeOptions option=new EdgeOptions();
////		   option.addArguments("start-maximized");
//		   driver=new EdgeDriver();
//	   basee.launch();
		
	}

	@When("user clicks on claim and support {string}")
	public void user_clicks_on_claim_and_support(String url) throws InterruptedException {
//		   driver.get(url);
//		   driver.manage().window().maximize();

//		WebElement element = driver.findElement(By.xpath("//div[@class='aspNetHidden']//following::div[starts-with(text(),'Claims & Support')][1]"));
//	    element.click();
		basee.launchapplication(url);
		   Thread.sleep(3000);
		 basee.button(pojo.getClaimAndSupport());
	}

	@Then("user validates dropdown options are Visibile")
	public void user_validates_dropdown_options_are_visibile() throws InterruptedException {
		
		
		basee.listWebElement(pojo.getClaimsAndSupportListData());
	   
	}

	@When("user click on mobile device insurance")
	public void user_click_on_mobile_device_insurance() {
//	    WebElement mobileDevice = driver.findElement(By.xpath("//a[@class='main-nav-item six-three']"));
//	    mobileDevice.click();
		
		basee.button(pojo.getMobileDevice());
//	    WebElement cookies = driver.findElement(By.xpath("//button[text()='Decline']"));
//		cookies.click();
		basee.button(pojo.getDecline());
	}

	@When("user click on assurant device care")
	public void user_click_on_assurant_device_care() {
		
//		 WebElement button= driver.findElement(By.xpath("//a[@href='https://www.cellphonerepair.com/assurant-device-care/']"));
//		 Actions action =new Actions(driver);
//		 action.moveToElement(button).build().perform();
//		 JavascriptExecutor js= (JavascriptExecutor) driver;
//    	 js.executeScript("arguments[0].scrollIntoView('true')", button);
//    	 js.executeScript("arguments[0].click()", button);
		
		basee.scroll(pojo.getDeviceCare());
		basee.button(pojo.getDeviceCare(), 0);
    	 
//    	 WebElement cookies = driver.findElement(By.xpath("//button[text()='Decline']"));
// 		cookies.click();
		
		basee.button(pojo.getDecline());
    	 
    	 }

	@When("user click on register my device")
	public void user_click_on_register_my_device() {
//		WebElement registerDevice = driver.findElement(By.xpath("//a[@id='go-to-claim-offer']"));
//		registerDevice.click();
		
		basee.button(pojo.getRegisterDevice());
		
		
	}

	@Then("user fill valid mobile details")
	public void user_fill_valid_mobile_details() throws InterruptedException {
//		String w1=driver.getWindowHandle();
//		Set<String> w2=driver.getWindowHandles();
//		
//		for(String x:w2) {
//			if(!w1.equals(x)) {
//				driver.switchTo().window(x);
//			}
//		}
		
		basee.window();
        Thread.sleep(3000);

//		driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c98-3']")).click();
        
        basee.button(pojo.getMobileModel());
		
//		 driver.findElement(By.xpath("//span[text()=' Google ']")).click();
//        Thread.sleep(3000);
//        basee.button(pojo.getGoogle());
        basee.button(pojo.getGoogle(), 0);
//		 
//		 driver.findElement(By.xpath("//div[@id='mat-select-value-3']")).click();
        Thread.sleep(3000);

        basee.button(pojo.getSelectModel());
//        driver.findElement(By.xpath("//div[@class=\"mat-form-field-outline ng-tns-c91-4 ng-star-inserted\"]")).click();
		 
//		 driver.findElement(By.xpath("//span[text()=' Pixel 3 64 GB - Clearly White ']")).click();
        basee.button(pojo.getModel());
		 
        Thread.sleep(3000);
//		 driver.findElement(By.xpath("(//div[@class=\"mat-form-field-outline-end ng-tns-c91-6\"])[2]")).sendKeys("43567890987654323");
      
        basee.SendKeys(pojo.getImei(), "43567890987654323");
//		 driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]")).click();
		 basee.button(pojo.getContinu());

	}
	@When("user click on Renters insurance")
	public void user_click_on_renters_insurance() {
//	   driver.findElement(By.xpath("//a[@class='main-nav-item six-two']")).click();
		basee.button(pojo.getRenterinsurance());
		basee.button(pojo.getClickmore());

	}

	@When("user click on learn more button")
	public void user_click_on_learn_more_button() throws InterruptedException {
//   driver.findElement(By.xpath("//button[@id='truste-consent-button']")).click();
   
//   WebElement scroll = driver.findElement(By.xpath("//a[@href='/partner-with-us/renters-solutions/our-products/security-deposit-alternatives']"));
//   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//   JavascriptExecutor js= (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].scrollIntoView('true')", scroll);
//	 js.executeScript("arguments[0].click()", scroll);
		
		basee.scroll(pojo.getScrollClickmore());
		basee.button(pojo.getLearnMore(), 0);
	}

	@When("user click on Explore flexDeposit button")
	public void user_click_on_explore_flex_deposit_button() {
//	    driver.findElement(By.xpath("//div[text()='Product: FlexDeposit® ']")).click();
		basee.button(pojo.getFlexDeposit());
	}

	@When("user click on contactform")
	public void user_click_on_contactform() {
//	    driver.findElement(By.xpath("//a[@href='/partner-with-us/renters-solutions/contact-us']")).click();
		basee.button(pojo.getContactform());
	}

	@Then("validate contact form navigate to new Tab")
	public void validate_contact_form_navigate_to_new_tab() {
			
//			String parent=driver.getWindowHandle();
//		    Set<String> windowHandles = driver.getWindowHandles();
//		    List<String> multi=new ArrayList<>();
//		    multi.addAll(windowHandles);
////		    for (String handle : windowHandles) {
////		    	if(!parent.equals(windowHandles)) {
//		    for(int i=0;i<multi.size();i++) {
//		    	
//		        driver.switchTo().window(multi.get(1));
//		    	
//		    }
		
		
		basee.multiWindowHandle(1);
		    if(basee.display(pojo.getNewPage())) {
		    System.out.println("New Page is Navigated");
		    }
		    else {
			    System.out.println("New Page is not Navigated");

		    }
	}

	@When("user clicks on news&insights")
	public void user_clicks_on_news_insights() {
//	    WebElement newsInsights = driver.findElement(By.xpath("//div[@class='main-nav_item-wrap three']"));
//	    newsInsights.click();
		basee.button(pojo.getNewsandinsights());
	}

	@Then("validate the dropdown is appeared")
	public void validate_the_dropdown_is_appeared() {
//	   WebElement ns = driver.findElement(By.xpath("//a[@class='main-nav-item three-one']"));
//	   JavascriptExecutor js= (JavascriptExecutor) driver;
//		
//		 js.executeScript("arguments[0].click()", ns);
		basee.button(pojo.getDropdown(), 0);
	
	  
	}
	

	@When("user clicks on One Dropdown")
	public void user_clicks_on_one_dropdown() {
//		 driver.findElement(By.xpath("//button[@id='truste-consent-button']")).click();
		basee.button(pojo.getClickdropdown());
	}

	@When("user clicks emailID to subscribee")
	public void user_clicks_email_id_to_subscribee() throws InterruptedException {
		Thread.sleep(3000);
		
		basee.scroll(pojo.getNewsScroll());
//		WebElement element = driver.findElement(By.xpath("(//h2[@class=\"medium-text header\"])[3]"));
//		 JavascriptExecutor js= (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollIntoView('true')", element);
			Thread.sleep(3000);
			basee.frames(pojo.getEmailFrame());
			basee.SendKeys(pojo.getEmailID(), "gunaseelan@gmail.com");
			basee.button(pojo.getMobileConnection());
			basee.button(pojo.getSubscribe());
//			WebElement element2 = driver.findElement(By.xpath("//iframe[@class=\"pardot-iframe\"]"));
//			driver.switchTo().frame(element2);

//		WebElement mail = driver.findElement(By.xpath("//input[@id=\"438242_548054pi_438242_548054\"]"));
//		 js.executeScript("arguments[0].setAttribute('value','gunaseelan@gmail.com')", mail);
		 
//		Actions a=new Actions(driver);
//		a.sendKeys(mail, "gunaseelan@gmail.com").build().perform();
//		 driver.findElement(By.xpath("//input[@id=\"438242_548057pi_438242_548057_10195865\"]")).click();
//		driver.findElement(By.xpath("//input[@id='subscribe']")).click();
	   
	}

	@Then("validate the confirmation message")
	public void validate_the_confirmation_message() {
		
//		WebElement tex = driver.findElement(By.xpath("//big[text()='Thank you for Subscribing']"));
		
		
		 if (basee.text(pojo.getVerifySubsc()).equals("Thank you for Subscribing")) {
	            System.out.println("Confirmation message validated successfully: " + "Thank you for Subscribing");
	        } else {
	        	 System.out.println( "Validation failed");
	          
	        }
	                   
	}
	
	
	
	
	@When("User click on Flood Policies")
	public void user_click_on_flood_policies() throws InterruptedException {
		Thread.sleep(3000);
	    basee.button(pojo.getFoodPolicies());
	}
	@When("user click on claim and support")
	public void user_click_on_claim_and_support() {
		 basee.button(pojo.getClaimAndSupportInsurance());

		
	}
	@When("User click NFIP Help")
	public void user_click_nfip_help() throws InterruptedException {
		Thread.sleep(3000);
	   basee.button(pojo.getNFIPHelp(), 0);
	}
	@When("User Click Commercial Flood in New Tab")
	public void user_click_commercial_flood_in_new_tab() {
	    basee.multiWindowHandle(1);
//	    basee.scroll(pojo.getCommercialFloodUp());
	    basee.button(pojo.getCommercialFlood(), 0);
	}
	@When("User Click Contact Private Flood Support in New Tab")
	public void user_click_contact_private_flood_support_in_new_tab() {
	    basee.multiWindowHandle(2);
	    basee.button(pojo.getContanctPrivateFlood());
	}
	@Then("Validate Contact us page is Navigated in new Tab")
	public void validate_contact_us_page_is_navigated_in_new_tab() {
	    basee.multiWindowHandle(3);
	    basee.button(pojo.getContactUSFlood());
	}


	



}
