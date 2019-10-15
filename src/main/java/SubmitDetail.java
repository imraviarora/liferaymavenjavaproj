
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author badree.tiwari
 */
@WebServlet(urlPatterns = {"/SubmitDetail"})
public class SubmitDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
    
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
        
        String nname= req.getParameter("name");
//        out.println("here is your "+nname);
      //  PageContext.setAttribute("name",nname);
    req.setAttribute("name", nname);
        RequestDispatcher rd =  
             req.getRequestDispatcher("HelloMV.jsp");
        rd.forward(req,res);
    }
}
