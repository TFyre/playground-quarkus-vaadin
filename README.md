# playground-quarkus-vaadin

Demo to showcase issue between vaadin 23 and vaadin24 related to Grid & Dialog components

## To run Vaadin23:
```bash
cd v23
mvn quarkus:dev
```
Open http://localhost:9023

## To run Vaadin24:
```bash
cd v24
mvn quarkus:dev
```
Open http://localhost:9024

## To see the issue:
You can right click on the grid to see 3 menu options, they all do the same. When clicking the menu option, it will open a Dialog with the same. This can be nested multiple times.

The menu items are generated from a counter to show that the event fired.

**Vaadin23:** works (counter is increased with every right click)

**Vaadin24:** right click on grid doesn not show in dialog (but counter is still increased).  Looks like something is removing the items before they can be displayed.