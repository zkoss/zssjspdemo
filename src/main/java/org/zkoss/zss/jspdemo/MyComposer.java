package org.zkoss.zss.jspdemo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;

public class MyComposer extends SelectorComposer {

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        System.out.println("initialize");
    }

    //implement your business logic by adding event listeners
}
