package org.stripesbook.chapter6;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/formprocessingdto")
public class FormProcessingDTOActionBean extends BaseActionBean{
    
    private Dvd dvd;
    private String message;
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter6/dto/form.jsp");
    }
    
    public Resolution save(){
        message = "Submitted: " + dvd.getTitle() + " - a " + dvd.getGenre() + " movie, which cost $" + dvd.getCost() + ".";
        //More comon event would be to save the data to a DB.
        return new ForwardResolution("/jsp/chapter6/dto/results.jsp");
    }
    
    // <editor-fold desc="Getters and Setters...">
    public Dvd getDvd() {
        return dvd;
    }

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    // </editor-fold>
}
