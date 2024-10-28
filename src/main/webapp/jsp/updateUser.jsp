<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
    <title>Update User</title>
</head>
<body>
<h2>Update User</h2>
<html:form action="/updateUser.do">
    <html:hidden property="id" />
    <p>Name: <html:text property="name" /></p>
    <p>Email: <html:text property="email" /></p>
    <p><html:submit value="Update" /></p>
</html:form>
</body>
</html>
