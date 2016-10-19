<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>Page 2</h1>
        <b>Passed In Parameter</b>: ${actionBean.someParam}
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter8.ApplicationMenuActionBean">Back to Menu</stripes:link></li>
            <%--<li><stripes:link href="${pageContext.request.contextPath}/jsp/chapter8/page1.jsp">Direct jsp link</stripes:link></li>--%>
            <li><stripes:link beanclass="org.stripesbook.chapter8.LoginActionBean">Back to login</stripes:link></li>            
        </ul>
    </body>
</html>