<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html>

<jsp:include page="fragments/headTag.jsp"/>

<body>
<h1>Personal Library Manager</h1>

<h2>Users</h2>
<c:if test="${!empty userList}">
    <ul>
        <c:forEach items="${userList}" var="user">
            <li>${user.name}</li>
        </c:forEach>
    </ul>
</c:if>
	<%--<h1>${message}</h1>--%>
	<%--<p>${message2}</p>--%>
</body>
</html>