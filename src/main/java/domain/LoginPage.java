package domain;

import core.BrowserDriver;

public class LoginPage extends BasePage {

    public LoginPage(BrowserDriver browserDriver) {
        super(browserDriver);
    }

    public void login(String username, String password) {
        browserDriver.click("#btn-login");
    }
    
}
