package org.stripesbook.chapter12;

import java.io.StringReader;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.StreamingResolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.controller.StripesFilter;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/i18n")
public class I18nActionBean extends BaseActionBean{
    //i18n stands for Internationalization.  (i.e., "i[18_other_characters]n"
        
    /**
     * Providing multiple locales in your application
     * <filter>
     *   <display-name>Stripes Filter</display-name>
     *   <filter-name>StripesFilter</filter-name>
     *   <filter-class>net.sourceforge.stripes.controller.StripesFilter</filter-class>
     *   <init-param>
     *       <param-name>ActionResolver.Packages</param-name>
     *       <param-value>
     *           org.stripesbook.chapter1,
     *           org.stripesbook.chapter2,
     *           ...
     *           org.stripesbook.chapterX
     *       </param-value>
     *   </init-param>
     *   <init-param>
     *       <param-name>LocalePicker.Locales</param-name>
     *       <param-value>en_US,en_GB,fr_CA</param-value> <!-- US English, Great Britan English, Candian French -->
     *       Stripes has many options, including Locale, Language Codes, Script codes, and also character encodings.
     *       For more details see:
     *          http://download.oracle.com/javase/tutorial/i18n/locale/create.html
     *          and http://www.stripesframework.org/display/stripes/Localization
     *   </init-param>
     * </filter>
     */
    
    //A users requested locale can be changed/configured in their webbrowser settings
    //The Best possible match from the available list of locals in web.xml is picked.
    
    //File named StripesResources.properties, StripesResources_en_US.properties, 
    // StripesResources_fr_CA.properties, etc should be on your classpath.
 
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/chapter12/i18n.jsp");
    }
    
    @HandlesEvent("form")
    public Resolution i18nForm(){
        return new ForwardResolution("/jsp/chapter12/i18n_form.jsp");
    }
    
    @HandlesEvent("loadFromActionBean")
    public Resolution loadPropertyFromActionBean(){
        String propertyValue = StripesFilter.getConfiguration().getLocalizationBundleFactory().getFormFieldBundle(getContext().getLocale()).getString("stripes.book.field.name");
        return new StreamingResolution("text", new StringReader("Property Value: " + propertyValue));
    }
}
