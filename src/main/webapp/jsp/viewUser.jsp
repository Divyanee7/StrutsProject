<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
    <title>View User</title>
</head>
<body>
<h2>View User</h2>
ID: ${user.id}</p>
Name: ${user.name}</p>
Email: ${user.email}</p>
<p><a href="listUsers.jsp">Back to List</a></p>
</body>
</html>