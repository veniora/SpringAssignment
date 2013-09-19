<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<jsp:include page="fragments/headTag.jsp"/>

<head>
    <title></title>
</head>
<body>
<h1 class="uHome"><spring:message code="label.title2"/></h1>
<h1 class="uHome"><spring:message code="label.books_title"/></h1>

<br><br>
<c:if test="${!empty bookList}">
    <table>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <%--<td><img src="http://books.google.com/books?vid=ISBN${book.isbn}&printsec=frontcover&img=1&zoom=1"/></td>--%>
                <td><a href="/book/${book.id}">${book.title}</a> </td>
                <%--<td><a href="/book/${book.id}">${book.author}</a> </td>--%>
                <%--<td><a href="delete/book/${book.id}" onclick="return confirmRemoveBook()"> (remove)</a></td>--%>
            </tr>
        </c:forEach>
    </table>
</c:if>


<form:form method="POST" action="/user/${userId}" modelAttribute="book">
    <table>
        <tr>
            <td><h3><form:label path="title"><spring:message code="label.add_book"/></form:label></h3></td>
        </tr>
        <tr>
            <td><form:label path="title">Title</form:label></td>
            <td><form:input path="title"/></td>
        </tr>
        <tr>
            <td><form:label path="author">Author</form:label></td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td><form:label path="isbn">ISBN</form:label></td>
            <td><form:input path="isbn"/></td>
        </tr>
        <tr>
            <td style="visibility: hidden"><form:input path="user_id"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="" class="addUserButton" alt="Add new book"></td>
        </tr>
    </table>
</form:form>

</body>
</html>