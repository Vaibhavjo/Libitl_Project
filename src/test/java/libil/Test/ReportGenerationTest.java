package libil.Test;

import org.testng.annotations.Test;

import Libil.Page.LoginPage;
import Libil.Page.ReportPage;
import Libil.Utility.BaseTest;

public class ReportGenerationTest extends BaseTest {
	@Test

	public void verifyReportDisplay() {
		LoginPage loginPage = new LoginPage(driver);
		ReportPage reportPage = new ReportPage(driver);
		loginPage.adminLogin("admin@gmail.com", "Admin@345");
		reportPage.scrollTillBottomPage();
		reportPage.searchClient("Kabir");
		reportPage.clickOnSubmitButton();
		reportPage.selectCases(1);
		reportPage.viewReport();
		reportPage.verifyReportDisplay();
	}

}
