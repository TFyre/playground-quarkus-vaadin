package com.tfyre.playground.v24;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.AppShellSettings;

//@Theme("starter-theme")
public class AppConfig implements AppShellConfigurator {

    @Override
    public void configurePage(AppShellSettings settings) {
        settings.setPageTitle("Vaadin 24 Demo");
    }

}
