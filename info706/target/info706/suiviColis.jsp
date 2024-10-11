<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Suivi de la Progression d'un Colis</title>
</head>
<body>
    <h1>Suivre la progression d'un colis</h1>
    <form action="suiviColisServlet" method="get">
        <label for="colisId">ID du Colis:</label>
        <input type="text" id="colisId" name="colisId" required /><br><br>

        <input type="submit" value="Voir la progression" />
    </form>

    <!-- Affichage des informations de suivi -->
    <h2>Historique des positions :</h2>
    <table border="1">
        <tr>
            <th>Date</th>
            <th>Latitude</th>
            <th>Longitude</th>
            <th>Emplacement</th>
            <th>État</th>
        </tr>
        <%
            // Code Java pour afficher la liste des positions du colis
            List<Position> positions = (List<Position>) request.getAttribute("positions");
            if (positions != null) {
                for (Position position : positions) {
        %>
            <tr>
                <td><%= position.getDateMiseAJour() %></td>
                <td><%= position.getLatitude() %></td>
                <td><%= position.getLongitude() %></td>
                <td><%= position.getEmplacement() %></td>
                <td><%= position.getEtat() %></td>
            </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>
