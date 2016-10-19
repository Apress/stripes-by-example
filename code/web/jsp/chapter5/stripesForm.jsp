<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        
        <p>Form fields using stripes:form tags...</p>
        <stripes:form beanclass="${actionBean.class}">
            <stripes:text     name="" value="" />
            <stripes:checkbox name="" value="" />
            <stripes:radio    name="" value="" />
            <stripes:hidden   name="" value="" />
            <stripes:select   name="">
                <stripes:option value="1">Option 1</stripes:option>
                <stripes:option value="2">Option 2</stripes:option>
            </stripes:select>
            <stripes:button name="" value="Button" />
            <stripes:submit name="" value="Submit" />            
        </stripes:form>
                
        <p>In the next chapter we will see form submission and processing.</p>
    </body>
</html>