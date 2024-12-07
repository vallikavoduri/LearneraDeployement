<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Title -->
    <title>LEARNERA</title>
    <!-- Meta -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="robots" content="index, follow" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="icon" type="image/png" sizes="16x16"
      href="./images/favicon1.png"/>
    <!-- STYLESHEETS -->
    <link rel="stylesheet" href="vendor/jqvmap/css/jqvmap.min.css" />
    <link rel="stylesheet" href="vendor/chartist/css/chartist.min.css" />
    <link
      rel="stylesheet"
      href="vendor/bootstrap-select/dist/css/bootstrap-select.min.css"
    />
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
				    <center><svg class="logo-abbr" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="84" height="67" viewBox="0 0 84 67" fill="none"><mask id="mask0_135_5" style="mask-type: alpha" maskUnits="userSpaceOnUse" x="4" y="0" width="76" height="66"><rect x="4" width="76" height="66" fill="url(#pattern0)" /></mask><g mask="url(#mask0_135_5)"><rect x="0" y="0" width="84" height="67" fill="url(#pattern0)" /></g><defs><pattern id="pattern0" patternUnits="objectBoundingBox" width="1" height="1"><image href="./images/image.png" width="84" height="67" preserveAspectRatio="xMidYMid slice" /></pattern></defs></svg>
				    <svg class="brand-title" xmlns="http://www.w3.org/2000/svg" width="122" height="19" viewBox="0 0 122 19" fill="none"><text x="0" y="15" fill="black" font-family="Gill Sans" font-size="22" font-weight="bold">LEARNERA</text></svg></center>
				  </a>
                <h4 class="text-center mb-4">Student Registration</h4>
                <form method="post" action="insertstudent">
                  <div class="form-group">
                    <label class="form-label" for="sname">Username</label>
                    <input type="text" class="form-control" placeholder="username" id="sname" name="sname" required/>
                  </div>
                  <div class="form-group">
                    <label class="form-label" for="sgender">Gender</label>
 						<input type="radio" id="male" name="sgender" value="MALE" required/>
                        <label for="male">Male</label>
                        <input type="radio" id="female" name="sgender" value="FEMALE" required/>
                        <label for="female">Female</label>
                        <input type="radio" id="others" name="sgender" value="OTHERS" required/>
                        <label for="others">Others</label>                  
                  </div>
                  <div class="form-group">
                    <label class="form-label" for="sdob">Date Of Birth</label>
                    <input type="date" id="sdob" name="sdob" required/>
                  </div>
                  <div class="form-group">
                    <label class="form-label" for="semail">Email</label>
                    <input type="email" class="form-control" placeholder="hello@example.com" id="semail" name="semail" required/>
                  </div>
                  <div class="mb-4 position-relative">
                    <label class="form-label" for="spwd">Password</label>
                    <input type="password" id="spwd" class="form-control"value="1234" name="spwd" required/>
                    <span class="show-pass eye">
                      <i class="fa fa-eye-slash"></i>
                      <i class="fa fa-eye"></i>
                    </span>
                  </div>
                  <div class="form-group">
                    <label class="form-label" for="scontact">Contact</label>
                    <input type="number" class="form-control" id="scontact" name="scontact" required/>
                  </div>
                  <div class="text-center mt-4">
                    <button type="submit" class="btn btn-primary btn-block">Sign me up </button>
                  </div>
                </form>
                <div class="new-account mt-3">
                  <p>
                    Already have an account?
                    <a class="text-primary" href="page-login.html">Sign in</a>
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Scripts -->
    <!-- Required vendors -->
    <script src="vendor/global/global.min.js"></script>
    <script src="vendor/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
    <script src="js/custom.min.js"></script>
    <script src="js/dlabnav-init.js"></script>
    <script src="js/demo.js"></script>
  </body>
</html>