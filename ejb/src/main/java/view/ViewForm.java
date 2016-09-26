package com.view;

/**
 *
 * @author Анна
 */

//import org.zkoss.bind.annotation.Command;
//import org.zkoss.bind.annotation.ContextParam;
//import org.zkoss.bind.annotation.ContextType;
//import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.event.InputEvent;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Composer;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Label;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkosorg.zkoss.zk.ui.selects.annotation.*;
import org.zkoss.zul.*;



public class ViewForm extends SelectorComposer<Window> {
    
   @Wire
    Textbox firstname; 
    @Wire
    Button result; 
     
    @Listen("onClick=#btsubmit")
    public void submit(Event event) { 
        String prop = System.getProperty(firstname.getValue());
        result.appendChild(new Label(prop));
    }
    
}
