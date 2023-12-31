<!DOCTYPE html>
<html lang="en">

<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.LinkedHashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@include file="header.jsp"%>


<body>
<%@include file="navbar.jsp"%>
<div class="container">
<h3>Dashboard</h3>
<table>
    <tr>
        <td class="dashboard-cell"><div class="card-panel secondary-text-color hoverable">
        <a class=""
           href='./student-controller'><h5><i class="material-icons" style="cxolor:#4CAF50">group</i> Student
            list</h5></a>
        </div></td>
        <td class="dashboard-cell"><div class="card-panel secondary-text-color hoverable">
            <a href='./teacher-controller'><h5><i class="material-icons" style="cxolor:#536DFE">record_voice_over</i>
                Teacher list</h5></a>
        </div></td>
    </tr>
    <tr>
        <td class="dashboard-cell"><div class="card-panel secondary-text-color hoverable">
            <a href='./subject-controller'><h5><i class="material-icons" style="cxolor:#FF5722">reorder</i> Subject
                list</h5></a>
        </div></td>
        <td class="dashboard-cell"><div class="card-panel secondary-text-color hoverable">
            <a href='./clase-controller'><h5><i class="material-icons" style="cxolor:#E040FB">picture_in_picture_alt
            </i> Class list</h5></a>
        </div></td>
    </tr>
    <tr>
        <td class="dashboard-cell"><div class="card-panel secondary-text-color hoverable">
            <a
                    href='./class-report-controller'><h5><i class="material-icons" style="cxolor:#FFC107">poll</i> Class
                Report</h5></a>
        </div></td>
        <td class="dashboard-cell"><div class="card-panel secondary-text-color hoverable">
            <a href='./class-subject-controller'><h5><i class="material-icons" style="cxolor:#AFB42B">storage</i>
            Subjects Per Class</h5></a>
        </div></td>
    </tr>
    <tr>
        <td class="dashboard-cell"><div class="card-panel secondary-text-color hoverable">
            <a href='./subjects-per-class-controller'><h5><i class="material-icons" style="cxolor:#536DFE">swap_horiz</i>
                Assign Subjects to One Class</h5></a>
        </div></td>
        <td class="dashboard-cell"><div class="card-panel secondary-text-color hoverable">
            <a href='./teacher-per-subject-controller'><h5><i class="material-icons" style="cxolor:#E91E63">system_update_alt</i> Assign
                Teachers to Subject</h5></a>
        </div></td>
    </tr>
</table>
</div>
<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js"></script>
<script src="js/init.js"></script>

</body>
</html>