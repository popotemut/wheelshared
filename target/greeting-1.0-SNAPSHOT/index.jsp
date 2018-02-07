<%-- 
    Document   : newjsp
    Created on : Dec 10, 2017, 2:59:31 PM
    Author     : maewaranya
--%>

<%@page import="model.Vocabulary"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            Vocabulary v = new Vocabulary();
            String s = v.getVocab(v.connectionBuilder());
<<<<<<< HEAD
            
//            String s = v.getVocab();
=======
>>>>>>> 6df1fb9dbda1b1eb76ceb5008dfe203890eb71ee
            out.println(s);
            %></h1>
    </body>
</html>
