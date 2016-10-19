<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <h2>Topics:</h2>
        <c:forEach items="${actionBean.bookTopics}" var="topic">
            <c:out value="${topic}" /> <%-- Note: just "${topic}" would also work (c:out not necessary). --%> 
            <br />
        </c:forEach>
        <br />
            
        <h2>All Chapters</h2>
        <table>
            <thead>
                <tr>
                    <th>Chapter #</th>
                    <th>Chapter Title</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${actionBean.chapters}" var="chapter">            
                    <tr>
                        <td><c:out value="${chapter.key}" /></td>
                        <td><c:out value="${chapter.value}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p><b>Chapter 5 title:</b> ${actionBean.chapters.Chapter5}</p>
        
        
    </body>
</html>
