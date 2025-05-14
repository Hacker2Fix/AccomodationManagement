<%-- 
    Document   : update_outcome
    Created on : May 13, 2025, 1:44:53 PM
    Author     : Nare
--%>

<%@page import="za.ac.tut.model.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Outcome Page</title>
    </head>
    <body>
        <h1>Update outcome</h1>
        <%
           Student student = (Student)request.getAttribute("student");
        %>
        <p><%=student.getName()%> changed contact number to <%=student.getPhoneNum()%></p>
       <br>
         <ol>
            <li><a href="adminHome.jsp">admin menu</a></li>
            <li><a href="index.html">Main menu</a></li>
        </ol>
    </body>
</html>
