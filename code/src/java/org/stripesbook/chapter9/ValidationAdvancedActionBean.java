package org.stripesbook.chapter9;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/advancedvalidation")
public class ValidationAdvancedActionBean extends BaseActionBean {
    
    @Validate(required=true) //default is false
    private String name;   
    
    @ValidateNestedProperties({
        @Validate(field="address1", required=true, minlength=10, maxlength=100),
        @Validate(field="city", required=true, minlength=3, maxlength=20),
        @Validate(field="state", required=true, minlength=4, maxlength=20),
        @Validate(field="country", required=true, minlength=4, maxlength=30),
        @Validate(field="zipCode", required=true, minlength=5, maxlength=7)  //5 for zips, 7 for postal codes
    })
    private AddressDTO address;
    
    @DefaultHandler
    @DontValidate //don't run validation rules here
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter9/advanced/form.jsp");
    }
    
    @HandlesEvent("submit")
    public Resolution submit(){
        return new ForwardResolution("/jsp/chapter9/advanced/results.jsp");
    }

    // <editor-fold desc="Getters and Setters...">    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
    // </editor-fold>
}
