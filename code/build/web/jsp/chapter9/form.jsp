<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>Validation:</h1>

        <%-- <stripes:errors /> --%>
        <div class="errors">
            <stripes:errors>
                <stripes:errors-header><b>Validation Errors</b><br /></stripes:errors-header>
                <stripes:individual-error/><br />
                <stripes:errors-footer><hr/></stripes:errors-footer>
            </stripes:errors> 
        </div>

        <stripes:form beanclass="${actionBean.class}">
            Name: <stripes:text name="name" /><br />
            Age: <stripes:text name="age" /><br />
            Phone Number: <stripes:text name="phoneNumber" />(xxx-xxx-xxxx)<br />

            <stripes:submit name="submit" value="OK" />
        </stripes:form>

    </body>
</html>