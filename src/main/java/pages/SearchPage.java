package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends WebDriverInitialiazation.BasePage {
    @FindBy(id="txtSearch-main")
    public WebElement search;

    @FindBy(id="search_header")
    public WebElement searchHeader;

    public WebElement getSearchHeader() {
        return searchHeader;
    }

    public void setSearchHeader(WebElement searchHeader) {
        this.searchHeader = searchHeader;
    }



    public WebElement getSearch() {
        return search;
    }

    public void setSearch(WebElement search) {
        this.search = search;
    }




   public SearchPage(){
        PageFactory.initElements(driver, this);
    }

}
