package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class AvPage {
    private final SelenideElement allowButton = $(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    private final SelenideElement viewButton = $(By.id("clickView"));
    private final SelenideElement myAdText = $(By.xpath("//android.widget.TextView[@text='Мои объявления']"));

    public SelenideElement getAllowButton() {
        return allowButton;
    }

    public SelenideElement getViewButton() {
        return viewButton;
    }

    public SelenideElement getMyAdText() {
        return myAdText;
    }
}
