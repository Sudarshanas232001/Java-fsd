import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class Question1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Getting data from the query string
        String name = request.getParameter("name");
        
        out.println("<html><body>");
        out.println("<h1>GET Method Demo</h1>");
        out.println("<p>Hello, " + name + "!</p>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Getting data from the request body
        String name = request.getParameter("name");
        
        out.println("<html><body>");
        out.println("<h1>POST Method Demo</h1>");
        out.println("<p>Hello, " + name + "!</p>");
        out.println("</body></html>");
    }
}
