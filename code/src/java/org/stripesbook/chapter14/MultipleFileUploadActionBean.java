package org.stripesbook.chapter14;

import java.io.File;
import java.io.IOException;
import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.FileBean;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/fileupload/multiple")
public class MultipleFileUploadActionBean extends BaseActionBean {
    
    private List<FileBean> filesToUpload;
    
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter14/multiplefiles/fileupload.jsp");
    }
    
    @HandlesEvent("multiupload")
    public Resolution upload() throws IOException{
        for (FileBean fileBean : filesToUpload) {
            if(fileBean!=null){
                String saveToLocation = "/home/brent/uploadedfiles/" + fileBean.getFileName();
                fileBean.save(new File(saveToLocation));
            }
        }
        return this.index();
    }

    public List<FileBean> getFilesToUpload() {
        return filesToUpload;
    }

    public void setFilesToUpload(List<FileBean> filesToUpload) {
        this.filesToUpload = filesToUpload;
    }
        
}
