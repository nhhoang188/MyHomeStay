<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/1/2021
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html dir="ltr" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Admin</title>
    <link rel="stylesheet" type="text/css" href="Admin/assets/libs/select2/dist/css/select2.min.css">
    <link rel="stylesheet" type="text/css" href="Admin/assets/libs/jquery-minicolors/jquery.minicolors.css">
    <link rel="stylesheet" type="text/css"
          href="Admin/assets/libs/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
    <link rel="stylesheet" type="text/css" href="Admin/assets/libs/quill/dist/quill.snow.css">
    <link href="Admin/dist/css/style.min.css" rel="stylesheet">
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="preloader" style="display: none;">
    <div class="lds-ripple">
        <div class="lds-pos"></div>
        <div class="lds-pos"></div>
    </div>
</div>

<div id="main-wrapper" data-sidebartype="mini-sidebar" class="">

    <header class="topbar" data-navbarbg="skin5">
        <nav class="navbar top-navbar navbar-expand-md navbar-dark">
            <div class="navbar-header" data-logobg="skin5">
                <!-- This is for the sidebar toggle which is visible on mobile only -->
                <a class="nav-toggler waves-effect waves-light d-block d-md-none" href="javascript:void(0)"><i
                        class="ti-menu ti-close"></i></a>
                <!-- ============================================================== -->
                <!-- Logo -->
                <!-- ============================================================== -->
                <a class="navbar-brand" href="admin.jsp">
                    <!-- Logo icon -->
                    <b class="logo-icon p-l-10">
                        <!--You can put here icon as well // <i class="wi wi-sunset"></i> //-->
                        <!-- Dark Logo icon -->
                        <img src="Admin/assets/images/logo-icon.png" alt="homepage" class="light-logo">

                    </b>
                    <!--End Logo icon -->
                    <!-- Logo text -->
                    <span class="logo-text">
                             <!-- dark Logo text -->
                             <img src="Admin/assets/images/logo-text.png" alt="homepage" class="light-logo">

                        </span>
                    <!-- Logo icon -->
                    <!-- <b class="logo-icon"> -->
                    <!--You can put here icon as well // <i class="wi wi-sunset"></i> //-->
                    <!-- Dark Logo icon -->
                    <!-- <img src="assets/images/logo-text.png" alt="homepage" class="light-logo" /> -->

                    <!-- </b> -->
                    <!--End Logo icon -->
                </a>
                <!-- ============================================================== -->
                <!-- End Logo -->
                <!-- ============================================================== -->
                <!-- ============================================================== -->
                <!-- Toggle which is visible on mobile only -->
                <!-- ============================================================== -->
                <a class="topbartoggler d-block d-md-none waves-effect waves-light" href="javascript:void(0)"
                   data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                   aria-expanded="false" aria-label="Toggle navigation"><i class="ti-more"></i></a>
            </div>
            <!-- ============================================================== -->
            <!-- End Logo -->
            <!-- ============================================================== -->
            <div class="navbar-collapse collapse" id="navbarSupportedContent" data-navbarbg="skin5">
                <!-- ============================================================== -->
                <!-- toggle and nav items -->
                <!-- ============================================================== -->
                <ul class="navbar-nav float-left mr-auto">
                    <li class="nav-item d-none d-md-block"><a class="nav-link sidebartoggler waves-effect waves-light"
                                                              href="javascript:void(0)" data-sidebartype="mini-sidebar"><i
                            class="mdi mdi-menu font-24"></i></a></li>
                    <!-- ============================================================== -->
                    <!-- create new -->
                    <!-- ============================================================== -->

                    <!-- ============================================================== -->
                    <!-- Search -->
                    <!-- ============================================================== -->

                </ul>
                <!-- ============================================================== -->
                <!-- Right side toggle and nav items -->
                <!-- ============================================================== -->
                <ul class="navbar-nav float-right">
                    <!-- ============================================================== -->
                    <!-- Comment -->
                    <!-- ============================================================== -->

                    <!-- ============================================================== -->
                    <!-- End Comment -->
                    <!-- ============================================================== -->
                    <!-- ============================================================== -->
                    <!-- Messages -->
                    <!-- ============================================================== -->

                    <!-- ============================================================== -->
                    <!-- End Messages -->
                    <!-- ============================================================== -->

                    <!-- ============================================================== -->
                    <!-- User profile and search -->
                    <!-- ============================================================== -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-muted waves-effect waves-dark pro-pic" href=""
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img
                                src="Admin/assets/images/users/1.jpg" alt="user" class="rounded-circle" width="31"></a>
                        <div class="dropdown-menu dropdown-menu-right user-dd animated">
                            <a class="dropdown-item" href="javascript:void(0)"><i class="ti-user m-r-5 m-l-5"></i> My
                                Profile</a>


                        </div>
                    </li>
                    <!-- ============================================================== -->
                    <!-- User profile and search -->
                    <!-- ============================================================== -->
                </ul>
            </div>
        </nav>
    </header>

    <aside class="left-sidebar" data-sidebarbg="skin5">
        <!-- Sidebar scroll-->
        <div class="scroll-sidebar">
            <!-- Sidebar navigation-->
            <nav class="sidebar-nav">
                <ul id="sidebarnav" class="p-t-30 in">


                    <li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link"
                                                href="/admin?action=homestay" aria-expanded="false"><i
                            class="mdi mdi-border-inside"></i><span class="hide-menu">HomeStay</span></a></li>

                    <li class="sidebar-item"><a class="sidebar-link has-arrow waves-effect waves-dark"
                                                href="/admin/action=booking" aria-expanded="false"><i
                            class="mdi mdi-receipt"></i><span class="hide-menu">Booking</span></a>
                        <ul aria-expanded="false" class="collapse first-level">
                            <li class="sidebar-item"><a href="Admin/form-basic.html" class="sidebar-link"><i
                                    class="mdi mdi-note-outline"></i><span class="hide-menu"> Form Basic </span></a>
                            </li>
                            <li class="sidebar-item"><a href="form-wizard.html" class="sidebar-link"><i
                                    class="mdi mdi-note-plus"></i><span class="hide-menu"> Form Wizard </span></a></li>
                        </ul>
                    </li>

                    <li class="sidebar-item"><a class="sidebar-link has-arrow waves-effect waves-dark"
                                                href="javascript:void(0)" aria-expanded="false"><i
                            class="mdi mdi-face"></i><span class="hide-menu">Icons </span></a>
                        <ul aria-expanded="false" class="collapse first-level">
                            <li class="sidebar-item"><a href="/admin/action=user" class="sidebar-link"><i
                                    class="mdi mdi-emoticon"></i><span class="hide-menu"> User </span></a>
                            </li>
                            <li class="sidebar-item"><a href="icon-fontawesome.html" class="sidebar-link"><i
                                    class="mdi mdi-emoticon-cool"></i><span
                                    class="hide-menu"> Font Awesome Icons </span></a></li>
                        </ul>
                    </li>
                    <li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link"
                                                href="pages-elements.html" aria-expanded="false"><i
                            class="mdi mdi-pencil"></i><span class="hide-menu">Elements</span></a></li>


                </ul>
            </nav>
            <!-- End Sidebar navigation -->
        </div>
        <!-- End Sidebar scroll-->
    </aside>

    <div class="page-wrapper">

        <footer class="footer text-center">
            ADMIN
        </footer>

    </div>

</div>

<script src="Admin/assets/libs/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap tether Core JavaScript -->
<script src="Admin/assets/libs/popper.js/dist/umd/popper.min.js"></script>
<script src="Admin/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="Admin/assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js"></script>
<script src="Admin/assets/extra-libs/sparkline/sparkline.js"></script>
<!--Wave Effects -->
<script src="Admin/dist/js/waves.js"></script>
<!--Menu sidebar -->
<script src="Admin/dist/js/sidebarmenu.js"></script>
<!--Custom JavaScript -->
<script src="Admin/dist/js/custom.min.js"></script>
<!--This page JavaScript -->
<!-- <script src="dist/js/pages/dashboards/dashboard1.js"></script> -->
<!-- Charts js Files -->
<script src="Admin/assets/libs/flot/excanvas.js"></script>
<script src="Admin/assets/libs/flot/jquery.flot.js"></script>
<script src="Admin/assets/libs/flot/jquery.flot.pie.js"></script>
<script src="Admin/assets/libs/flot/jquery.flot.time.js"></script>
<script src="Admin/assets/libs/flot/jquery.flot.stack.js"></script>
<script src="Admin/assets/libs/flot/jquery.flot.crosshair.js"></script>
<script src="Admin/assets/libs/flot.tooltip/js/jquery.flot.tooltip.min.js"></script>
<script src="Admin/dist/js/pages/chart/chart-page-init.js"></script>


<div class="flotTip" style="display: none; position: absolute;"></div>

</body>
</html>