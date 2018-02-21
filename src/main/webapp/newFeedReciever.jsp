<%-- 
    Document   : newFeedReciever
    Created on : Feb 20, 2018, 3:35:41 PM
    Author     : OWNER
--%>

<%@page import="java.util.List"%>
<%@page import="model.DonatorPost"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>WheelShared</title>

        <!-- Bootstrap Core CSS -->
        <link href="./css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="./css/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="./css/receiver.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="./css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>
            .navbar-brand{
                text-align: 
            }
            .sidebar-profile img{
                margin-left: 60px;
                margin-top: 30px;
            }
            .navbar-default .sidebar{
                height: 0%;
            }
            .navbar-default .sidebar a{
                color: white;
            }
            .navbar-default .sidebar a img{
                height: 20px;
                width: 20px;
            }
            .navbar-default .sidebar h4{
                font-size: 24px;
                color: white;
                margin-bottom: 5px;
            }
            .navbar-default .sidebar h5{
                font-size: 16px;
                color: white;
                margin-bottom: 30px;
            }
            #test{
                text-transform: uppercase;
                font-size: 16px;
                margin-left: 14px;
            }
            .navbar-header.dropdown a{
                margin-left: 20px;
                font-size: 20px;
                list-style-type: none;
            }
            #page-wrapper .create-post button{
                margin-left: 45%;
                margin-top: 40px;
            }
            #page-wrapper .col-lg-8{
                margin-top: 40px;
                margin-left: 18%;
            }
            #page-wrapper .col-lg-8 .panel{
                background-color: #F0FFFF;
                padding: 60px;
            }
            .radio label{
                margin-right: 30px;
            }
            #create{
                font-size: 13px;
            }
            li{
                list-style-type: none;
            }

        </style>
    </head>

    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <ul>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" style="text-decoration: none;">
                                <span style="font-size: 25px; margin-left: 20px; color: #12616d; ">Receiver</span>
                                <img src="./pic/down.png" width="24px" height="24px" style="margin-bottom: 5px;">
                            </a>
                            <ul class="dropdown-menu dropdown-messages">
                                <li>
                                    <a href="newsfeedReceiver.html">
                                        <div>
                                            <strong>Receiver</strong>
                                        </div>
                                    </a>
                                    <a href="newsfeedDonator.html">
                                        <div>
                                            <strong>Donator</strong>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                    </ul>
                </div>
                <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="newsfeedReceiver.html">
                            <img src="./pic/text-lines.png" height="20px" width="20px">
                        </a>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <img src="./pic/chat.png" height="20px" width="20px">
                            <ul class="dropdown-menu dropdown-messages">
                                <%
                                    //วนลูปตามหมายเลขของ postId
                                    DonatorPost dntp = new DonatorPost();
                                    List<Integer> listDntp = (List<Integer>) request.getAttribute("dntpTop5Id");
                                    int i = 0;
                                    while (i < 5) {
                                        dntp = dntp.getDonatorPostById(listDntp.get(i));
                                %>
                                <li>
                                    <a href="">
                                        <div>
                                            <%--ชื่อ--%>
                                            <strong><%out.print(dntp.getName());%></strong>
                                            <span class="pull-right text-muted">
                                                <%--เวลา--%>
                                                <em><%out.print(dntp.getDatetime());%></em>
                                            </span>
                                        </div>
                                        <div><%out.print(dntp.getStatement());%></div>
                                    </a>
                                </li>

                                <%
                                        i++;
                                    }

                                %>



                                <li>
                                    <a href="#">
                                        <div>
                                            <strong>John Smith</strong>
                                            <span class="pull-right text-muted">
                                                <em>Yesterday</em>
                                            </span>
                                        </div>
                                        <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="#">
                                        <div>
                                            <strong>John Smith</strong>
                                            <span class="pull-right text-muted">
                                                <em>Yesterday</em>
                                            </span>
                                        </div>
                                        <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="#">
                                        <div>
                                            <strong>John Smith</strong>
                                            <span class="pull-right text-muted">
                                                <em>Yesterday</em>
                                            </span>
                                        </div>
                                        <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a class="text-center" href="#">
                                        <strong>Read All Messages</strong>
                                        <i class="fa fa-angle-right"></i>
                                    </a>
                                </li>
                            </ul>
                            <!-- /.dropdown-messages -->
                    </li>
                    <!-- /.dropdown -->


                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <img src="./pic/notification.png" height="20px" width="20px">
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-comment fa-fw"></i> New Comment
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                        <span class="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> Message Sent
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-tasks fa-fw"></i> New Task
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                        <!-- /.dropdown-alerts -->
                    </li>
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <img src="./pic/user2.png" height="20px" width="20px">
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                                </li>
                                <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                                </li>
                                <li class="divider"></li>
                                <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                                </li>
                            </ul>
                            <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <li class="sidebar-profile">
                                <img src="./pic/girl.png" class="text-center" height="128px" width="128px">
                                <%--Name and Lname--%>
                                <h4 align="center">${sessionScope.User.getName()}&nbsp;&nbsp;${sessionScope.User.getLname()}</h4>
                                <h5 align="center">(Receiver)</h5>
                            </li>
                            <li>
                                <a href="matchingReceiver.html"><img src="./pic/search.png"></i> <span id="test">Matching</span></a>
                            </li>
                            <li>
                                <a href="history.html"><img src="./pic/history.png"></i><span id="test"> History</span> </a>
                            </li>
                            <li>
                                <a href="tracking.html"><img src="./pic/box.png"></i> <span id="test">Tracking</span></a>
                            </li>


                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
                <!-- /.navbar-static-side -->
            </nav>
            <div id="page-wrapper">
                <div class="row">
                    <div class="create-post">
                        <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" ><span id="create">+ CREATE POST</span></button>
                    </div>
                    <div center>
                        <ol><%  int numberPage = (int) session.getAttribute("numberRecieverPostPage");
                                for (int k = 1; k <= numberPage; k++) {
                                    
                            %>
                            <li><button type="button" action="GoToReceiverNewFeeds" name="thispage" value="<%out.print(k);%>" class="btn btn-toolbar"><%out.print(k);%></button></li>&nbsp;
                            <%  }
                            
                            %></ol>
                    </div>
                    <div class="modal fade" id="myModal" role="dialog">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    <h4 class="modal-title">${sessionScope.User.getName()}&nbsp;&nbsp;${sessionScope.User.getLname()}</h4>
                                </div>
                                <div class="modal-body">
                                    <form role="form">
                                        <div class="form-group">
                                            <label>Equipment</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" value="Wheelchair" name="Equipment">Wheelchair
                                                </label>
                                                <label>
                                                    <input type="radio" value="Oxygentank" name="Equipment">Oxygen tank
                                                </label>
                                                <label>
                                                    <input type="radio" value="Crutches" name="Equipment">Crutches
                                                </label>
                                                <label>
                                                    <input type="radio" value="Bed" name="Equipment">Bed
                                                </label>
                                                <label>
                                                    <input type="radio" value="Others" name="Equipment">Others...
                                                </label>
                                            </div>

                                            <label>Choose Pictures</label>
                                            <input type="file">

                                            <label>Statement</label>
                                            <textarea class="form-control" rows="3"></textarea>

                                            <label>District</label>
                                            <select class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>

                                            <label>Sub-district</label>
                                            <select class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>

                                            <label>Province</label>
                                            <select class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>

                                            <label>Address</label>
                                            <text class="form-control" rows="3"></text>

                                        </div>
                                    </form>
                                </div>

                                <div class="modal-footer">
                                    <button type="submit" class="btn btn-success" data-dismiss="modal">Post</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-8">
                        <div class="panel">
                            <strong>John Smith</strong><br>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...
                        </div>
                        <div class="panel">
                            create your post
                        </div>
                        <div class="panel">
                            create your post
                        </div>
                        <div class="panel">
                            create your post
                        </div>
                        <div class="panel">
                            create your post
                        </div>
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-8 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->


    <!-- jQuery -->
    <script src="./js/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="./js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="./js/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="./js/sb-admin-2.js"></script>

</body>

</html>

