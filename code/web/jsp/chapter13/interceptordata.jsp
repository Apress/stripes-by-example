<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>Interceptor Data</h1>
        <pre><c:forEach items="${actionBean.interceptorData}" var="data">${data}</c:forEach></pre>
    </body>
</html>