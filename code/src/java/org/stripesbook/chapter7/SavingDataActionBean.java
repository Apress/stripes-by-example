package org.stripesbook.chapter7;

import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/savingdata")
public class SavingDataActionBean extends BaseActionBean {
    private List<Dvd> dvds;
    private Dvd newDvd;
    
    @DefaultHandler
    public Resolution index(){
        DvdDAO dvdDAO = new DvdDAO();
        dvds = dvdDAO.selectAll();
        return new ForwardResolution("/jsp/chapter7/dvds.jsp");
    }
    
    @HandlesEvent("save") //Again -- not required, but sometimes good for clarity
    public Resolution save(){
        DvdDAO dvdDAO = new DvdDAO();
        dvdDAO.insert(newDvd);
        
        //RedirectResolution - redirects to another ActionBeans (HTTP 302 redirect).
        //this.getClass() would also work
        return new RedirectResolution(SavingDataActionBean.class); //Will call index() method.
    }
    
    // <editor-fold desc="Getters and Setters...">
    public List<Dvd> getDvds() {
        return dvds;
    }

    public void setDvds(List<Dvd> dvds) {
        this.dvds = dvds;
    }

    public Dvd getNewDvd() {
        return newDvd;
    }

    public void setNewDvd(Dvd newDvd) {
        this.newDvd = newDvd;
    }
    // </editor-fold>
}
