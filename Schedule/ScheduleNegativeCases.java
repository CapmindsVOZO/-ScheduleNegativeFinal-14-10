package Schedule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class ScheduleNegativeCases extends Base_class{

	public static WebDriver driver = getbrowser("firefox");

	public static Pom_Class pom = new Pom_Class(driver);

//	public static void main(String[] args) throws InterruptedException {

//		// Driver Maximize and Url Launch
	@Test(priority = 0)
//	//
	public void ScheduleNegativeCasess() throws InterruptedException {
		geturl("https://ehr1.vozo.xyz:444/");

		// Enter Username
		sendkeys(pom.getinstance().getUsername(), "Admin3");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "Admin@123");
			
		// Click Signin Button '
        Clickonelement(pom.getinstance().getSigninbtn());
       
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     
        // Click BillingProfile
        Clickonelement(pom.getScheduleNegativeCases1().getclickAppointmentProfile());
       
        Thread.sleep(2000);
        
        // Click AddProfile
        Clickonelement(pom.getScheduleNegativeCases1().getclickAddProfile());
        
        // Enter name 
        sendkeys(pom.getScheduleNegativeCases1().getEntername(),"vv");
        
        // Click Billing profile
        Clickonelement(pom.getScheduleNegativeCases1().getClickBillingprofile());
        
        // Click cancel
        Clickonelement(pom.getScheduleNegativeCases1().getClickCancel1());
        
        Thread.sleep(2000);
        
        
        // Click BillingProfile
        Clickonelement(pom.getScheduleNegativeCases1().getClickBillingProfile());
       
        Thread.sleep(3000);
        // Click Add profile
        Clickonelement(pom.getScheduleNegativeCases1().getClickAddprofile());
       
        // Enter Cpt codes
        sendkeys(pom.getScheduleNegativeCases1().getentercptcode(), "v");
        
        Thread.sleep(3000);
        // Click Select cpt code
        Clickonelement(pom.getScheduleNegativeCases1().getSelectcptcode());
        
        // Click Click Ndc
        Clickonelement(pom.getScheduleNegativeCases1().getClickNdc());
        
        // Enter NDC codes
        sendkeys(pom.getScheduleNegativeCases1().getenterNdcCode(), "1");
        
        // select NDC codes
        Clickonelement(pom.getScheduleNegativeCases1().getSelcetNdcCode());
        
        // Enter HCPCS Codes
        sendkeys(pom.getScheduleNegativeCases1().getenterHCPCSCode(), "1");
        
        // Enter HCPCS Codes
        Clickonelement(pom.getScheduleNegativeCases1().getSelectHCPCSCode());
        
        // Enter quantity
        Clickonelement(pom.getScheduleNegativeCases1().getenterquantity());
        
        // select NDC codes
        Clickonelement(pom.getScheduleNegativeCases1().getClickCancel());
        
      System.out.println("success");
        
        
        
	}
}
