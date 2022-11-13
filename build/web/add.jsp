<%-- 
    Document   : add
    Created on : Nov 13, 2022, 8:23:16 PM
    Author     : Tinip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Table</title>
    </head>
    <body>
        <p><h1>ID: <%=request.getParameter("id") %></h1></p>
        <p><h1>Name: <%=request.getParameter("name") %></h1></p>
        <p><h1>Gpa: <%=request.getParameter("gpa") %></h1></p>
        <p><h1>is added</h1></p
        <%@include file = "table.jsp" %>
    </body>
</html>
