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
            <%--TODO set as links to /user/<id>--%>
            <li>${user.name}</li>
        </c:forEach>
    </ul>
</c:if>
<%--TODO create form for adding new users--%>
</body>
</html>