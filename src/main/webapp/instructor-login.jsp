<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Title -->
    <title>EduMin - Education Admin Dashboard Template | dexignlabs</title>

    <!-- Meta -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="author" content="dexignlabs" />
    <meta name="robots" content="index, follow" />
    <meta name="keywords" content="admin, dashboard, admin dashboard, admin template, template, admin panel, administration, analytics, bootstrap, modern, responsive, creative, retina ready, modern Dashboard responsive dashboard, responsive template, user experience, user interface, Bootstrap Dashboard, Analytics Dashboard, Customizable Admin Panel, EduMin template, ui kit, web app, EduMin, School Management,Dashboard Template, academy, course, courses, e-learning, education, learning, learning management system, lms, school, student, teacher" />
    <meta name="description" content="EduMin - Empower your educational institution with the all-in-one Education Admin Dashboard Template. Streamline administrative tasks, manage courses, track student performance, and gain valuable insights with ease. Elevate your education management experience with a modern, responsive, and feature-packed solution. Explore EduMin now for a smarter, more efficient approach to education administration." />

    <!-- Open Graph Meta -->
    <meta property="og:title" content="EduMin - Education Admin Dashboard Template | dexignlabs" />
    <meta property="og:description" content="EduMin - Empower your educational institution with the all-in-one Education Admin Dashboard Template. Streamline administrative tasks, manage courses, track student performance, and gain valuable insights with ease. Elevate your education management experience with a modern, responsive, and feature-packed solution. Explore EduMin now for a smarter, more efficient approach to education administration." />
    <meta property="og:image" content="https://edumin.dexignlab.com/xhtml/social-image.png" />

    <!-- Twitter Meta -->
    <meta name="twitter:title" content="EduMin - Education Admin Dashboard Template | dexignlabs" />
    <meta name="twitter:description" content="EduMin - Empower your educational institution with the all-in-one Education Admin Dashboard Template. Streamline administrative tasks, manage courses, track student performance, and gain valuable insights with ease. Elevate your education management experience with a modern, responsive, and feature-packed solution. Explore EduMin now for a smarter, more efficient approach to education administration." />
    <meta name="twitter:image" content="https://edumin.dexignlab.com/xhtml/social-image.png" />
    <meta name="twitter:card" content="summary_large_image" />
    
    <meta name="format-detection" content="telephone=no" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    
    <!-- Favicon -->
    <link rel="icon" type="image/png" sizes="16x16" href="./images/favicon.png" />

    <!-- STYLESHEETS -->
    <link href="vendor/bootstrap-select/dist/css/bootstrap-select.min.css" rel="stylesheet" />
    <link class="main-css" rel="stylesheet" href="css/style.css" />
  </head>
  
  <body>
    <div class="fix-wrapper">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-5 col-md-6">
            <div class="card mb-0 h-auto">
              <div class="card-body">
				  <a href="admin-dashboard" class="brand-logo">
				  <center>  <svg class="logo-abbr" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="84" height="67" viewBox="0 0 84 67" fill="none"><mask id="mask0_135_5" style="mask-type: alpha" maskUnits="userSpaceOnUse" x="4" y="0" width="76" height="66"><rect x="4" width="76" height="66" fill="url(#pattern0)" /></mask><g mask="url(#mask0_135_5)"><rect x="0" y="0" width="84" height="67" fill="url(#pattern0)" /></g><defs><pattern id="pattern0" patternUnits="objectBoundingBox" width="1" height="1"><image href="./images/image.png" width="84" height="67" preserveAspectRatio="xMidYMid slice" /></pattern></defs></svg>
				    <svg class="brand-title" xmlns="http://www.w3.org/2000/svg" width="122" height="19" viewBox="0 0 122 19" fill="none"><text x="0" y="15" fill="black" font-family="Gill Sans" font-size="22" font-weight="bold">LEARNERA</text></svg>
				  </center>
				  </a>
                <h4 class="text-center mb-4">Login as Instructor</h4>
                <form  method="post" action="checkInstructorLogin">
                  <div class="form-group">
                    <label class="form-label" for="iemail">Email</label>
                    <input type="email" class="form-control" placeholder="hello@example.com" id="iemail" name="iemail" required />
                  </div>
                  <div class="mb-4 position-relative">
                    <label class="form-label" for="ipwd">Password</label>
                    <input type="password" class="form-control" placeholder="Password" id="ipwd" name="ipwd" required />
                    <span class="show-pass eye">
                      <i class="fa fa-eye-slash"></i>
                      <i class="fa fa-eye"></i>
                    </span>
                  </div>
                  <div class="form-row d-flex flex-wrap justify-content-between mt-4 mb-2">
                    <div class="form-group">
                      <div class="form-check custom-checkbox ms-1">
                        <input type="checkbox" class="form-check-input" id="basic_checkbox_1" />
                        <label class="form-check-label" for="basic_checkbox_1">Remember my preference</label>
                      </div>
                    </div>
                    <div class="form-group ms-2">
                      <a class="btn-link" href="page-forgot-password.html">Forgot Password?</a>
                    </div>
                  </div>
                  <div class="text-center">
                    <button type="submit" class="btn btn-primary btn-block">Sign Me In</button>
                  </div>
                </form>
                <div class="new-account mt-3">
                  <p>Don't have an account? <a class="text-primary" href="./page-register.html">Sign up</a></p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Scripts -->
    <script src="vendor/global/global.min.js"></script>
    <script src="vendor/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
    <script src="js/custom.min.js"></script>
    <script src="js/dlabnav-init.js"></script>
    <script src="js/demo.js"></script>
  </body>
</html>
