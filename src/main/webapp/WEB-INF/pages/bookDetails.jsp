<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 19/09/13
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="fragments/headTag.jsp"/>
<body>

<h1>Title: ${book.title}</h1>
<h2>Author: ${book.author}</h2>
<h3>ISBN: ${book.isbn}</h3>

</body>
</html>