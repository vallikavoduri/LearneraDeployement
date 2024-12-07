<%@page import="com.klef.jfsd.sdp.model.Instructor"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Instructor instructor = (Instructor) session.getAttribute("instructor");
if(instructor==null)
{
	response.sendRedirect("sessionexpiry");
	return;
}
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Title -->
    <title>LEARNERA</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="robots" content="index, follow" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="icon" type="image/png" sizes="16x16" href="./images/favicon1.png"/>
    <!-- STYLESHEETS -->
    <link rel="stylesheet" href="vendor/jqvmap/css/jqvmap.min.css" />
    <link rel="stylesheet" href="vendor/chartist/css/chartist.min.css" />
    <link rel="stylesheet" href="vendor/bootstrap-select/dist/css/bootstrap-select.min.css"/>
    <link class="main-css" rel="stylesheet" href="css/style.css" />
     <style>
    /* Navigation Header */
.nav-header {
    background: linear-gradient(to right, #6a11cb, #2575fc);
    color: #fff;
}


/* Sidebar */
.dlabnav {
    background: #2b2f3a;
    color: #fff;
}

.dlabnav-scroll ul li {
    color: #a0aec0;
}

.dlabnav-scroll ul li a {
    color: #cbd5e0;
}

.dlabnav-scroll ul li a:hover {
    background: #3c4453;
    color: #fff;
}
    
    </style>
</head>

  <body>
    <!-- Preloader start -->
    <div id="preloader">
      <div class="sk-three-bounce">
        <div class="sk-child sk-bounce1"></div>
        <div class="sk-child sk-bounce2"></div>
        <div class="sk-child sk-bounce3"></div>
      </div>
    </div>

    <!-- Main wrapper start -->
    <div id="main-wrapper">
      <!-- Nav header start --> 
      <div class="nav-header">
        <a href="instructor-dashboard.html" class="brand-logo">
          <svg class="logo-abbr" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="84" height="67" viewBox="0 0 84 67" fill="none"><mask id="mask0_135_5" style="mask-type: alpha" maskUnits="userSpaceOnUse" x="4" y="0" width="76" height="66"><rect x="4" width="76" height="66" fill="url(#pattern0)" /></mask><g mask="url(#mask0_135_5)"><rect x="0" y="0" width="84" height="67" fill="url(#pattern0)" /></g><defs><pattern id="pattern0" patternUnits="objectBoundingBox" width="1" height="1"><image href="./images/image.png" width="84" height="67" preserveAspectRatio="xMidYMid slice" /></pattern></defs></svg>
          <svg class="brand-title" xmlns="http://www.w3.org/2000/svg" width="122" height="19" viewBox="0 0 122 19" fill="none"><text x="0" y="15" fill="white" font-family="Gill Sans" font-size="20" font-weight="bold">LEARNERA</text></svg>
        </a>
        <div class="nav-control">
            <div class="hamburger">
                <span class="line"></span><span class="line"></span><span class="line"></span>
            </div>
        </div>
      </div>

<!-- Header start -->
<div class="header">
  <div class="header-content">
    <nav class="navbar navbar-expand">
      <div class="collapse navbar-collapse justify-content-between">
        <div class="header-left">
          <div class="search_bar dropdown">
            <span class="search_icon p-3 c-pointer" data-bs-toggle="dropdown">
              <i class="mdi mdi-magnify"></i>
            </span>
            <div class="dropdown-menu p-0 m-0">
              <form>
                <input class="form-control" type="search" placeholder="Search" aria-label="Search" />
              </form>
            </div>
          </div>
        </div>
        <ul class="navbar-nav header-right">
          <li class="nav-item dropdown notification_dropdown">
            <a class="nav-link bell dlab-theme-mode p-0" href="javascript:void(0);">
              <i id="icon-light" class="fas fa-sun"></i>
              <i id="icon-dark" class="fas fa-moon"></i>
            </a>
          </li>
          <li class="nav-item dropdown notification_dropdown">
            <a class="nav-link ai-icon" href="javascript:void(0);" data-bs-toggle="dropdown">
              <svg xmlns="http://www.w3.org/2000/svg" width="23.262" height="24" viewBox="0 0 23.262 24">
                <g id="icon" transform="translate(-1565 90)">
                  <path id="setting_1_" data-name="setting (1)" d="M30.45,13.908l-1-.822a1.406,1.406,0,0,1,0-2.171l1-.822a1.869,1.869,0,0,0,.432-2.385L28.911,4.293a1.869,1.869,0,0,0-2.282-.818l-1.211.454a1.406,1.406,0,0,1-1.88-1.086l-.213-1.276A1.869,1.869,0,0,0,21.475,0H17.533a1.869,1.869,0,0,0-1.849,1.567L15.47,2.842a1.406,1.406,0,0,1-1.88,1.086l-1.211-.454a1.869,1.869,0,0,0-2.282.818L8.126,7.707a1.869,1.869,0,0,0,.432,2.385l1,.822a1.406,1.406,0,0,1,0,2.171l-1,.822a1.869,1.869,0,0,0-.432,2.385L10.1,19.707a1.869,1.869,0,0,0,2.282.818l1.211-.454a1.406,1.406,0,0,1,1.88,1.086l.213,1.276A1.869,1.869,0,0,0,17.533,24h3.943a1.869,1.869,0,0,0,1.849-1.567l.213-1.276a1.406,1.406,0,0,1,1.88-1.086l1.211.454a1.869,1.869,0,0,0,2.282-.818l1.972-3.415a1.869,1.869,0,0,0-.432-2.385ZM27.287,18.77l-1.211-.454a3.281,3.281,0,0,0-4.388,2.533l-.213,1.276H17.533l-.213-1.276a3.281,3.281,0,0,0-4.388-2.533l-1.211.454L9.75,15.355l1-.822a3.281,3.281,0,0,0,0-5.067l-1-.822L11.721,5.23l1.211.454A3.281,3.281,0,0,0,17.32,3.151l.213-1.276h3.943l.213,1.276a3.281,3.281,0,0,0,4.388,2.533l1.211-.454,1.972,3.414h0l-1,.822a3.281,3.281,0,0,0,0,5.067l1,.822ZM19.5,7.375A4.625,4.625,0,1,0,24.129,12,4.63,4.63,0,0,0,19.5,7.375Zm0,7.375A2.75,2.75,0,1,1,22.254,12,2.753,2.753,0,0,1,19.5,14.75Z" transform="translate(1557.127 -90)"></path>
                </g>
              </svg>
            </a>
            <div class="dropdown-menu dropdown-menu-end">
              <div id="DZ_W_TimeLine02" class="widget-timeline dlab-scroll style-1 p-3 height370"></div>
            </div>
          </li>
          <li class="nav-item dropdown header-profile">
            <a class="nav-link" href="javascript:void(0);" role="button" data-bs-toggle="dropdown">
              <img src="images/profile/education/pic1.jpg" width="20" alt="" />
            </a>
            <div class="dropdown-menu dropdown-menu-right">
              <a href="./app-profile.html" class="dropdown-item ai-icon">
                <svg id="icon-user1" xmlns="http://www.w3.org/2000/svg" width="18" height="18" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-user"></svg>
                <path d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"></path>
                <circle cx="12" cy="7" r="4"></circle>
              </a>
              <a href="./page-login.html" class="dropdown-item ai-icon">
                <svg id="icon-logout" xmlns="http://www.w3.org/2000/svg" width="18" height="18" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-log-out">
                  <path d="M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"></path>
                  <polyline points="16 17 21 12 16 7"></polyline>
                  <line x1="21" y1="12" x2="9" y2="12"></line>
                </svg>
              </a>
            </div>
          </li>
        </ul>
      </div>
    </nav>
  </div>
</div>
<!-- Header end -->

<%@include file="instructor-sidebar.jsp" %>

      <div class="content-body">
        <!-- row -->
        <div class="container-fluid">
          <div class="row">
             <h4 class="card-title">Welcome <%=instructor.getName()%></h4>      
           </div>
          </div>
         </div> 
    <!-- Scripts -->
    <script src="vendor/global/global.min.js"></script>
    <script src="vendor/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
    <script src="vendor/svganimation/vivus.min.js"></script>
    <script src="vendor/svganimation/svg.animation.js"></script>
    <script src="js/dashboard/dashboard-2.js"></script>
    <script src="js/custom.min.js"></script>
    <script src="js/dlabnav-init.js"></script>
  </body>
</html>
