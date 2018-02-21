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
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>WheelShared</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900,900i" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Merriweather:300,300i,400,400i,700,700i,900,900i" rel="stylesheet">
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/coming-soon.min.css" rel="stylesheet">

        <style>
            .masthead-content a {
                color: #cdd6cd;
                margin-left: 50px;
            }
            .masthead-content button{
                margin-right: 20px;
                margin-left: 30px;
            }
            label{
                font-weight: bold;
                margin-top: 5px;
            }
        </style>

    </head>

    <body>
        <%
            //เดี๋ยวต้องส่งไปที่ index ด้วยว่า สถานะการlog in ผ่านหรือไม่ผ่าน
            if ((!request.getAttribute("loginstatus").equals(null)) & ((boolean) request.getAttribute("loginstatus") == false)) {
        %>
        <div class="text-white" style="background-color: darkgreen;">"Your email or password is invalid."</div>
        
        <%
            }
        %>
        <div class="overlay"></div>

        <div class="masthead">
            <div class="masthead-bg"></div>
            <div class="container h-100">
                <div class="row h-100">
                    <div class="col-12 my-auto">
                        <div class="masthead-content text-white py-5 py-md-0">
                            <form id="doing" action="LogInServlet">
                                <center><img src="../pic/wheelshared.png" width="400px"/></center>
                                <center><p class="mb-5">It is not how much we give<br>But, how much love we put into giving.</p></center>
                                <center>
                                    <div class="input col-lg-10">

                                        <input type="email" class="form-control" placeholder="Email" aria-label="email" name="email" aria-describedby="basic-addon"><br>
                                        <input type="password" class="form-control" placeholder="Password" aria-label="password" name="password" aria-describedby="basic-addon">
                                        <input type="hidden" id="wanttodo" name="wanttodo" value=""/>
                                    </div>
                                </center>
                                <a href="#">Forget password?</a>
                                <br><br>

                                <div class="log">
                                    <div class="login">
                                        <center><button class="btn btn-primary" data-toggle="modal" data-target="#myModal" ><span id="create">LOGIN</span></button></center>
                                    </div>
                                    <div class="modal fade" id="myModal" role="dialog">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                </div>
                                                <div class="modal-body">
                                                    <h4>What are you doing today?</h4>
                                                    <script>
                                                        function changeActionTo(i) {
                                                            if ('reciever' === i) {
                                                                wanttodo.value = "GoToReceiverNewFeeds";
                                                            } else if ('donator' === i) {
                                                                wanttodo.value = "GoToDonatorNewFeeds";
                                                            }
                                                        }
                                                    </script>

                                                    <ul>
                                                        <li><button name="doing" onfocus="changeActionTo('receiver')" onmouseover="changeActionTo('receiver')" type="submit"> <img src="./img/receive.png" height="128px" width="128px"/></button></li>
                                                        <li><button name="doing" onfocus="changeActionTo('donator')" onmouseover="changeActionTo('donator')" type="submit"> <img src="./img/donate.png" height="128px" width="128px"/></button></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div> 
                                </div>
                                <center><button type="button" class="btn btn-link">Do you have any account?</button></center>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="vendor/vide/jquery.vide.min.js"></script>

        <!-- Custom scripts for this template -->
        <script src="js/coming-soon.min.js"></script>

        
        CLASSFORNAME=${db.CLASSFORNAME}
        CONNECTION=${db.CONNECTION}
        URL=${db.URL}
        PORT=${db.PORT}
        DB=${db.DB}
        USERNAME=${db.USERNAME}
        PASSWORD=${db.PASSWORD}
    </body>

</html>
