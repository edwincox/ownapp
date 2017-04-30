package servlettraffic;

import Controller.Controller;
import application.AccountCredentials;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Viewlist extends HttpServlet{

            public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            response.setContentType("text/html");

            PrintWriter out = response.getWriter();

            // Nodige voor verficatie om welke user het gaat
            int number = Integer.parseInt(request.getParameter("number"));

            Controller objectvoordedatabase = new Controller();
            AccountCredentials objectOpgehaald = objectvoordedatabase.getAccountForUser(number);

            String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
            "transitional//en\">\n";

            String title = "add New User Into The List Database";

            out.println(docType +
                    "<html>\n" +
                    "<head><title>" + title + "</title></head><body>\n"+
                    "<h1 align=\"center\">" + title + "</h1>\n"
                    + "Waarde ingevuld: <br>"
                    + "nummer wat je hebt opgeven: " + request.getParameter("number") + "<br>"
                    + "voornaam: " + objectOpgehaald.getVoornaam()
                    //+ "<br> Achternaam = " + objectOpgehaald.getAchternaam()
                    + "</body></html>"
            );
        }
    }