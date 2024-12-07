<!DOCTYPE html>
<%@page import="com.klef.jfsd.sdp.model.Instructor"%>
<%@page import="com.klef.jfsd.sdp.model.Course"%>
<%@page import="java.util.List"%>
<html lang="en">
  <head>
    <title>Instructor Course Mapping</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
    />
  </head>
  <body>
    <div class="container mt-5">
      <div class="row justify-content-center">
        <div class="col-lg-6 col-md-8">
          <div class="card">
            <div class="card-body">
              <h4 class="text-center mb-4">Instructor Course Mapping</h4>
              <form method="post" action="mapInstructorToCourse">
                <!-- Dropdown for Course -->
                <div class="form-group mb-3">
                  <label class="form-label" for="courseid">Select Course</label>
                  <select class="form-select" id="courseid" name="courseid" required>
                    <option value="">Select a Course</option>
                    <!-- Populate options dynamically -->
                    <%
                      List<Course> courses = (List<Course>) session.getAttribute("courses");
                      if (courses != null) {
                        for (Course course : courses) {
                    %>
                      <option value="<%= course.getCourseid() %>"><%= course.getCoursetitle() %></option>
                    <%
                        }
                      }
                    %>
                  </select>
                </div>
                <!-- Dropdown for Instructor -->
                <div class="form-group mb-3">
                  <label class="form-label" for="instructorid">Select Instructor</label>
                  <select class="form-select" id="instructorid" name="instructorid" required>
                    <option value="">Select an Instructor</option>
                    <!-- Populate options dynamically -->
                    <%
                      List<Instructor> instructors = (List<Instructor>) session.getAttribute("instructors");
                      if (instructors != null) {
                        for (Instructor instructor : instructors) {
                    %>
                      <option value="<%= instructor.getId() %>"><%= instructor.getId() %></option>
                    <%
                        }
                      }
                    %>
                  </select>
                </div>
                <div class="text-center mt-4">
                  <button type="submit" class="btn btn-primary btn-block">
                    Map Instructor to Course
                  </button>
                </div>
              </form>
              <div class="new-account mt-3">
                <p>
                  Go back to the
                  <a class="text-primary" href="cchome">dashboard</a>.
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
    ></script>
  </body>
</html>