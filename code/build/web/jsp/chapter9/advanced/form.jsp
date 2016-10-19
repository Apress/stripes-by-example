<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>Advanced Validation:</h1>
        <div class="errors">
            <stripes:errors>
                <stripes:errors-header><b>Validation Errors</b><br /></stripes:errors-header>
                <stripes:individual-error/><br />
                <stripes:errors-footer><hr/></stripes:errors-footer>
            </stripes:errors>
        </div>
        
        <stripes:form beanclass="${actionBean.class}">
            Name: <stripes:text name="name" /><br />
            Address 1: <stripes:text name="address.address1" /><br />
            Address 2: <stripes:text name="address.address2" /><br />
            City: <stripes:text name="address.city" /><br />
            State: <stripes:text name="address.state" /><br />
            Country: <stripes:text name="address.country" /><br />
            Zip: <stripes:text name="address.zipCode" /><br />

            <stripes:submit name="submit" value="OK" />
        </stripes:form>
                
    </body>
</html>