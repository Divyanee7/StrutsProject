<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
    <title>Create User</title>
</head>
<body>
    <h2>Create User</h2>
    <html:form action="/createUser">
        <p>Name: <html:text property="name" /></p>
        <p>Email: <html:text property="email" /></p>
        <p><html:submit value="Create" /></p>
    </html:form>
</body>
</html>