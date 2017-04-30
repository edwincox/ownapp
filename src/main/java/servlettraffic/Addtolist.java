package servlettraffic;

import Controller.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Addtolist extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Nodige voor verficatie om welke user het gaat
        String voornaam = request.getParameter("voornaam");
        String achternaam = request.getParameter("achternaam");

        Controller objectvoordedatabase = new Controller();
        objectvoordedatabase.createAccountForUser(voornaam, achternaam);

        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
                "transitional//en\">\n";

        String title = "add New User Into The List Database";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head><body>\n"+
                "<h1 align=\"center\">" + title + "</h1>\n"
                + "Waarde ingevuld: <br>"
                + "Voornaam: " + request.getParameter("voornaam") + "<br>"
                + "Achternaam: " + request.getParameter("achternaam")
                + "</body></html>"
        );
    }
}