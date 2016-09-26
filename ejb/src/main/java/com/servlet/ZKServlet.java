
package com.servlet;

import org.zkoss.zhtml.Label;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.api.Textbox;

/**
 *
 * @author Анна
 */


public class ZKServlet extends GenericForwardComposer {
    private Textbox firstName;
    private Textbox lastName;
    private Textbox fullName;
    
    
  
     //onChange event from firstName component
    public void onChange$firstName(Event event) {
    fullName.setValue(firstName.getValue()+" "+lastName.getValue());

    }
    
    //onChange event from lastName component
    public void onChange$lastName(Event event) {
    fullName.setValue(firstName.getValue()+" "+lastName.getValue());
    }

}
