package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	
	@Test
	public void verifyInvalidLoginTest() throws IOException {
		String[][] data = GenericMethods.getData("D:\\SelJul24\\TestData.xlsx", "Sheet2");
		for(int i = 1; i<data.length;i++) {
			//Made code changes after R1.1
			switch(data[i][3]) {
			
			case "openBrowser":
				Methods.openBrowser();
				break;
			case "maxBrowser":
				Methods.maximizeBrowser();
				break;
			case "impWait":
				Methods.implicitWait();
				break;
			case "navToAUT":
				Methods.navigateToApplication(data[i][6]);
				break;
			case "enterUserID":
				Methods.enterUserID(data[i][4],data[i][5], data[i][6]);
				break;
			case "enterPassword":
				Methods.enterPassword(data[i][4],data[i][5], data[i][6]);
				break;
			case "clickLogin":
				Methods.clickLoginBtn(data[i][4],data[i][5]);
				break;
			
			case "verifyErrMsg":
				String actualMsg = Methods.verifyErrorMessage(data[i][5]);
				Assert.assertEquals(actualMsg, data[i][6]);
				break;
			case "closeApplication":
				Methods.closeApplication();
				break;
			}
		}
	}

}
