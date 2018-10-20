<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> <h3>welcome mr. - <%= request.getUserPrincipal().getName() %></h3>
<a href="logout">logout</a>
<h4>test privilege escalation!! ohuuuuuu!!</h4>

<h5><a href="admin/page1">admin page 1</a><br></h5>
<h5><a href="admin/page2">admin page 2</a><br></h5>
<h5><a href="admin/page3">admin page 3</a><br></h5>
<h5><a href="admin/page4">admin page 4</a><br></h5>

<h5><a href="user/page1">user page 1</a><br></h5>
<h5><a href="user/page2">user page 2</a><br></h5>
<h5><a href="user/page3">user page 3</a><br></h5>
<h5><a href="user/page4">user page 4</a><br></h5>

<h5><a href="user/openforward?fwd=page1.jsp">open forward</a><br></h5>

</body>
</html>