package task1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Created by Anet on 11.04.2016.
 * Task1. Creates a servlet for counting the number of clicks on the element "radio".
 * Resets the counter when it's need.
 */
@WebServlet("/Task1")
public class Task1 extends HttpServlet {

    private static final long serialVersionUID=1L;

    public static HashMap<Integer,Integer> counter;

    public Task1(){
        counter = new HashMap<>();
        for(int i=0;i<4;i++){
            counter.put(i,0);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getParameter("language1")){
            case "yes":
                counter.replace(0,counter.get(0)+1);
                break;
            case "no":
                counter.replace(1,counter.get(1)+1);
                break;
        }
        switch (request.getParameter("language2")){
            case "yes":
                counter.replace(2,counter.get(2)+1);
                break;
            case "no":
                counter.replace(3,counter.get(3)+1);
                break;
        }
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("Java yes: "+counter.get(0)+" no: "+counter.get(1));
        out.println("</br>C# yes: "+counter.get(2)+" no: "+counter.get(3));
        out.println("<form action=\"HelperTask1\"><p><input type=\"checkbox\" name=\"zero\" value=\"yes\">Set to zero</p>");
        out.println("<p><input type=\"submit\" value=\"Again\"></form></p>");
        out.close();
    }
}
