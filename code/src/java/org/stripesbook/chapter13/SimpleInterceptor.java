package org.stripesbook.chapter13;

import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Interceptor;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;

@Intercepts({LifecycleStage.ActionBeanResolution,
             LifecycleStage.HandlerResolution,
             LifecycleStage.BindingAndValidation,
             LifecycleStage.CustomValidation,
             LifecycleStage.EventHandling,
             LifecycleStage.ResolutionExecution}) //This interceptor will capture all LifeCycle stages.
public class SimpleInterceptor implements Interceptor{

    //A great way to either log requests or build login/security into
    //an application.
    
    @Override
    public Resolution intercept(ExecutionContext context) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("<b>Current ActionBean being requested: </b>");
        sb.append(context.getActionBean());
        sb.append("\n");        
        
        sb.append("<b>Current ActionBean context: </b>");
        sb.append(context.getActionBeanContext());
        sb.append("\n");
        
        sb.append("<b>Method that will be called: </b>");
        sb.append(context.getHandler()); //Returns java.​lang.​reflect.Method.  Only available after HandlerResolution LifecycleStage.
        sb.append("\n");
        
        sb.append("<b>Current Lifecycle stage: </b>");
        sb.append(context.getLifecycleStage()); 
        sb.append("\n");
        
        sb.append("<b>Resolution: </b>");
        sb.append(context.getResolution());  //Resolution that will be returned.  Only available after ResolutionExecution LifecycleStage.
        sb.append("\n\n");
        
        InterceptorDataActionBean.addInterceptorData(sb.toString());
        return context.proceed();
    }

    /**
     * How to setup the interceptor in web.xml:
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
     *       <param-name>Extension.Packages</param-name>
     *       <param-value>org.stripesbook.chapter13</param-value>   //THIS PACKAGE WILL BE CHECKED FOR ANY STRIPES EXTENTIONS - INCLUDING INTERCEPTORS
     *   </init-param>
     * </filter>
     * 
     */
    
}
