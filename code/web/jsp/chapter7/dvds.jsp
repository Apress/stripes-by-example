<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <h1>DVD Collection:</h1>
        <c:if test="${actionBean.dvds!=null}">
            <table border="1">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Genre</th>
                        <th>Cost</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${actionBean.dvds}" var="dvd">
                        <tr>
                            <td>${dvd.title}</td>
                            <td>${dvd.genre}</td>
                            <td>${dvd.cost}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <br />
        <fieldset>
            <legend>New DVD</legend>

            <stripes:form beanclass="${actionBean.class}">
                Title:<stripes:text name="newDvd.title" /><br />

                Genre:<stripes:select name="newDvd.genre">
                    <stripes:option value="Comedy">Comedy</stripes:option>
                    <stripes:option value="Romance">Romance</stripes:option>
                    <stripes:option value="Action">Action</stripes:option>
                    <stripes:option value="Horror">Horror</stripes:option>
                    <stripes:option value="Other">Other</stripes:option>
                </stripes:select><br />

                Cost: $<stripes:text name="newDvd.cost" /><br />

                <stripes:submit name="save" value="Submit" />
            </stripes:form>
        </fieldset>
                
    </body>
</html>