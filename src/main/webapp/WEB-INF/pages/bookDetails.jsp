<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Assignment</title>

    <spring:url value="/resources/css/main.css" var="mainCss"/>
    <link href="${mainCss}" rel="stylesheet">
    <script src="<c:url value="/resources/scripts/general.js"/>" ></script>

</head>



<body>
    <div class="logoBodyHolder">
        <h1><spring:message code="label.title"/></h1>

        <div class="mainBody">
            <h1>Title: ${book.title}</h1>
            <h2>Author: ${book.author}</h2>
            <h3>ISBN: ${book.isbn}</h3>
        </div>
     </div>
</body>
</html>