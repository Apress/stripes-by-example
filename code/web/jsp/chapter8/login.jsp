<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>Login:</h1>
        <c:if test="${actionBean.status!=null}">
            <b>${actionBean.status}</b><br /><br />
        </c:if>
            
        <stripes:form beanclass="org.stripesbook.chapter8.LoginActionBean">
            Username: <stripes:text name="username" /><br />
            Password: <stripes:text name="password" /><br />
            <stripes:submit name="login" value="OK" />
        </stripes:form>
        <i>Hint: "user"/"pass"</i>
    </body>
</html>