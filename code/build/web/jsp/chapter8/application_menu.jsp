<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>Menu:</h1>
        <ul>
            <li><stripes:link beanclass="org.stripesbook.chapter8.Page1ActionBean">Page 1</stripes:link></li>
            <li>
                <stripes:link beanclass="org.stripesbook.chapter8.Page2ActionBean">
                    <stripes:param name="someParam">Passed in Value</stripes:param>
                    Page 2 <i>(with a URL parameter).</i>
                </stripes:link>
            </li>
            <li><stripes:link beanclass="org.stripesbook.chapter8.LoginActionBean">Back to login</stripes:link></li>
        </ul>
    </body>
</html>