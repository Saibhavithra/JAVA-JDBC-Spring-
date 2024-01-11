<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.List"%>
    <%@ page import ="java.util.ArrayList"%>
     <%@ page import ="com.training.web.model.User"%>
   <!--  <%@ taglib prefix="c" uri="http://java.sun.com.jsp/jst1/core" %> --> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--   <% String name=(String) request.getAttribute("name");%> --> <!-- Sriptlet -->

<h1>Hello ${user.name} from jsp</h1>
<!--  <a href="/logout">Logout</a>-->
<% List<User> userList = (ArrayList<User>) request.getAttribute("users");  %>
<table>
<tr>
<th>NAME</th>
<th>PASSWORD</th>
<th>EMAIL</th>

<tr>
<c: forEach items="${users}" var = "user">
<tr>
<td><c:out value =${user.getUserName()}"</c:out>
<td><c:out value =${user.getUserName()}"</c:out>
<td><c:out value =${user.getUserName()}"</c:out>
</c:>
</tr>

<!--  
 }

 }
<%--  <%
//for(int i=0; i<userList.size();i++)
for(User user: userList)
{%>
--%>
-->
<%--  
<!--  <tr>
<!-- <td><%=  user.getUserName() %></td>-->
<!-- <td><%=  user.getPassword() %></td>-->
<!-- <td><%=  user.getEmail() %></td>-->
<!-- </tr>-->
--%>
<%-- <%} %>	
	
%>

-->
-->
</table>
</body>
</html>

