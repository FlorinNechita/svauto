package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static helpers.WebElementHelper.areVisible;
import static helpers.WebElementHelper.setFieldValue;

public class LoginPage extends BasePage {

  @FindBy(id = "email")
  private WebElement emailField;

  @FindBy(id = "passwd")
  private WebElement passField;

  @FindBy(id = "SubmitLogin")
  private WebElement logInButton;

  @FindBy(css = "#center_column div ol li")
  private WebElement loginError;

  @FindBy(id = "email_create")
  private WebElement createNewAccountEmailField;

  @FindBy(id = "SubmitCreate")
  private WebElement createAccountButton;

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  @Override
  protected boolean isCurrent() {
    return areVisible(emailField);
  }

  @Override
  protected boolean isValid() {
    return areVisible(emailField, passField, logInButton, createNewAccountEmailField, createAccountButton);
  }

  public void login(String email, String password) {
    fillInEmail(email);
    fillInPassword(password);
    logInButton.click();
  }

  private void fillInEmail(String email){
    setFieldValue(emailField, email);
  }

  private void fillInPassword(String password){
    setFieldValue(passField, password);
  }

  private void fillInEmailAccountCreation(String email) {
    setFieldValue(createNewAccountEmailField, email);
  }

  public void submitEmailAccountCreation(String email){
    fillInEmailAccountCreation(email);
    createAccountButton.click();
  }

  public WebElement getLoginError(){
    return loginError;
  }
}
