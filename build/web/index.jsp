<%-- 
    Document   : index
    Created on : Nov 13, 2022, 8:07:22 PM
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
        <form action="addStudent">
            <p>ID:<input type="text" name="id" value="" size="20" /></p>
            <p>Name:<input type="text" name="name" value="" size="20" /></p>
            <p>Gpa:<input type="text" name="gpa" value="" size="20" /></p>
            <input type="submit" value="send" name="send" />
        </form>
    </body>
</html>
