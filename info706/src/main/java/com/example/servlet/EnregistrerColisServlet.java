package com.example.servlet;

import com.example.colis.Colis;
import com.example.service.ColisService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/enregistrerColisServlet")
public class EnregistrerColisServlet extends HttpServlet {

    @Inject
    private ColisService colisService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupérer les paramètres du formulaire
        double poids = Double.parseDouble(request.getParameter("poids"));
        double valeur = Double.parseDouble(request.getParameter("valeur"));
        String origine = request.getParameter("origine");
        String destination = request.getParameter("destination");

        // Créer un nouvel objet Colis
        Colis colis = new Colis();
        colis.setPoids(poids);
        colis.setValeur(valeur);
        colis.setOrigine(origine);
        colis.setDestination(destination);

        // Enregistrer le colis via le service EJB
        colisService.enregistrerColis(colis);

        // Rediriger vers la page de succès
        response.sendRedirect("index.jsp");
    }
}
