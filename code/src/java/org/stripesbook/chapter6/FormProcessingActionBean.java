package org.stripesbook.chapter6;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/formprocessing")
public class FormProcessingActionBean extends BaseActionBean{
    
    private String dvdTitle;    
    private double dvdCost;
    private String dvdGenre;
    private String message;
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter6/form.jsp");
    }
    
    @HandlesEvent("save")
    public Resolution save(){
        message = "Submitted: " + dvdTitle + " - a " + dvdGenre + " movie, which cost $" + dvdCost + ".";
        //More comon event would be to save the data to a DB.
        return new ForwardResolution("/jsp/chapter6/results.jsp");
    }
    
    // <editor-fold desc="Getters and Setters...">
    public double getDvdCost() {
        return dvdCost;
    }

    public void setDvdCost(double dvdCost) {
        this.dvdCost = dvdCost;
    }

    public String getDvdGenre() {
        return dvdGenre;
    }

    public void setDvdGenre(String dvdGenre) {
        this.dvdGenre = dvdGenre;
    }

    public String getDvdTitle() {
        return dvdTitle;
    }

    public void setDvdTitle(String dvdTitle) {
        this.dvdTitle = dvdTitle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    // </editor-fold>
}
