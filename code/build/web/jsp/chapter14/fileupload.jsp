<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>File Uploading</h1>        
        <stripes:form action="${pageContext.request.contextPath}/action/fileupload/upload">
            <stripes:file name="fileToUpload" />
            <br /><br />
            <stripes:submit name="upload" value="Upload" />
        </stripes:form>
            
        ${actionBean.message}
    </body>
</html>