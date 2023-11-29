package domain;

import core.BrowserDriver;

public class BasePage {
    protected BrowserDriver browserDriver;

    public BasePage(BrowserDriver browserDriver) {
        this.browserDriver = browserDriver;
    }
}
