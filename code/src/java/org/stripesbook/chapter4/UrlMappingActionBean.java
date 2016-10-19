package org.stripesbook.chapter4;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/UrlMapping")
public class UrlMappingActionBean extends BaseActionBean{
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter4/index.jsp");
    }
    
    public Resolution eventOne(){
        return new ForwardResolution("/jsp/chapter4/another.jsp");
    }
    
    @HandlesEvent("eventtwo")
    public Resolution differentMethodName(){
        return new ForwardResolution("/jsp/chapter4/yetanother.jsp");
    }

}
