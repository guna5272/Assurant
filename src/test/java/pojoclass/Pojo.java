package pojoclass;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.base;
import task.stepdefinition;


public class Pojo  {
          
	base basee = base.getInstance();	
	public Pojo () {
		PageFactory.initElements(basee.driver, this);
	}
	
	@FindBy(xpath ="//div[@class='aspNetHidden']//following::div[starts-with(text(),'Claims & Support')][1]")
	private WebElement claimAndSupport;
	
	
	@FindBy(xpath ="//button[contains(text(),'Claims & Support')]")
	private WebElement claimAndSupportInsurance;

	
	public WebElement getClaimAndSupportInsurance() {
		return claimAndSupportInsurance;
	}

	@FindBy(xpath ="(//div[text()='Claims & Support'])//following-sibling::a")
	private List<WebElement> claimsAndSupportListData;
	
	
	@FindBy(xpath ="//a[contains(text(),'Mobile Device Insurance')]")
	private WebElement mobileDevice;
	
	@FindBy(xpath ="//button[text()='Decline']")
	private WebElement decline;
	
	@FindBy(xpath ="//a[@href='https://www.cellphonerepair.com/assurant-device-care/']")
	private WebElement deviceCare;
	
	@FindBy(xpath ="//a[@id='go-to-claim-offer']")
	private WebElement RegisterDevice;
	
	@FindBy(xpath ="//div[@class='mat-select-arrow ng-tns-c98-3']")
	private WebElement mobileModel;
	
	@FindBy(xpath ="(//span[@class=\"mat-option-text\"])[4]")
	private WebElement google;
	
	@FindBy(xpath ="//div[@id=\"mat-select-value-3\"]")
	private WebElement selectModel;
	
	public WebElement getSelectModel() {
		return selectModel;
	}

	
	@FindBy(xpath ="//span[text()=' Pixel 3 64 GB - Clearly White ']")
	private WebElement model;
	
	@FindBy(xpath ="//div[@class=\"mat-form-field-outline mat-form-field-outline-thick ng-tns-c91-6 ng-star-inserted\"]/following::input[@class=\"mat-input-element mat-form-field-autofill-control ng-tns-c91-6 ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored\"]")
	private WebElement imei;
	
	@FindBy(xpath ="//button[contains(text(),\"Continue\")]")
	private WebElement continu;
	
	
	@FindBy(xpath ="//a[@class='main-nav-item six-two']")
	private WebElement renterinsurance;
	
	@FindBy(xpath = "//button[@id='truste-consent-button']")
	private WebElement clickmore;
	
	
	@FindBy(xpath="(//a[contains(text(),'Learn More')])[2]")
	private WebElement learnMore;
	
	public WebElement getLearnMore() {
		return learnMore;
	}

	@FindBy(xpath = "//a[@href='/partner-with-us/renters-solutions/our-products/security-deposit-alternatives']")
	private WebElement scrollClickmore;
	
	@FindBy(xpath = "//div[text()='Product: FlexDeposit® ']")
	private WebElement flexDeposit;
	
	@FindBy(xpath ="//a[@href='/partner-with-us/renters-solutions/contact-us']")
	private WebElement contactform;
	
	@FindBy(xpath="//div[@id=\"PublicWrapper2\"]")
	private WebElement newPage;
	
	public WebElement getNewPage() {
		return newPage;
	}

	@FindBy(xpath ="//div[@class='main-nav_item-wrap three']")
	private WebElement newsandinsights;
	
	@FindBy(xpath ="//a[@class='main-nav-item three-one']")
	private WebElement dropdown;
	
	@FindBy(xpath ="//button[@id='truste-consent-button']")
	private WebElement clickdropdown;
	
	@FindBy(xpath ="(//h2[@class=\"medium-text header\"])[3]")
	private WebElement newsScroll;
	
	@FindBy(xpath ="//iframe[@class=\"pardot-iframe\"]")
	private WebElement emailFrame;
	
	@FindBy(xpath ="//input[@id=\"438242_548054pi_438242_548054\"]")
	private WebElement emailID;
	
	@FindBy(xpath ="//input[@id=\"438242_548057pi_438242_548057_10195865\"]")
	private WebElement mobileConnection;
	
	@FindBy(xpath ="//input[@id='subscribe']")
	private WebElement subscribe;
	

	@FindBy(xpath="//big[text()='Thank you for Subscribing']")
	private WebElement verifySubsc;
	
	
	
	@FindBy(xpath="//a[contains(text(),'Flood Policies')]")
	private WebElement foodPolicies;
	
	@FindBy(xpath ="//div[text()='NFIP Help: 1-800-423-4403 ']")
	private WebElement NFIPHelp;
	
	
	@FindBy(xpath="(//div[@class=\"bcc-text-body text-padding-Default_Padding\"])[2]")
	private WebElement commercialFloodUp;
	
	@FindBy(xpath="(//span[@class=\"bcc-CTA-arrow fa fa-long-arrow-right\"])[1]")
	private WebElement commercialFlood;
	
	
	@FindBy(xpath="//div[contains(text(),'Contact Private Flood Expert')]")
	private WebElement contanctPrivateFlood;
	
	@FindBy(xpath="//h2[text()='Contact Us']")
	private WebElement ContactUSFlood;
	
	
	
	
	
	



	public WebElement getCommercialFloodUp() {
		return commercialFloodUp;
	}



	public WebElement getFoodPolicies() {
		return foodPolicies;
	}



	public WebElement getNFIPHelp() {
		return NFIPHelp;
	}



	public WebElement getCommercialFlood() {
		return commercialFlood;
	}



	public WebElement getContanctPrivateFlood() {
		return contanctPrivateFlood;
	}



	public WebElement getContactUSFlood() {
		return ContactUSFlood;
	}



	public WebElement getVerifySubsc() {
		return verifySubsc;
	}



	public WebElement getNewsScroll() {
		return newsScroll;
	}



	public WebElement getEmailFrame() {
		return emailFrame;
	}



	public WebElement getEmailID() {
		return emailID;
	}



	public WebElement getMobileConnection() {
		return mobileConnection;
	}



	public WebElement getSubscribe() {
		return subscribe;
	}



	public WebElement getNewsandinsights() {
		return newsandinsights;
	}



	public WebElement getDropdown() {
		return dropdown;
	}



	public WebElement getClickdropdown() {
		return clickdropdown;
	}



	public WebElement getRenterinsurance() {
		return renterinsurance;
	}



	public WebElement getClickmore() {
		return clickmore;
	}



	public WebElement getScrollClickmore() {
		return scrollClickmore;
	}



	public WebElement getFlexDeposit() {
		return flexDeposit;
	}



	public WebElement getContactform() {
		return contactform;
	}


	public WebElement getMobileModel() {
		return mobileModel;
	}



	public WebElement getModel() {
		return model;
	}



	public void setModel(WebElement model) {
		this.model = model;
	}



	public WebElement getImei() {
		return imei;
	}



	public void setImei(WebElement imei) {
		this.imei = imei;
	}



	public WebElement getGoogle() {
		return google;
	}



	public WebElement getContinu() {
		return continu;
	}



	public void setMobileDevice(WebElement mobileDevice) {
		this.mobileDevice = mobileDevice;
	}



	public void setRegisterDevice(WebElement registerDevice) {
		RegisterDevice = registerDevice;
	}



	public void setMobileModel(WebElement mobileModel) {
		this.mobileModel = mobileModel;
	}



	public WebElement getDecline() {
		return decline;
	}



	public WebElement getClaimAndSupport() {
		return claimAndSupport;
	}

	

	public List<WebElement> getClaimsAndSupportListData() {
		return claimsAndSupportListData;
	}



	public WebElement getDeviceCare() {
		return deviceCare;
	}



	public WebElement getRegisterDevice() {
		return RegisterDevice;
	}



	public WebElement getMobileDevice() {
		return mobileDevice;
	}



	
	
	
}
