package task2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Anet on 11.04.2016.
 * Task 2
 * Create a form for the name. Ask a 2 questions using the element "radio". Print a list of all survey participants.
 */
@WebServlet("/Task2")
public class Task2 extends HttpServlet {

    public static ArrayList<String> names;

    public Task2(){
        names = new ArrayList<String>();
    }

    /**
     * Saves name. Redirects to the first question.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        names.add(request.getParameter("name"));
        response.setContentType("text/html; charset=utf-8");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/quest1Task2.html");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
