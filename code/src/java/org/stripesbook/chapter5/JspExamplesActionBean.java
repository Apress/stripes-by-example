package org.stripesbook.chapter5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/jsps")
public class JspExamplesActionBean extends BaseActionBean{
    private String bookTitle;
    private List<String> bookTopics = new ArrayList<String>();
    private Map<String, String> chapters = new LinkedHashMap<String, String>();
    
    @HandlesEvent("variables") //Remember: not required, because if annotation is missing the method name will be used.
    public Resolution variables(){
        bookTitle = "Stripes by Example";
        return new ForwardResolution("/jsp/chapter5/variables.jsp");
    }
    
    @HandlesEvent("complex")
    public Resolution complexVariables(){
        bookTopics.add("Environment Setup");
        bookTopics.add("Getting Started with Stripes");
        bookTopics.add("Form data");
        bookTopics.add("...etc...");
        
        chapters.put("Chapter1", "Introduction to Stripes");
        chapters.put("Chapter2", "Getting Started");
        chapters.put("Chapter3", "ActionBeans");
        chapters.put("Chapter4", "Mapping URLs");
        chapters.put("Chapter5", "JSPs");
        //...
        return new ForwardResolution("/jsp/chapter5/complexVariables.jsp");
    }
    
    @HandlesEvent("tags")
    public Resolution stripesTagLib(){
        return new ForwardResolution("/jsp/chapter5/stripesTagLib.jsp");
    }
    
    @HandlesEvent("form")
    public Resolution stripesForm(){
        return new ForwardResolution("/jsp/chapter5/stripesForm.jsp");
    }

    // <editor-fold desc="Getters and Setters...">
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public List<String> getBookTopics() {
        return bookTopics;
    }

    public void setBookTopics(List<String> bookTopics) {
        this.bookTopics = bookTopics;
    }

    public Map<String, String> getChapters() {
        return chapters;
    }

    public void setChapters(Map<String, String> chapters) {
        this.chapters = chapters;
    }
    // </editor-fold>
}
