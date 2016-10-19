package org.stripesbook.chapter8;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import org.stripesbook.common.BaseActionBean;

public class Page2ActionBean extends BaseActionBean {
    private String someParam;
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter8/page2.jsp");
    }

    // <editor-fold desc="Getters and Setters...">
    public String getSomeParam() {
        return someParam;
    }

    public void setSomeParam(String someParam) {
        this.someParam = someParam;
    }
    // </editor-fold>
    
}
