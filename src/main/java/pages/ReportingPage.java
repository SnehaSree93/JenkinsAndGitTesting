package pages;

import WebDriverInitialiazation.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportingPage extends BasePage {

    @FindBy(id="self_header")
    public WebElement selfHeader;

    @FindBy(xpath = "//span[text()='Reporting']")
    public WebElement reporting;

    @FindBy(xpath = "//span[text()='Advanced Reporting']")
    public WebElement advancedReporting;

    @FindBy(xpath = "//*[text()='Reports']")
    public WebElement reports;


    @FindBy(xpath = "//*[text()='Audience User Association Summary']")
    public WebElement userAssociationSummary;

    @FindBy(xpath = "//b[@id='handler2']")
    public WebElement site_key_expansion;


    public WebElement getSelfHeader() {
        return selfHeader;
    }

    public void setSelfHeader(WebElement selfHeader) {
        this.selfHeader = selfHeader;
    }

    public WebElement getReporting() {
        return reporting;
    }

    public void setReporting(WebElement reporting) {
        this.reporting = reporting;
    }

    public WebElement getAdvancedReporting() {
        return advancedReporting;
    }

    public void setAdvancedReporting(WebElement advancedReporting) {
        this.advancedReporting = advancedReporting;
    }

    public WebElement getReports() {
        return reports;
    }

    public void setReports(WebElement reports) {
        this.reports = reports;
    }


    public WebElement getUserAssociationSummary() {
        return userAssociationSummary;
    }

    public void setUserAssociationSummary(WebElement userAssociationSummary) {
        this.userAssociationSummary = userAssociationSummary;
    }


    public ReportingPage(){

        PageFactory.initElements(driver, this);
    }



}
