package infrastructure;

import com.microsoft.playwright.Page;

import core.BrowserDriver;

public class PlaywrightDriver implements BrowserDriver {

    protected Page page;

    public PlaywrightDriver() {
    }

    @Override
    public void navigateTo(String url) {
        
    }

    @Override
    public void click(String locator) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'click'");
    }
    
}
