<%@include file="taglibs.jsp" %>
<stripes:layout-definition>
    <html>
        <head>
            <title>Stripes By Example</title>
            <!-- CSS includes -->
            <!-- JavaScript includes -->
        </head>
        <body>
            <jsp:include page="./header.jsp" />
            <stripes:layout-component name="contents"/><%-- see <stripes:layout-component name="contents">...</stripes:layout-component> in page1.jsp --%>
            <jsp:include page="./footer.jsp" />
        </body>
    </html>
</stripes:layout-definition>
