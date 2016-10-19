package org.stripesbook.chapter15;

import java.util.List;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/gooddesign")
public class GoodDesignActionBean extends BaseActionBean{
    
    //A few tips on good design:
    //1.  BaseActionBean.java will help alot.  These will hide your ActionBeanContext get/set methods and include common methods (eg: getDatabaseFactory() or isUserLoggedIn()).
    //    Remember that such methods can be used by the JSPs too.  ${actionbBean.userLoggedIn}
    //
    //2.  Don't fill your action beans with business logic.  You should have a business teir to do that.  
    //
    //3.  Use a base.jsp to include your html layout (<head>/<body> wrapping tags), DOCTYPE tags, your js/css includes, and your tag libs.
    //    Stripes makes this easy by providing a stripes:layout... tags.
    //
    
    private BusinessLogicClass businessLogic;
    private List<String> products;
    
    public GoodDesignActionBean(){
        if(businessLogic==null){
             businessLogic = new BusinessLogicClass(); //Could be injected using dependency injection instead
        }
    }
            
    @HandlesEvent("basejsp")
    public Resolution baseJsp(){
        return new ForwardResolution("/jsp/chapter15/page1.jsp");
    }
    
    @HandlesEvent("products")
    public Resolution externalBizLogic(){
        products = businessLogic.getProducts();
        return new ForwardResolution("/jsp/chapter15/page2.jsp");
    }

    // <editor-fold desc="Getters and Setters...">    
    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
    
    public void setBusinessLogic(BusinessLogicClass businessLogic) {
        this.businessLogic = businessLogic;
    }
    // </editor-fold>
    
    
}
