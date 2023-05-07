package com.tfyre.playground.v23;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.AppShellSettings;

//@Theme("starter-theme")
public class AppConfig implements AppShellConfigurator {

    @Override
    public void configurePage(AppShellSettings settings) {
        settings.setPageTitle("Vaadin 23 Demo");
    }

}
