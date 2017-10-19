package qwerty;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckBox extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Reading Checkbox data";
        String docType=
                "<!doctype html>\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n"+
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<hl align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                " <li><b>Maths Flag</b>: "
                + request.getParameter( "maths") + "\n" +
                "<li><b>Physics Flag</b>: "
                +request.getParameter( "physics") + "\n" +
                        "<li><b>Chemistry Flag</b>: "
                +request.getParameter( "chemistry") + "\n" +
                "</ul>\n" +
                "</body>\n" +
                "</html>");
    }
    }

