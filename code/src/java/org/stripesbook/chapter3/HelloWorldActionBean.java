package org.stripesbook.chapter3;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class HelloWorldActionBean implements ActionBean{
    private String message;
    private ActionBeanContext context;
    
    @Override
    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    @Override
    public ActionBeanContext getContext() {
        return context;
    }
    
    @DefaultHandler
    public Resolution sayHello(){
        message = "Hello World";
        return new ForwardResolution("/jsp/chapter3/helloworld.jsp");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
