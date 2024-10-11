<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Mise à jour de la Position d'un Colis</title>
</head>
<body>
    <h1>Mettre à jour la position d'un colis</h1>
    <form action="miseAJourPositionServlet" method="post">
        <label for="colisId">ID du Colis:</label>
        <input type="text" id="colisId" name="colisId" required /><br><br>

        <label for="latitude">Latitude:</label>
        <input type="text" id="latitude" name="latitude" required /><br><br>

        <label for="longitude">Longitude:</label>
        <input type="text" id="longitude" name="longitude" required /><br><br>

        <label for="emplacement">Emplacement:</label>
        <input type="text" id="emplacement" name="emplacement" required /><br><br>

        <label for="etat">État:</label>
        <select id="etat" name="etat">
            <option value="Enregistrement">Enregistrement</option>
            <option value="En attente">En attente</option>
            <option value="En acheminement">En acheminement</option>
            <option value="Bloqué">Bloqué</option>
            <option value="Livré">Livré</option>
        </select><br><br>

        <input type="submit" value="Mettre à jour la position" />
    </form>
</body>
</html>
