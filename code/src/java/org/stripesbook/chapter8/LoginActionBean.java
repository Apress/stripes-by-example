package org.stripesbook.chapter8;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import org.stripesbook.common.BaseActionBean;

public class LoginActionBean extends BaseActionBean {
    
    private String username;
    private String password;
    private String status;
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter8/login.jsp");
    }
    
    @HandlesEvent("login")
    public Resolution login(){
        UserDAO userDAO = new UserDAO();
        boolean loginSuccess = userDAO.login(username, password);
                
        Resolution resolution = null;
        if(loginSuccess){
            resolution = new RedirectResolution(ApplicationMenuActionBean.class);
        } else {
            status = "Login failed";
            resolution = this.index();
        }
        return resolution;
    }
    
    // <editor-fold desc="Getters and Setters...">
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    // </editor-fold>
}
