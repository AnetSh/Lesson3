package task2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anet on 11.04.2016.
 * Task 2
 */
@WebServlet("/Q1Task2")
public class Q1Task2 extends HttpServlet {

    /**
     * Saves the first answer. Redirects to the second question.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Task2.names.add(request.getParameter("language1"));
        response.setContentType("text/html; charset=utf-8");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/quest2Task2.html");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
