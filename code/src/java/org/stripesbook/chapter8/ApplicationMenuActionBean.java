package org.stripesbook.chapter8;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import org.stripesbook.common.BaseActionBean;

public class ApplicationMenuActionBean extends BaseActionBean {
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter8/application_menu.jsp");
    }
        
}
