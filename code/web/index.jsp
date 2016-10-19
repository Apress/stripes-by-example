<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <head>
        <title>Stripes Book Contents</title>
    </head>
    <body>        
        <h1>Stripes Book Contents</h1>
        
        <h2>Chapter 1</h2>
        <ul>
            <li><i>No runnable code samples</i></li>
        </ul>
        
        <h2>Chapter 2</h2>
        <ul>
            <li><i>No runnable code samples</i></li>
        </ul>
        
        <h2>Chapter 3</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter3.HelloWorldActionBean">HelloWorldActionBean</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter3.ShorterHelloWorldActionBean">ShorterHelloWorldActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 4</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter4.UrlMappingActionBean">UrlMappingActionBean#index</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter4.UrlMappingActionBean" event="eventOne">UrlMappingActionBean#eventOne()</stripes:link></li>
            <li><stripes:link href="${pageContext.request.contextPath}/action/UrlMapping/eventtwo">UrlMappingActionBean#differentMethodName()</stripes:link></li>
        </ul>
        
        <h2>Chapter 5</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter5.JspExamplesActionBean" event="variables">JspExamplesActionBean#variables()</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter5.JspExamplesActionBean" event="complex">JspExamplesActionBean#complexVariables()</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter5.JspExamplesActionBean" event="tags">JspExamplesActionBean#stripesTagLib()</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter5.JspExamplesActionBean" event="form">JspExamplesActionBean#stripesForm()</stripes:link></li>
        </ul>
        
        <h2>Chapter 6</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter6.FormProcessingActionBean" event="variables">FormProcessingActionBean</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter6.FormProcessingDTOActionBean" event="variables">FormProcessingDTOActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 7</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter7.SavingDataActionBean">SavingDataActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 8</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter8.LoginActionBean">LoginActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 9</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter9.ValidationActionBean">ValidationActionBean</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter9.ValidationAdvancedActionBean">ValidationAdvancedActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 10</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter10.OtherResolutionsActionBean">OtherResolutionsActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 11</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter11.AnnotationsActionBean">AnnotationsActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 12</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter12.I18nActionBean">I18nActionBean</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter12.I18nActionBean" event="form">I18nActionBean#i18nForm()</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter12.I18nActionBean" event="loadFromActionBean">I18nActionBean#loadFromActionBean()</stripes:link></li>
        </ul>
        
        <h2>Chapter 13</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter13.InterceptorDataActionBean">InterceptorDataActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 14</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter14.FileUploadActionBean">FileUploadActionBean</stripes:link></li>
            <li><stripes:link beanclass="org.stripesbook.chapter14.MultipleFileUploadActionBean">MultipleFileUploadActionBean</stripes:link></li>
        </ul>
        
        <h2>Chapter 15</h2>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter15.GoodDesignActionBean" event="basejsp">GoodDesignActionBean#baseJsp()</stripes:link></li>
        </ul>
    </body>
</html>
