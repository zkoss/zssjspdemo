package org.zkoss.zss.jspdemo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zss.ui.Spreadsheet;

public class MyComposer extends SelectorComposer<Component> {

    @Wire
    private Spreadsheet myzss;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        //initialize a Spreadsheet here e.g. load data from a database, set Spreadsheet setter, Range API
    }

    //implement your business logic by adding event listeners
}
