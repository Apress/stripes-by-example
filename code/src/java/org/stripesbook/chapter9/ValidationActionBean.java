package org.stripesbook.chapter9;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.validation.Validate;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/validation")
public class ValidationActionBean extends BaseActionBean {
    
    @Validate(required=true) //default is false
    private String name;   
    
    @Validate(required=true, minvalue=0, maxvalue=115)
    private int age;
    
    @Validate(required=false, mask="\\d{3}-\\d{3}-\\d{4}") //eg: 111-222-3333.  For the nerdy... this uses Pattern.matcher(yourExpression).matches()
    private String phoneNumber;
    
    @DefaultHandler
    @DontValidate //don't run validation rules here
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter9/form.jsp");
    }
    
    @HandlesEvent("submit")
    public Resolution submit(){
        return new ForwardResolution("/jsp/chapter9/results.jsp");
    }

    // <editor-fold desc="Getters and Setters...">    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }        

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // </editor-fold>
}
