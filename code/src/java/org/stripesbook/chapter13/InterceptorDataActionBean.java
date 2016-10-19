package org.stripesbook.chapter13;

import java.util.ArrayList;
import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/interceptor")
public class InterceptorDataActionBean extends BaseActionBean {
    
    private static List<String> interceptorData = new ArrayList<String>(); //Populated by SimpleInterceptor class
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter13/interceptordata.jsp");
    }

    public static void addInterceptorData(String data) {
        interceptorData.add(data);
    }
    
    public List<String> getInterceptorData() {
        return interceptorData;
    }
    
}
