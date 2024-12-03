package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static base basee=null;
	
	private base() {
		
	}
	public static base getInstance() {
		if(basee==null) {
			basee=new base();
		}
		return basee;
	}
	public static WebDriver driver; 
	public Actions action;
	public  Alert alert;
	public TakesScreenshot screen; 
	

 public void launch() {
	 WebDriverManager.edgedriver().setup();
	   EdgeOptions option=new EdgeOptions();
	   option.addArguments("start-maximized");
	   driver= new EdgeDriver(option);
		screen=(TakesScreenshot)driver;

	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
 public void launchapplication(String url) {
	 driver.get(url);
 }
	public void closingBrowser() {
		driver.close();
	}
	public void closingCurrentTab() {
		driver.quit();
	}
	public String pageTilte() {
		String title = driver.getTitle();
		return title;
	}
	public String currentUrl() {
		String current = driver.getCurrentUrl();
		return current;
	}
	public String pageSource() {
		String page = driver.getPageSource();
		return page;
	}
	
	public void SendTextwiithenter(WebElement opt,String val) {
		opt.sendKeys(val,Keys.ENTER);
		
	}
	public void SendKeys(WebElement opt,String val) {
		opt.sendKeys(val);
		
	}
	public void button(WebElement opt) {
		opt.click();
	}
	public void attri(WebElement opt,String val) {
		opt.getAttribute(val);
	}
	public void css(WebElement opt,String val) {
		opt.getCssValue(val);
	}
	public boolean enable(WebElement opt) {
		boolean enabled = opt.isEnabled();
		return enabled;
	}
	public boolean display(WebElement opt) {
		boolean displayed = opt.isDisplayed();
		return displayed;
	}
	public boolean select(WebElement opt) {
		boolean selected = opt.isSelected();
		return selected;
	}

	public String text(WebElement opt) {
		String a = opt.getText();
		return a;
	}
	public void delete(WebElement opt) {
		opt.clear();
	}
	public void submitted(WebElement opt) {
		opt.submit();
	}
	public void move(WebElement opt) {
		action.moveToElement(opt).build().perform();
	}
	public void doublecli(WebElement opt) {
		action.doubleClick(opt).build().perform();
	}
	public void right(WebElement opt) {
		action.contextClick(opt).build().perform();
	}
	public void dragdrop(WebElement opt,WebElement opt2) {
		action.dragAndDrop(opt, opt2).perform();
	}
	public void press(WebElement opt) {
		action.click(opt).build().perform();
	}
	public void SendText(WebElement webElement, String value) {
		action.sendKeys(webElement, value).build().perform();
	}
	public void scroll(WebElement opt) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('true')", opt);
	}
	public void button(WebElement opt, int a) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",opt);
	}
	public void byIndex(int index,WebElement opt) {
		Select s = new Select(opt);
		s.selectByIndex(index);
	}
	public void byvisible(String val,WebElement opt) {
		Select s = new Select(opt);
		s.selectByVisibleText(val);
	}
	public void byval(String val,WebElement opt) {
		Select s = new Select(opt);
		s.selectByVisibleText(val);
	}
	public void desIndex(int index,WebElement opt) {
		Select s = new Select(opt);
		s.deselectByIndex(index);
	}
	public void desval(String val,WebElement opt) {
		Select s = new Select(opt);
		s.deselectByValue(val);
	}
	public void desbyVisible(String val,WebElement opt) {
		Select s = new Select(opt);
		s.deselectByVisibleText(val);
	}
	public boolean mul(WebElement opt) {
		Select s = new Select(opt);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	public WebElement firstselected(WebElement opt) {
		Select s = new Select(opt);
		WebElement first = s.getFirstSelectedOption();
		return first;
	}
	public List<WebElement> allSelected(WebElement opt) {
		Select s= new Select(opt);
		List<WebElement> all = s.getAllSelectedOptions();
		return all;		
	}
	public List<WebElement> alloptions(WebElement opt) {
		Select s = new Select(opt);
		List<WebElement> options = s.getOptions();
		return options;
		}
	public void frame(String val) {
		driver.switchTo().frame(val);
	}
	
	public void frames(WebElement val) {
		driver.switchTo().frame(val);
	}
	public void parent() {
		driver.switchTo().parentFrame();
	}
	public void mainframe() {
		driver.switchTo().defaultContent()	;
	}
	public void acceptalert() {
		alert.accept();
	}
	public void dismissalert() {
		alert.dismiss();
	}
	public void SendText(String val,int b) {
		alert.sendKeys(val);
	}
	public void screenShot(String path) {
		File src = screen.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\dev-guna\\dev1\\Cucumba\\target\\new.png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void window() {
		String w1=driver.getWindowHandle();
		Set<String> w2=driver.getWindowHandles();
		
		for(String x:w2) {
			if(!w1.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		
	}
	
	public void listWebElement(List<WebElement> web) {

       	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < web.size(); i++) {
			WebElement text = web.get(i);
			if(text.isDisplayed()) {
				System.out.println(text.getText()+"----Displayed");
			}
			else {
				System.out.println(text.getText()+"----notDisplayed");
			}
			
		}
	}
	
	public void multiWindowHandle(int y) {
		 Set<String> windowHandles = driver.getWindowHandles();
		    List<String> multi=new ArrayList<>();
		    multi.addAll(windowHandles);
		    for(int i=0;i<multi.size();i++) {
		    	
		        driver.switchTo().window(multi.get(y));
		    	
		    }
	}
	

}
