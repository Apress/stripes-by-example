package org.stripesbook.chapter11;

import java.util.ArrayList;
import java.util.List;
import net.sourceforge.stripes.action.After;
import net.sourceforge.stripes.action.Before;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.action.UrlBinding;
import org.stripesbook.common.BaseActionBean;

@UrlBinding("/action/annotations")
@SessionScope //Instance of this class will remain in the users session 
              //vs. a new instance being made on every request.
public class AnnotationsActionBean extends BaseActionBean  {
    
    private static int numRequests = 0;  //Works because of @SessionScope
    
    /*
    @SpringBean("myDAOBean") //If you already use Spring in your application, you can auto-inject objects using the @SpringBean annotation.  
    private DAO myDAO;
    
    Note: a 'SpringInterceptor' needs to be setup in web.xml for this to work.  
    Example:
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/spring-context.xml</param-value>
    </context-param>
    */
    
    @Before
    public void before(){
        System.out.println("This will run before any event method runs.");
        numRequests++;
    }
    
    @After
    //Also available: 
    //  @After(on="index")
    //  @After(stages= {LifecycleStage.CustomValidation, LifecycleStage.EventHandling, etc}) 
    //        --> Runs after each of the given stages:
    //            Which are (in the order they are executed):
    //               LifecycleStage.ActionBeanResolution
    //               LifecycleStage.HandlerResolution
    //               LifecycleStage.BindingAndValidation
    //               LifecycleStage.CustomValidation
    //               [Default @Before & @After will happen at this point]
    //               LifecycleStage.EventHandling
    //               LifecycleStage.ResolutionExecution
    //               LifecycleStage.RequestComplete
    /**
     * Descriptions directly from Stripes JavaDoc (http://stripes.sourceforge.net/docs/current/javadoc/net/sourceforge/stripes/controller/LifecycleStage.html):
     * LifecycleStage.ActionBeanResolution - First major lifecycle stage. Involves the location of the ActionBean class that is bound to the URL being requested, and usually also the creation of a new instance of that class.
     * LifecycleStage.HandlerResolution - Second major lifecycle stage. Involves the determination of the event name in the request (if there is one), and the location of the Method which handles the even.
     * LifecycleStage.BindingAndValidation - Third major lifecycle stage. Involves the processing of all validations specified through @Validate annotations as well as the type conversion of request parameters and their binding to the ActionBean.
     * LifecycleStage.CustomValidation - Fourth major lifecycle stage. Involves the execution of any custom validation logic exposed by the ActionBean.
     * LifecycleStage.EventHandling - Fifth major lifecycle stage. The actual execution of the event handler method. Only occurs when the prior stages have produced no persistent validation errors.
     * LifecycleStage.ResolutionExecution - Sixth major lifecycle stage. Is executed any time a Resolution is executed, either as the outcome of an event handler, or because some other mechanism short circuits processing by returning a Resolution.
     * LifecycleStage.RequestInit - Executed before any processing occurs on the request. No Stripes processing is associated with this stage. It is simply provided as a hook for interceptors.
     * LifecycleStage.RequestComplete - Final lifecycle stage. Executes in the finally block of the request so it will always be called when a request terminates regardless of any other conditions. This is only useful for cleaning up because Resolution execution has already occurred. 
     */    
    public void after(){
        System.out.println("This will run after the event method runs.");
        System.out.println(this.getContext());
    }
    
    
    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution("/jsp/chapter11/annotations.jsp"); //We've seen this before
    }
        
    public int getNumRequests() {
        return numRequests;
    }

}
