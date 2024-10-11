package com.example.servlet;

import com.example.colis.Position;
import com.example.service.ColisService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/miseAJourPositionServlet")
public class MiseAJourPositionServlet extends HttpServlet {

    @Inject
    private ColisService colisService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupérer les paramètres du formulaire
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        String emplacement = request.getParameter("emplacement");
        String etat = request.getParameter("etat");
        Long colisId = Long.parseLong(request.getParameter("colisId"));

        // Créer une nouvelle position
        Position position = new Position();
        position.setLatitude(latitude);
        position.setLongitude(longitude);
        position.setEmplacement(emplacement);
        position.setEtat(etat);
        position.setDateMiseAJour(new Date());

        // Enregistrer la position
        colisService.enregistrerPosition(position);

        // Rediriger vers la page d'accueil
        response.sendRedirect("index.jsp");
    }
}
