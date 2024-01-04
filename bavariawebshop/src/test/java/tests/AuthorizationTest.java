package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.PlaywrightException;

public class AuthorizationTest {
	
	public static void main(String[] args) throws InterruptedException {
		
				try {
					Playwright playwright = Playwright.create();
						 Browser browser = playwright.webkit().launch(
				            		new LaunchOptions().setHeadless(false)
				            		);
					Page page = browser.newPage();
					page.setDefaultTimeout(300000);
		            page.navigate("https://acc.sfbhoreca.nl/");
		            Locator acceptCookie = page.locator("//*[@id=\"onetrust-accept-btn-handler\"]");
		            acceptCookie.click();
		            Locator acceptTermsAndCondition = page.locator("//*[@id=\"sfbhoreca-popup\"]/div/div/div[1]/button/span");
		            acceptTermsAndCondition.click();
		          
				}catch(PlaywrightException err) {
					err.printStackTrace();
				}
	            
	            
	    }
}
