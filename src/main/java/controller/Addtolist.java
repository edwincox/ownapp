package controller;

import application.Addnewusertothelist;

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

        addToList(voornaam, achternaam);

    }

    public void addToList(String voornaam, String achternaam){
        Addnewusertothelist addNewUser = new Addnewusertothelist(voornaam, achternaam);
        addNewUser.addNewUserIntoTheListDatabase();
    }

}