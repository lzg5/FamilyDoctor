package Servlet;
//导包
import Dao.DoctorDao;
import bean.Doctor;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MyDoctorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DoctorDao dao=new DoctorDao();
        ServletContext application = req.getServletContext();
        String name = (String)application.getAttribute("username");
        List<Doctor> doctor = dao.findMyDoctor(name);
        req.setAttribute("doctor", doctor);//放到request域中
        req.getRequestDispatcher("/MyDoctor.jsp").forward(req, resp);
    }
}
