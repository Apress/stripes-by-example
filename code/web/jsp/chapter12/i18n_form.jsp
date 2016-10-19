<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>Internationalization Form Elements</h1>
        <stripes:form action="/stripesbook/action/i18n">
            <stripes:label name="myLabel" /><br />        
            <stripes:reset name="myReset" /><br />
            <stripes:button name="myButton" /><br />        
            <stripes:submit name="mySubmit" /><br />        
        </stripes:form>
    </body>
</html>