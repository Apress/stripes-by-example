<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>File Uploading</h1>        
        <stripes:form beanclass="${actionBean.class}">
            File 1: <stripes:file name="filesToUpload[0]" /><br />
            File 2: <stripes:file name="filesToUpload[1]" /><br />
            File 3: <stripes:file name="filesToUpload[2]" /><br />
            <br />
            <stripes:submit name="multiupload" value="Upload" />
        </stripes:form>
            
        <c:if test="${actionBean.filesToUpload!=null}">
            Files uploaded:
            <ul>
                <c:forEach items="${actionBean.filesToUpload}" var="fileBean">
                    <li>${fileBean.fileName}</li>
                </c:forEach>
            </ul>
        </c:if>
        
    </body>
</html>