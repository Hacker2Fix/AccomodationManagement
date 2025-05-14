
package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.StudentFacadeLocal;
import za.ac.tut.model.entity.Student;


public class UpdateServlet extends HttpServlet {
 @EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String phone = request.getParameter("phone");
        
        Student student = createStudent(id, phone);
        sfl.edit(student);
        request.setAttribute("student", student);
        
        String url="update_outcome.jsp";
        
        RequestDispatcher disp =request.getRequestDispatcher(url);
        disp.forward(request, response);
    }
    
    public Student createStudent(Long id, String phone){
    
        Student student = sfl.find(id);
        student.setPhoneNum(phone);
        
        return student;
    }

}
