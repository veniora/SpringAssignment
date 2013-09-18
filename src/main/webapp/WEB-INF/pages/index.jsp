<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html>

<jsp:include page="fragments/headTag.jsp"/>

<body>
<script src="<c:url value="/resources/scripts/general.js"/>" ></script>

<h1><spring:message code="label.title"/> </h1>

<h2><spring:message code="label.users_title"/></h2>
<c:if test="${!empty userList}">
    <table>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td><a href="/user/${user.id}">${user.name}</a> </td>
                <td><a href="delete/user/${user.id}" onclick="return confirmRemoveUser()"> (remove)</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<form:form method="POST" action="/" modelAttribute="user">
   <table>
       <tr>
           <td><h3><form:label path="name"><spring:message code="label.add_user"/></form:label></h3></td>
       </tr>
       <tr>
           <td><form:input path="name"/></td>
           <td><input type="submit" value="" class="addUserButton" alt="Click to add new user"></td>
       </tr>
   </table>
</form:form>
</body>
</html>