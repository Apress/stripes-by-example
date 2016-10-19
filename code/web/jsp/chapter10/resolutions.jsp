<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <head>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
    </head>
    <body>
        <h1>Resolutions:</h1>
        <c:if test="${actionBean.message!=''}">
            <b>actionbean message:</b> <i>${actionBean.message}</i>
        </c:if>
        <ul>
            <li>
                <stripes:link beanclass="${actionBean.class}" event="simpleredirectresolution">
                    Simple RedirectResolution
                </stripes:link>
            </li>
            <li>
                <stripes:link beanclass="${actionBean.class}" event="complexredirectresolution">
                    <stripes:param name="whichResolution" value="withEvent" />
                    RedirectResolution With Specified Event
                </stripes:link>
            </li>
            <li>
                <stripes:link beanclass="${actionBean.class}" event="complexredirectresolution">
                    <stripes:param name="whichResolution" value="addParameter" />
                    RedirectResolution With Add Parameter
                </stripes:link>
            </li>
            <li>
                <stripes:link beanclass="${actionBean.class}" event="complexredirectresolution">
                    <stripes:param name="whichResolution" value="includeRequestParameters" />
                    RedirectResolution With includeRequestParameters() 
                </stripes:link>
                <i style="font-size: 8pt">Will cause redirect loop error, because whichResolution=includeRequestParameters will be re-passed continuously.</i>
            </li>
            <li>
                <stripes:link beanclass="${actionBean.class}" event="complexredirectresolution">
                    <stripes:param name="whichResolution" value="setPermanent" />
                    RedirectResolution With setPermanent(true)
                </stripes:link>
                <i style="font-size: 8pt">Message will only get set once, the browser will cache the redirect.</i>
            </li>
            <li>
                <stripes:link beanclass="${actionBean.class}" event="complexredirectresolution">
                    <stripes:param name="whichResolution" value="someInvalidResolution" />
                    ErrorResolution
                </stripes:link>
            </li>
            <li>
                <stripes:link beanclass="${actionBean.class}" event="simplestreamingresolution">
                    Simple StreamingResolution
                </stripes:link>
            </li>
            <li>
                <a href="#" onclick="doAjaxCall()">
                    Ajax StreamingResolution
                </a>
                <b>Ajax Response: </b><div id="ajaxReponse" style="display: inline"></div>
            </li>
            <li>
                <stripes:link beanclass="${actionBean.class}" event="streamfilestreamingresolution">
                    Stream/Write a File StreamingResolution
                </stripes:link>
            </li>
        </ul>
        <script type="text/javascript">
            function doAjaxCall(){                
                $('#ajaxReponse').load('${pageContext.request.contextPath}/action/otherresolutions/ajaxresponsestreamingresolution');
            }
        </script>
    </body>
</html>