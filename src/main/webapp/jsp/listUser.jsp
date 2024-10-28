<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
    <title>List Users</title>
</head>
<body>
<h2>User List</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
              <td>${user.id}</td>
              <td>${user.name}</td>
               <td>${user.email}</td>
            <td>
                <a href="viewUser.do?id=${user.id}">View</a>
                <a href="updateUser.do?id=${user.id}">Edit</a>
                <a href="deleteUser.do?id=${user.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<p><a href="/jsp/createUser.jsp">Create New User</a></p>
</body>
</html>


