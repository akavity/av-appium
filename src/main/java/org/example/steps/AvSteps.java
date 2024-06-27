package org.example.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.pages.AvPage;
import org.example.utils.Utils;

@Log4j2
public class AvSteps {
    AvPage AvPage = new AvPage();

    @Step
    public void clickAllowButton() {
        log.info("Click allow button");
        Utils.waitUntilClickable(AvPage.getAllowButton());
        AvPage.getAllowButton().click();
    }

    @Step
    public void clickViewButton() {
        log.info("Click View button");
        AvPage.getViewButton().click();
    }

    @Step
    public Boolean isTextDisplayed() {
        boolean result = AvPage.getMyAdText().isDisplayed();
        log.info("Is text displayed: {}", result);
        return result;
    }
}
