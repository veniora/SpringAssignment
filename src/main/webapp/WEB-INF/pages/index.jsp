<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags" %>

<html>

<jsp:include page="fragments/headTag.jsp"/>

<body>
<h1>Personal Library Manager</h1>
<%-- Database call in here to display users --%>

	<h1>${message}</h1>
	<p>${message2}</p>
</body>
</html>