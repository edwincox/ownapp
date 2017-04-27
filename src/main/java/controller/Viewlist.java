package controller;

import application.Listdatabase;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Viewlist extends HttpServlet{

    private Listdatabase listdatabase;

        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            response.setContentType("text/html");

            PrintWriter out = response.getWriter();

            // Nodige voor verficatie om welke user het gaat
//            String voornaam = request.getParameter("voornaam");
//            String achternaam = request.getParameter("achternaam");


//            Listdatabase list  = new Listdatabase();
            int totaalAaantalObjectenInDeLijst = listdatabase.letSeeTheList();

            String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
                    "transitional//en\">\n";

            String title = "add New User Into The List Database";

            out.println(docType +
                    "<html>\n" +
                    "<head><title>" + title + "</title></head><body>\n"+
                    "<h1 align=\"center\">" + title + "</h1>\n"
                    + "Waarde ingevuld: <br>"
                    + "totaalAaantalObjectenInDeLijst: " + request.getParameter("totaalAaantalObjectenInDeLijst") + "<br>"
                    + "totaal = " + totaalAaantalObjectenInDeLijst
                    + "</body></html>"
            );
        }
    }