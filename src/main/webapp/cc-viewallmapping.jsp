<!DOCTYPE html>
<%@page import="com.klef.jfsd.sdp.model.InstructorCourseMapping"%>
<%@page import="java.util.List"%>
<html>
<head>
    <title>View All Mappings</title>
</head>
<body>
    <h1>Instructor-Course Mappings</h1>

    <% 
        String message = (String) session.getAttribute("message");
        String alertClass = (String) session.getAttribute("alertClass");
        if (message != null) {
    %>
        <div class="<%= alertClass %>"><%= message %></div>
    <% 
        } 
    %>
    <table border="1">
        <thead>
            <tr>
                <th>Mapping ID</th>
                <th>Instructor Name</th>
                <th>Course Name</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<InstructorCourseMapping> mappings = 
                    (List<InstructorCourseMapping>) session.getAttribute("mappings");
                if (mappings != null) {
                    for (InstructorCourseMapping mapping : mappings) {
            %>
                <tr>
                    <td><%= mapping.getId() %></td>
                    <td><%= mapping.getInstructorid() %></td>
                    <td><%= mapping.getCourseid() %></td>
                </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>
</body>
</html>
