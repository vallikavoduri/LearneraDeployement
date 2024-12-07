<!DOCTYPE html>
<html lang="en">
<head>
    <title>Welcome to LearnEra</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="icon" type="image/png" sizes="16x16" href="./images/favicon1.png" />
    <link rel="stylesheet" href="vendor/bootstrap-select/dist/css/bootstrap-select.min.css" />
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css" />
    <style>
    /* Global Styles */
body {
    background: linear-gradient(to bottom right, #f3f4f7, #e8ebf2);
    color: #333;
}

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


/* Widget Cards */
.widget-stat {
    background: #ffffff;
    color: #333;
}

.widget-stat.card.bg-primary {
    background: linear-gradient(to right, #6a11cb, #2575fc);
    color: #fff;
}

.widget-stat.card.bg-warning {
    background: linear-gradient(to right, #ffb347, #ffcc33);
    color: #fff;
}

.widget-stat.card.bg-secondary {
    background: linear-gradient(to right, #536976, #292e49);
    color: #fff;
}

.widget-stat.card.bg-success {
    background: linear-gradient(to right, #56ab2f, #a8e063);
    color: #fff;
}

.widget-stat.card.bg-info {
    background: linear-gradient(to right, #2193b0, #6dd5ed);
    color: #fff;
}

.widget-stat.card.bg-danger {
    background: linear-gradient(to right, #ff416c, #ff4b2b);
    color: #fff;
}

/* Buttons */
.btn-primary {
    background: linear-gradient(to right, #6a11cb, #2575fc);
    color: #fff;
}

.btn-primary:hover {
    background: linear-gradient(to right, #2575fc, #6a11cb);
}

/* Sidebar Links */
.dlabnav-scroll ul li a i {
    color: #cbd5e0;
}
    
    </style>
</head>
<body>

    <!-- Main wrapper start -->
    <div id="main-wrapper">
       <!-- Nav header start --> 
<div class="nav-header">
	<a href="/" class="brand-logo">
		  <center>  
		    <svg class="logo-abbr" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="84" height="67" viewBox="0 0 84 67" fill="none"><mask id="mask0_135_5" style="mask-type: alpha" maskUnits="userSpaceOnUse" x="4" y="0" width="76" height="66"><rect x="4" width="76" height="66" fill="url(#pattern0)" /></mask><g mask="url(#mask0_135_5)"><rect x="0" y="0" width="84" height="67" fill="url(#pattern0)" /></g><defs><pattern id="pattern0" patternUnits="objectBoundingBox" width="1" height="1"><image href="./images/image.png" width="84" height="67" preserveAspectRatio="xMidYMid slice" /></pattern></defs></svg>
		    <svg class="brand-title" xmlns="http://www.w3.org/2000/svg" width="122" height="19" viewBox="0 0 122 19" fill="none"><text x="0" y="15" fill="black" font-family="Gill Sans" font-size="22" font-weight="bold">LEARNERA</text></svg>
		  </center>
	  </a>
    <div class="nav-control">
        <div class="hamburger">
            <span class="line"></span><span class="line"></span><span class="line"></span>
        </div>
    </div>
  </div>
  <!-- Nav header end -->

        <!-- Sidebar start -->
        <div class="dlabnav">
            <div class="dlabnav-scroll">
                <ul class="metismenu" id="menu">
                    <li><a href="/" aria-expanded="false">
                        <i class="fa fa-dashboard"></i><span class="nav-text">Dashboard</span></a>
                    </li>

                    <li><a href="about" aria-expanded="false">
                        <i class="fa fa-info-circle"></i><span class="nav-text">About</span></a>
                    </li>

                    <li><a href="contactus" aria-expanded="false">
                        <i class="fa fa-envelope"></i><span class="nav-text">Contact Us</span></a>
                    </li>

                    <li>
                        <a class="has-arrow" href="javascript:void(0);" aria-expanded="false">
                            <i class="fa fa-sign-in"></i> <span class="nav-text">Login</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="adminlogin">Admin Login</a></li>
                            <li><a href="instructorlogin">Instructor Login</a></li>
                            <li><a href="studentlogin">Student Login</a></li>
                            <li><a href="cclogin">CC Login</a></li>
                        </ul>
                    </li>

                    <li>
                        <a class="has-arrow" href="javascript:void(0);" aria-expanded="false">
                            <i class="fa fa-user-plus"></i> <span class="nav-text">Register</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="instructorreg">Instructor Registration</a></li>
                            <li><a href="studentreg">Student Registration</a></li>
                            <li><a href="ccreg">CC Registration</a></li>                            
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <!-- Sidebar end -->

        <!-- Header start -->
<div class="header">
    <div class="header-content">
        <div class="row">
            <div class="col-md-12">
                <h1 class="welcome-title">Welcome to LearnEra</h1>
            </div>
        </div>
    </div>
</div>
<!-- Header end -->

<!-- Content body start -->
<div class="content-body">
    <div class="container-fluid">
        <!-- Section 1: About LearnEra -->
        <div class="row">
            <div class="col-md-12">
                <div class="widget-stat card bg-primary">
                    <div class="card-body">
                        <div class="media">
                            <span class="me-3">
                                <i class="la la-graduation-cap"></i>
                            </span>
                            <div class="media-body text-white">
                                <h2 class="text-white">Why Choose LearnEra?</h2>
                                <p class="text-white">
                                    LearnEra is a comprehensive platform designed to make learning more accessible, engaging, and effective. From interactive lessons to personalized learning paths, we provide tools to enhance every learning experience.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Section 2: Key Features -->
        <div class="row">
            <div class="col-xl-4 col-xxl-4 col-sm-6">
                <div class="widget-stat card bg-primary">
                    <div class="card-body">
                        <div class="media">
                            <span class="me-3">
                                <i class="la la-cogs"></i>
                            </span>
                            <div class="media-body text-white">
                                <h3 class="text-white">Personalized Learning</h3>
                                <p class="text-white">
                                    Our AI-powered system personalizes your learning journey based on your progress and preferences, ensuring tailored recommendations.
                                </p>
                               
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="col-xl-4 col-xxl-4 col-sm-6">
                <div class="widget-stat card bg-warning">
                    <div class="card-body">
                        <div class="media">
                            <span class="me-3">
                                <i class="la la-chalkboard"></i>
                            </span>
                            <div class="media-body text-white">
                                <h3 class="text-white">Interactive Courses</h3>
                                <p class="text-white">
                                    Learn through a variety of formats including video tutorials, quizzes, assignments, and group discussions to maximize engagement.
                                </p>
                               
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xl-4 col-xxl-4 col-sm-6">
                <div class="widget-stat card bg-secondary">
                    <div class="card-body">
                        <div class="media">
                            <span class="me-3">
                                <i class="la la-bar-chart"></i>
                            </span>
                            <div class="media-body text-white">
                                <h3 class="text-white">Real-time Analytics</h3>
                                <p class="text-white">
                                    Instructors and administrators can monitor progress with detailed real-time analytics for data-driven decisions.
                                </p>
                               
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Section 3: User Roles -->
        <div class="row">
            <div class="col-xl-4 col-xxl-4 col-sm-6">
                <div class="widget-stat card bg-success">
                    <div class="card-body">
                        <div class="media">
                            <span class="me-3">
                                <i class="la la-user"></i>
                            </span>
                            <div class="media-body text-white">
                                <h3 class="text-white">For Students</h3>
                                <p class="text-white">
                                    Access a wide range of courses, track progress, participate in discussions, and receive feedback from instructors.
                                </p>
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xl-4 col-xxl-4 col-sm-6">
                <div class="widget-stat card bg-info">
                    <div class="card-body">
                        <div class="media">
                            <span class="me-3">
                                <i class="la la-chalkboard-teacher"></i>
                            </span>
                            <div class="media-body text-white">
                                <h3 class="text-white">For Instructors</h3>
                                <p class="text-white">
                                    Create and manage courses, engage with students, assign homework, and evaluate performances with ease.
                                </p>
                               
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xl-4 col-xxl-4 col-sm-6">
                <div class="widget-stat card bg-danger">
                    <div class="card-body">
                        <div class="media">
                            <span class="me-3">
                                <i class="la la-building"></i>
                            </span>
                            <div class="media-body text-white">
                                <h3 class="text-white">For Institutions</h3>
                                <p class="text-white">
                                    Manage curricula, track student and faculty performance, and optimize learning outcomes with institutional oversight.
                                </p>
                               
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Section 4: Call to Action -->
        <div class="row">
            <div class="col-md-12 text-center">
                <div class="widget-stat card bg-primary">
                    <div class="card-body">
                        <h2 class="text-white">Ready to Begin?</h2>
                        <p class="text-white">Join the LearnEra community and start your journey towards mastering new skills today!</p>
                        <a href="#" class="btn btn-primary btn-lg mt-3">Get Started</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Content body end -->


    </div>
    <!-- Main wrapper end -->

    <!-- Scripts -->
    <script src="vendor/global/global.min.js"></script>
    <script src="vendor/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
    <script src="js/custom.min.js"></script>
    <script src="js/dlabnav-init.js"></script>
</body>
</html>
