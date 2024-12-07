<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Sidebar start -->
<div class="dlabnav">
  <div class="dlabnav-scroll">
    <ul class="metismenu" id="menu">
      <li class="nav-label first">Main Menu</li>
      <li>
        <a href="instructorhome" aria-expanded="false">
          <i class="la la-home"></i>
          <span class="nav-text">Dashboard</span>
        </a>
      </li>
      <li>
        <a class="has-arrow" href="javascript:void(0);" aria-expanded="false">
          <i class="la la-users"></i>
          <span class="nav-text">Students</span>
        </a>
        <ul aria-expanded="false">
          <li><a href="viewallstu">All Students</a></li>
        </ul>
      </li>
      <li>
        <a class="has-arrow" href="javascript:void(0);" aria-expanded="false">
          <i class="la la-graduation-cap"></i>
          <span class="viewallcour">Courses</span>
        </a>
        <ul aria-expanded="false">
          <li><a href="viewallcour">All Courses</a></li>
        </ul>
      </li>
      <li>
        <a class="has-arrow" href="javascript:void(0);" aria-expanded="false">
          <i class="la la-users"></i>
          <span class="nav-text">Profile</span>
        </a>
        <ul aria-expanded="false">
          <li><a href="./app-profile.html">Profile</a></li>
          <li>
            <a href="./edit-profile.html">Edit Profile</a>
          </li>
        </ul>
      </li>
      <li>
        <a href="instructorlogout" aria-expanded="false">
          <i class="la la-th-list"></i>
          <span class="nav-text">Logout</span>
        </a>
      </li>
    </ul>
    <div class="copyright">
      <p>LearnEra © 2024 All Rights Reserved</p>
    </div>
  </div>
</div>
  <!-- Sidebar end -->
</body>
</html>