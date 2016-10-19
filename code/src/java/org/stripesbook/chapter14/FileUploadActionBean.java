package org.stripesbook.chapter14;

import java.io.File;
import java.io.IOException;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.FileBean;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/fileupload")
public class FileUploadActionBean extends BaseActionBean {
    
    private FileBean fileToUpload;
    private String message;
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter14/fileupload.jsp");
    }
    
    @HandlesEvent("upload")
    public Resolution upload() throws IOException{
        String saveToLocation = "/home/brent/uploadedfiles/" + fileToUpload.getFileName();
        fileToUpload.save(new File(saveToLocation));
        message = "File uploaded to " + saveToLocation;
        
        //Or process using fileToUpload.getInputStream()
        //then fileToUpload.delete() to remove from disk.
        
        return this.index();
    }
    

    public FileBean getFileToUpload() {
        return fileToUpload;
    }

    public void setFileToUpload(FileBean fileToUpload) {
        this.fileToUpload = fileToUpload;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
        
}
