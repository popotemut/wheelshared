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
        <h1>${greeting}</h1>
        CLASSFORNAME=${db.CLASSFORNAME}
CONNECTION=${db.CONNECTION}
URL=${db.URL}
PORT=${db.PORT}
DB=${db.DB}
USERNAME=${db.USERNAME}
PASSWORD=${db.PASSWORD}
    </body>
</html>
