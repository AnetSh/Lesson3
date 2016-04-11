package task2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Anet on 11.04.2016.
 */
@WebServlet("/Q2Task2")
public class Q2Task2 extends HttpServlet {

    /**
     * Saves the second answer. Prints a list of surveyed participants.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Task2.names.add(request.getParameter("language2"));
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        for (int i=0; i<Task2.names.size();i+=3){
            out.println("<p><b>"+Task2.names.get(i)+"</b>-> Java: "+Task2.names.get(i+1)+", C#: "+Task2.names.get(i+2)+"</p>");
        }
        out.println("<a href=\"" + response.encodeUrl("/index.html") + "\">Again</a>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}
