<%-- 
    Document   : index2
    Created on : Feb 7, 2018, 12:35:50 PM
    Author     : OWNER
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
            out.println(s);
            %></h1>
    </body>
</html>
