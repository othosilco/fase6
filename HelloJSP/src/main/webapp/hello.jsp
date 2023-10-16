<%@page import="model.RoteiroGastronomico"%>
<%@page import="java.util.ArrayList" %>
<%@page import="model.Restaurante" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>.: Roteiro Gastronomico :. </title>
    </head>
    <body>
        <% 
        RoteiroGastronomico roteiro =
                            new RoteiroGastronomico(); 
        ArrayList<Restaurante> lista = roteiro.getLista();
        %>
        <h1> Roteiro Gastron�mico </h1>
        <hr>
        
        <% for (Restaurante r: lista){  %>
        <h3>  <%=r.getNome() %> </h3>
        <p>  Pre�o:<%=r.getEscalaPreco() %> </p>
        <p>  Qualidade: <%=r.getQualidade() %></p>
        <% } %>
    </body>
</html>