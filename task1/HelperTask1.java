package task1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Anet on 11.04.2016.
 * Task 1
 */
@WebServlet("/HelperTask1")
public class HelperTask1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * If the item "zero"  is selectes, the counter resets.
     * Returns to the start page.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("zero")!=null) {
            Task1.counter = new HashMap<>();
            for (int i = 0; i < 4; i++) {
                Task1.counter.put(i, 0);
            }
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/question.html");
        dispatcher.forward(request, response);
    }
}
