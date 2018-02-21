<%-- 
    Document   : EditProfile_Reciever
    Created on : Feb 20, 2018, 3:53:56 PM
    Author     : OWNER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

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
    .navbar-default .sidebar a{
        color: white;
    }
    .navbar-default .sidebar{
        height: 0%;
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
    #page-wrapper img{
        float: left;
        margin-right : 25px;
    }
    #page-wrapper button{
        margin-top: 30px;
        margin-right: 20px;
    }
    #page-wrapper .row .col-lg-12 .panel{
        background-color: #F0FFFF;
    }
     #page-wrapper .row .col-lg-12 .panel .panel-heading{
        background-color: #d5eded;
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
                </button>
                <li class="dropdown">
                   <a class="dropdown-toggle" data-toggle="dropdown" style="text-decoration: none;">
                        <span style="font-size: 25px; margin-left: 20px; color: #12616d;">Receiver</span>
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
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a href="newsfeedReceiver.html">
                        <img src="./pic/text-lines.png" height="20px" width="20px">
                    </a>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <img src="./pic/chat.png" height="20px" width="20px">
                    <ul class="dropdown-menu dropdown-messages">
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
                        <li><a href="editProfile_Receiver.html"><img src="./pic/user2.png" height="16px" width="16px"> User Profile</a>
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
                            <img src="./pic/girl.png" class="text-center">
                            <h4 align="center">Kadnit Everdeen</h4>
                            <h5 align="center">(Receiver)</h5>
                        </li>
                        <li>
                            <a href="MatchingReceiver.html"><img src="./pic/search.png"></i> <span id="test">Matching</span></a>
                        </li>
                        <li>
                            <a href="history.html"><img src="./pic/history.png"></i><span id="test">History</span> </a>
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
                <div class="col-lg-12">
                    <h1>Profile</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Edit Your Profile
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                         <div class="form-group">
                                            <img src="./pic/user.png" ><br><br>
                                            <label>Choose your picture</label>
                                            <input type="file">
                                        </div>
                                        <br><br>
                                        <div class="form-group">
                                            <label>First Name</label>
                                            <input class="form-control" placeholder="Kadnit">
                                        </div>
                                        <div class="form-group">
                                            <label>Last Namer</label>
                                            <input class="form-control" placeholder="Everdeen">
                                        </div>
                                        <div class="form-group">
                                            <label>Email</label>
                                            <input class="form-control" placeholder="email@example.com">
                                        </div>
                                        <div class="form-group">
                                            <label>Tel</label>
                                            <input class="form-control" placeholder="">
                                        </div>
                                       
                                </div>
                                <br><br><br>
                                <!-- /.col-lg-6 (nested) -->
                                <div class="col-lg-6">
                                    <form role="form">
                                        <div class="form-group">
                                                <label>Address</label>
                                                <input class="form-control" placeholder="126 ถนนประชาอุทิศ">
                                            </div>
                                           <div class="form-group">
                                            <label>District</label>
                                            <select class="form-control">
                                                <option>ทุ่งครุ</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                         <div class="form-group">
                                            <label>Sub-district</label>
                                            <select class="form-control">
                                                <option>บางมด</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label>Province</label>
                                            <select class="form-control">
                                                <option>กรุงเทพฯ</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                                <label>Zipcode</label>
                                                <input class="form-control" placeholder="10140">
                                            </div>
                                    </form>

                                </div>
                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                            <center>
                            <button type="submit" class="btn btn-success">SAVE</button>
                            <button type="reset" class="btn btn-danger">CANCLE</button>
                        </center>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
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

