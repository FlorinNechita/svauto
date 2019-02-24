package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static helpers.WebElementHelper.areVisible;

public class DashboardPage extends BasePage {

  public final static String URL="http://automationpractice.com";

  @FindBy(id = "homeslider")
  private WebElement carousel;

<<<<<<< HEAD
<<<<<<< HEAD
  @FindBy(id = "editorial_block_center")
  private WebElement editorialBlockCenter;

  @Override
  protected boolean isCurrent() {
    return areVisible(carousel, editorialBlockCenter);
=======
  @FindBy(className = "header_user_info")
  private WebElement headerUserInfo;
=======
  @FindBy(id = "editorial_block_center")
  private WebElement editorialBlockCenter;
>>>>>>> Updated LoginTest loginPage.verify() position and DashboardPage

  @Override
  protected boolean isCurrent() {
<<<<<<< HEAD
    return areVisible(carousel, headerUserInfo, contactLink);
>>>>>>> Second commit
=======
    return areVisible(carousel);
>>>>>>> Updated LoginTest loginPage.verify() position and DashboardPage
  }

  @Override
  protected boolean isValid() {
<<<<<<< HEAD
<<<<<<< HEAD
    return areVisible(carousel, editorialBlockCenter);
=======
    return areVisible(carousel, headerUserInfo, contactLink);
>>>>>>> Second commit
=======
    return areVisible(carousel);
>>>>>>> Updated LoginTest loginPage.verify() position and DashboardPage
  }

  public DashboardPage(WebDriver driver){
    super(driver);
  }

  public void clickLoginButton(){
      headerLoginButton.click();
    }

  public void open(){
    openUrl(URL);
  }
}
