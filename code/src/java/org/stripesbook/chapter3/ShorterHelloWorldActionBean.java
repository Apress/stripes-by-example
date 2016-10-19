package org.stripesbook.chapter3;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import org.stripesbook.common.BaseActionBean;

public class ShorterHelloWorldActionBean extends BaseActionBean{
    private String message;
    
    @DefaultHandler
    public Resolution sayHello(){
        message = "Hello World";
        return new ForwardResolution("/jsp/chapter3/helloworld.jsp");
    }

    // <editor-fold desc="Getters and Setters...">
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    // </editor-fold>
}
