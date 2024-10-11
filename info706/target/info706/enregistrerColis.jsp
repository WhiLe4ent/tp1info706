<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Enregistrement d'un Colis</title>
</head>
<body>
    <h1>Enregistrer un nouveau colis</h1>
    <form action="enregistrerColisServlet" method="post">
        <label for="poids">Poids:</label>
        <input type="text" id="poids" name="poids" required /><br><br>

        <label for="valeur">Valeur:</label>
        <input type="text" id="valeur" name="valeur" required /><br><br>

        <label for="origine">Origine:</label>
        <input type="text" id="origine" name="origine" required /><br><br>

        <label for="destination">Destination:</label>
        <input type="text" id="destination" name="destination" required /><br><br>

        <input type="submit" value="Enregistrer" />
    </form>
</body>
</html>
