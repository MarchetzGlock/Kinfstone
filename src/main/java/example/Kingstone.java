package example;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Kingstone extends HttpServlet {
    private String message;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        String nm = request.getParameter("fname");
        out.println("<html><body>");
        out.println("<h2>" + nm + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
