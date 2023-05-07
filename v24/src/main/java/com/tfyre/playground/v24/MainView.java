package com.tfyre.playground.v24;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import java.util.concurrent.atomic.AtomicLong;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Dashboard")
public class MainView extends VerticalLayout {

    private final AtomicLong counter = new AtomicLong();

    public MainView() {
        add(getGrid());
        add(new Button("open", l -> getDialog().open()));
    }

    private Component getGrid() {
        final Grid<String> grid = new Grid<>();
        final GridContextMenu<String> gridMenu = grid.addContextMenu();
        gridMenu.setDynamicContentHandler(h -> {
            gridMenu.removeAll();
            addItem(gridMenu);
            addItem(gridMenu);
            addItem(gridMenu);
            return true;
        });

        return grid;
    }

    private void addItem(final GridContextMenu<String> gridMenu) {
        gridMenu.addItem(String.format("Counter [%d]", counter.incrementAndGet()), e -> {
            final Dialog d = getDialog();
            d.open();
        });
    }

    private Dialog getDialog() {
        final Dialog d = new Dialog();
        d.setWidth(80, Unit.PERCENTAGE);
        d.setHeight(80, Unit.PERCENTAGE);
        d.add(getGrid());
        //d.add(new TextField("blah"));
        d.add(new Button("open", l -> getDialog().open()));
        d.add(new Button("close", e -> d.close()));
        return d;
    }
}
