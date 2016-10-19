<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <p>Enter DVD Information:</p>
        <stripes:form beanclass="${actionBean.class}">
            Title:<stripes:text name="dvdTitle" /><br />
            
            Genre:<stripes:select name="dvdGenre">
                <stripes:option value="Comedy">Comedy</stripes:option>
                <stripes:option value="Romance">Romance</stripes:option>
                <stripes:option value="Action">Action</stripes:option>
                <stripes:option value="Horror">Horror</stripes:option>
                <stripes:option value="Other">Other</stripes:option>
            </stripes:select><br />
            
            Cost: $<stripes:text name="dvdCost" /><br />
            
            <stripes:submit name="save" value="Submit" />
        </stripes:form>
                
    </body>
</html>