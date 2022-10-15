package Schedule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleNegativeCases1 {
	public WebDriver driver;

	@FindBy(id = "normal_login_username")

	private WebElement username;

	public ScheduleNegativeCases1(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}
	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	@FindBy(xpath = "//a[normalize-space()='Appointment Profiles']")

	private WebElement clickAppointmentProfile;

	public WebElement getclickAppointmentProfile() {
		return clickAppointmentProfile;
	}
	@FindBy(xpath = "//button[normalize-space()='Add New Profile']")

	private WebElement clickAddProfile;

	public WebElement getclickAddProfile() {
		return clickAddProfile;
	}
	@FindBy(xpath = "//div[contains(@class,'col-sm-8')]//input[@id='duration']")

	private WebElement Entername;

	public WebElement getEntername() {
		return Entername;
	}
	@FindBy(xpath = "//div[5]//div[1]//div[1]//select[1]")

	private WebElement ClickBillingprofile;

	public WebElement getClickBillingprofile() {
		return ClickBillingprofile;
	}
	@FindBy(xpath = "//option[@value='17']")

	private WebElement selectBillingprofile;

	public WebElement getselectBillingprofile() {
		return selectBillingprofile;
	}
	@FindBy(xpath = "//button[normalize-space()='Cancel']")

	private WebElement ClickCancel1;

	public WebElement getClickCancel1() {
		return ClickCancel1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Billing Profiles']")

	private WebElement ClickBillingProfile;

	public WebElement getClickBillingProfile() {
		return ClickBillingProfile;
	}
	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[8]")

	private WebElement ClickAddprofile;

	public WebElement getClickAddprofile() {
		return ClickAddprofile;
	}
	@FindBy(xpath = "//input[@placeholder='Find Diagnosis Codes']")

	private WebElement entercptcode;

	public WebElement getentercptcode() {
		return entercptcode;
	}
	@FindBy(xpath = "//div[@code='Vkard']")

	private WebElement Selectcptcode;

	public WebElement getSelectcptcode() {
		return Selectcptcode;
	}
	@FindBy(xpath = "//button[@id='CPT_4NDAdd0']")

	private WebElement ClickNdc;

	public WebElement getClickNdc() {
		return ClickNdc;
	}
	@FindBy(xpath = "//input[@placeholder='Find NDC Codes']")

	private WebElement enterNdcCode;

	public WebElement getenterNdcCode() {
		return enterNdcCode;
	}
	@FindBy(xpath = "//div[contains(text(),'123--hydrocloride')]")

	private WebElement SelcetNdcCode;

	public WebElement getSelcetNdcCode() {
		return SelcetNdcCode;
	}
	@FindBy(xpath = "//input[contains(@placeholder,'Find HCPCS Codes')]")

	private WebElement enterHCPCSCode;

	public WebElement getenterHCPCSCode() {
		return enterHCPCSCode;
	}
	@FindBy(xpath = "//div[contains(text(),'V2782--Lens, 1.54-1.65 p/1.60-1.79g')]")

	private WebElement SelectHCPCSCode;

	public WebElement getSelectHCPCSCode() {
		return SelectHCPCSCode;
	}
	@FindBy(xpath = "//input[@id='HCPCSDQty0']")

	private WebElement enterquantity;

	public WebElement getenterquantity() {
		return enterquantity;
	}
	@FindBy(xpath = "//button[normalize-space()='Cancel']")

	private WebElement ClickCancel;

	public WebElement getClickCancel() {
		return ClickCancel;
	}
	@FindBy(xpath = "(//span[contains(text(),'Edit')])[4]")

	private WebElement ClickEdit;

	public WebElement getClickEdit() {
		return ClickEdit;
	}
	
	
	
	

	
	
	
	
	
}
