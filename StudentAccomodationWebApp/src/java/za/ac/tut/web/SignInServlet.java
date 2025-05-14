/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.StudentFacadeLocal;
import za.ac.tut.model.entity.Student;

/**
 *
 * @author Hello
 */
public class SignInServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id=Long.parseLong(request.getParameter("id"));
        String name=request.getParameter("name");
        String surname=request.getParameter("surname");
        String gender=request.getParameter("gender");
        String idno=request.getParameter("idno");
        String phone=request.getParameter("phone");
        String guard=request.getParameter("guard");
        String guardName=request.getParameter("guardName");
        String guardPhone=request.getParameter("guardPhone");
        String status=request.getParameter("status");
        String email=request.getParameter("email");
        Integer room=Integer.parseInt(request.getParameter("room"));
        
        Student student=createStud(id,name,surname,gender,idno,phone,guard,guardName,guardPhone,status,room,email);
        sfl.create(student);
        
        String url="signup_outcome.html";
        
        RequestDispatcher disp =request.getRequestDispatcher(url);
        disp.forward(request, response);
    }

    private Student createStud(Long id, String name, String surname, String gender, String idno, String phone, String guard, String guardName, String guardPhone, String status, Integer room,String email) {
        Student s=new Student();
        s.setId(id);
        s.setName(name);
        s.setSurname(surname);
        s.setGender(gender);
        s.setIdno(idno);
        s.setPhoneNum(phone);
        s.setGurdian(guard);
        s.setGurdian_name(guardName);
        s.setGurdianPhoneNum(guardPhone);
        s.setBursary_status(status);
        s.setRoomNo(room);
        s.setEmail(email);
        s.setCreationDate(new Date());
        
        return s;
    }

}
