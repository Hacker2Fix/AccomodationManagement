<%-- 
    Document   : display_outcome
    Created on : 12-May-2025, 01:37:13
    Author     : Hello
--%>

<%@page import="za.ac.tut.model.entity.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page</title>
    </head>
    <body>
        <h1>Search</h1>
        <p>
            Below is the information:
        </p>
        <%
            List<Student> list=(List<Student>)request.getAttribute("student");
        %>
        <table border="1">
            <th>Student no:</th>
            <th>Name:</th>
            <th>Surname:</th>
            <th>Gender:</th>
            <th>Nsfas:</th>
            <th>Email:</th>
            <th>Phone no:</th>
            <th>Guardian name:</th>
            <th>Guardian no:</th>
            <%
                for(int i=0;i<list.size();i++){
                    Student s=list.get(i);
                    Long id=s.getId();
                    String name=s.getName();
                    String surname=s.getSurname();
                    String gender=s.getGender();
                    String status=s.getBursary_status();
                    String email=s.getEmail();
                    String phone=s.getPhoneNum();
                    String Guard=s.getGurdian_name();
                    String GuardNum=s.getGurdianPhoneNum();
            %>
            <tr>
                <td><%=id%></td>
                <td><%=name%></td>
                <td><%=surname%></td>
                <td><%=gender%></td>
                <td><%=status%></td>
                <td><%=email%></td>
                <td><%=phone%></td>
                <td><%=Guard%></td>
                <td><%=GuardNum%></td>
            </tr>
            <%
                } 
            %>
        </table>
        <ol>
            <li><a href="adminHome.jsp">admin menu</a></li>
            <li><a href="index.html">Main menu</a></li>
        </ol>
        
    </body>
</html>
