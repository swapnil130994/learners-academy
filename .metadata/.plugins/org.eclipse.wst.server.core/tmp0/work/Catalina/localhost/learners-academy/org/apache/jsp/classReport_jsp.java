/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-05-27 12:16:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Student;
import model.Clss;
import model.ClassFull;

public final class classReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1685189771071L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1685107714389L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1685159373312L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Clss");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model.ClassFull");
    _jspx_imports_classes.add("model.Student");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0\"/>\r\n");
      out.write("    <title>Learner's Academy 2023</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS  -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/materialize.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\r\n");
      out.write("    <link href=\"css/palette.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\r\n");
      out.write("    <link href=\"css/extras.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\r\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"default-primary-color\" role=\"navigation\">\r\n");
      out.write("    <div class=\"nav-wrapper container\">\r\n");
      out.write("        <a id=\"logo-container\" href=\"#\" class=\"brand-logo\">\r\n");
      out.write("            <img alt=\"logo\" src=\"images/eduspa.png\">Learner's Academy\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("            <li><a href=\"./dashboard-controller\">Dashboard</a></li>\r\n");
      out.write("            <li><a href=\"./\">Logout</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul id=\"nav-mobile\" class=\"sidenav\">\r\n");
      out.write("            <li><a href=\"./dashboard-controller\">Dashboard</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <a href=\"#\" data-target=\"nav-mobile\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br /><br />\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h3>Class Report</h3>\r\n");
      out.write("    <br />\r\n");
      out.write("    <table class=\"striped card-panel highlight\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th class=\"center-align\">Class Id</th>\r\n");
      out.write("            <th class=\"center-align\">Class Name</th>\r\n");
      out.write("            <th class=\"center-align\">Student Id</th>\r\n");
      out.write("            <th class=\"center-align\">Student Name</th>\r\n");
      out.write("\r\n");
      out.write("            <th class=\"center-align\">Teacher Name</th>\r\n");
      out.write("            <th class=\"center-align\">Subject</th>\r\n");
      out.write("            <th class=\"center-align\">Subject CODE</th>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        ");

            List<ClassFull> studentsList = (List<ClassFull>) request.getAttribute("studentsList");

            // Paint the rows of the student table
            for (ClassFull student : studentsList) {
                out.println("<tr>");
                out.println("<td class=\"center-align\">"+student.getClassId()+"</td>");
                out.println("<td class=\"center-align\">"+student.getClassName()+"</td>");
                out.println("<td class=\"center-align\">"+student.getStudentId()+"</td>");
                out.println("<td class=\"center-align\">"+student.getStudentName()+"</td>");
//                out.println("<td class=\"center-align\">"+student.getTeacherId()+"</td>");
                out.println("<td class=\"center-align\">"+student.getTeacherName()+"</td>");
                out.println("<td class=\"center-align\">"+student.getSubjectName()+"</td>");
                out.println("<td class=\"center-align\">"+student.getSubjectId()+"</td>");

                out.println("</tr>");
            }
        
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    async function handleSubmit(event) {\r\n");
      out.write("        event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("        const data = new FormData(event.target);\r\n");
      out.write("        const oFormEntries = Object.fromEntries(data.entries());\r\n");
      out.write("        console.log(\"----> about to saveOneStudent: \" + oFormEntries.toString());\r\n");
      out.write("        await saveOneStudent(oFormEntries);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    const form = document.querySelector('#form1');\r\n");
      out.write("    form.addEventListener('submit', handleSubmit);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  Scripts-->\r\n");
      out.write("<script>\r\n");
      out.write("    async function fOpenEdit(pId) {\r\n");
      out.write("\r\n");
      out.write("        // Set the action\r\n");
      out.write("        document.getElementById(\"action\").value = \"updateOneStudent\";\r\n");
      out.write("\r\n");
      out.write("        // Trigger the Modal to open\r\n");
      out.write("        document.getElementById('modalLink').click();\r\n");
      out.write("        document.getElementById(\"preloader\").style.display = \"flex\"; // this centers the spinner in the modal window\r\n");
      out.write("\r\n");
      out.write("        fetch(\"http://localhost:8080/learners-academy/student-controller\", {\r\n");
      out.write("            headers: {\r\n");
      out.write("                'Accept': 'application/json',\r\n");
      out.write("                'Content-Type': 'application/json'\r\n");
      out.write("            },\r\n");
      out.write("            method: \"POST\",\r\n");
      out.write("            body: JSON.stringify({action: \"fetchOneStudent\", studentId: pId})\r\n");
      out.write("\r\n");
      out.write("        }).then(res => res.text()).then(async (jsonString) => {\r\n");
      out.write("            console.log(\" -------> fetch: \" + jsonString);\r\n");
      out.write("            try {\r\n");
      out.write("\r\n");
      out.write("                //Painting the values\r\n");
      out.write("                const jsonObject = JSON.parse(jsonString);\r\n");
      out.write("                console.log(\"---> jsonString: \" + jsonString);\r\n");
      out.write("                document.querySelector(\"#studentId\").value = jsonObject.studentId;\r\n");
      out.write("                document.querySelector(\"#studentName\").value = jsonObject.studentName;\r\n");
      out.write("                // Display the modal, hide the spinner\r\n");
      out.write("                //document.querySelector(\"#classId\").value = jsonObject.classId;\r\n");
      out.write("                const classEl = document.getElementById(\"classId\");\r\n");
      out.write("\r\n");
      out.write("                for(var i=0; i<classEl.options.length; i++){\r\n");
      out.write("                    if(classEl.options[i].value == jsonObject.classId){\r\n");
      out.write("                        console.log(classEl.options[i].value + \" - \" + jsonObject.classId);\r\n");
      out.write("                        classEl.options.selectedIndex = i;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                //Re-initialize the select controls\r\n");
      out.write("                M.FormSelect.init(document.querySelectorAll('.select'), {classes: \"\"});\r\n");
      out.write("                M.updateTextFields();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                await delay(1000);\r\n");
      out.write("                document.getElementById(\"preloader\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("            } catch (e) {\r\n");
      out.write("                // On Error\r\n");
      out.write("                console.log(\"ERROR: fetchOneStudent/querySelector - \" + e);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    async function fOpenDelete(pId) {\r\n");
      out.write("\r\n");
      out.write("        // Set the action\r\n");
      out.write("        document.getElementById(\"action\").value = \"deleteOneStudent\";\r\n");
      out.write("\r\n");
      out.write("        // Trigger the Modal to open\r\n");
      out.write("        document.getElementById('modalLink').click();\r\n");
      out.write("        document.getElementById(\"preloader\").style.display = \"flex\"; // this centers the spinner in the modal window\r\n");
      out.write("\r\n");
      out.write("        fetch(\"http://localhost:8080/learners-academy/student-controller\", {\r\n");
      out.write("            headers: {\r\n");
      out.write("                'Accept': 'application/json',\r\n");
      out.write("                'Content-Type': 'application/json'\r\n");
      out.write("            },\r\n");
      out.write("            method: \"POST\",\r\n");
      out.write("            body: JSON.stringify({action: \"fetchOneStudent\", studentId: pId})\r\n");
      out.write("\r\n");
      out.write("        }).then(res => res.text()).then(async (jsonString) => {\r\n");
      out.write("            console.log(\" -------> fetch: \" + jsonString);\r\n");
      out.write("            try {\r\n");
      out.write("\r\n");
      out.write("                //Painting the values AND disabling the controls\r\n");
      out.write("                const jsonObject = JSON.parse(jsonString);\r\n");
      out.write("                console.log(\"---> jsonString: \" + jsonString);\r\n");
      out.write("                document.querySelector(\"#studentId\").value = jsonObject.studentId;\r\n");
      out.write("                document.querySelector(\"#studentName\").value = jsonObject.studentName;\r\n");
      out.write("                // Display the modal, hide the spinner\r\n");
      out.write("                //document.querySelector(\"#classId\").value = jsonObject.classId;\r\n");
      out.write("                const classEl = document.getElementById(\"classId\");\r\n");
      out.write("\r\n");
      out.write("                for(var i=0; i<classEl.options.length; i++){\r\n");
      out.write("                    if(classEl.options[i].value == jsonObject.classId){\r\n");
      out.write("                        console.log(classEl.options[i].value + \" - \" + jsonObject.classId);\r\n");
      out.write("                        classEl.options.selectedIndex = i;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                //Re-initialize the select controls\r\n");
      out.write("                classEl.disabled = true;\r\n");
      out.write("                M.FormSelect.init(document.querySelectorAll('.select'), {classes: \"\"});\r\n");
      out.write("                M.updateTextFields();\r\n");
      out.write("\r\n");
      out.write("                // Disabling the controls\r\n");
      out.write("                document.querySelector(\"#studentId\").disabled  = true;\r\n");
      out.write("                document.querySelector(\"#studentName\").disabled  = true;\r\n");
      out.write("\r\n");
      out.write("                //Setting the Id to delete\r\n");
      out.write("                document.querySelector(\"#deleteStudentId\").value = jsonObject.studentId;\r\n");
      out.write("                await delay(1000);\r\n");
      out.write("                document.getElementById(\"preloader\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("            } catch (e) {\r\n");
      out.write("                // On Error\r\n");
      out.write("                console.log(\"ERROR: fetchOneStudent/querySelector - \" + e);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    async function fOpenNew() {\r\n");
      out.write("\r\n");
      out.write("        // Set the action\r\n");
      out.write("        document.getElementById(\"action\").value = \"saveNewStudent\";\r\n");
      out.write("\r\n");
      out.write("        //Clean and enabling the controls\r\n");
      out.write("        document.querySelector(\"#studentId\").disabled  = false;\r\n");
      out.write("        document.querySelector(\"#studentName\").disabled  = false;\r\n");
      out.write("        document.getElementById(\"classId\").disabled = false;\r\n");
      out.write("\r\n");
      out.write("        M.FormSelect.init(document.querySelectorAll('.select'), {classes: \"\"});\r\n");
      out.write("        M.updateTextFields();\r\n");
      out.write("\r\n");
      out.write("        // Trigger the Modal to open\r\n");
      out.write("        document.getElementById('modalLink').click();\r\n");
      out.write("        document.getElementById(\"preloader\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //ACTION: updateOneStudent or saveNewStudent\r\n");
      out.write("    function saveOneStudent(oFormEntries) {\r\n");
      out.write("        console.log(\" -----> saveOneStudent:\" + \"\");\r\n");
      out.write("        console.log(\" -----> action: \" + document.getElementById('action').value);\r\n");
      out.write("        try {\r\n");
      out.write("            fetch(\"http://localhost:8080/learners-academy/student-controller\", {\r\n");
      out.write("                headers: {\r\n");
      out.write("                    'Accept': 'application/json',\r\n");
      out.write("                    'Content-Type': 'application/json'\r\n");
      out.write("                },\r\n");
      out.write("                method: \"POST\",\r\n");
      out.write("                body: JSON.stringify(oFormEntries)\r\n");
      out.write("            })\r\n");
      out.write("                .then(res => res.text()).then((jsonReturnString) => {\r\n");
      out.write("                console.log(\" -------> studentjsp fetch: \" + jsonReturnString);\r\n");
      out.write("                try {\r\n");
      out.write("\r\n");
      out.write("                    //Answer received from the servlet\r\n");
      out.write("                    const jsonObject = JSON.parse(jsonReturnString);\r\n");
      out.write("                    M.toast({\r\n");
      out.write("                        html:\r\n");
      out.write("                            jsonObject.code === 0 ? jsonObject.message : \"<table><tr><td class=\\\"center-align\\\">Student NOT UPDATED</td></tr><tr><td>CODE: \" + jsonObject.code +\r\n");
      out.write("                                \" - \" +\r\n");
      out.write("                                jsonObject.message + \"</td></tr></table>\"\r\n");
      out.write("                        , completeCallback: function(){location.reload()}\r\n");
      out.write("                    })\r\n");
      out.write("                } catch (e) {\r\n");
      out.write("                    // On Error\r\n");
      out.write("                    console.log(\"ERROR: fetchStudents/querySelector\" + e);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        } catch (e) {\r\n");
      out.write("            console.log(e);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //ACTION: updateOneStudent or saveNewStudent\r\n");
      out.write("    function deleteOneStudent(oFormEntries) {\r\n");
      out.write("        console.log(\" -----> deleteOneStudent:\" + \"\");\r\n");
      out.write("        console.log(\" -----> action: \" + document.getElementById('action').value);\r\n");
      out.write("        try {\r\n");
      out.write("            fetch(\"http://localhost:8080/learners-academy/student-controller\", {\r\n");
      out.write("                headers: {\r\n");
      out.write("                    'Accept': 'application/json',\r\n");
      out.write("                    'Content-Type': 'application/json'\r\n");
      out.write("                },\r\n");
      out.write("                method: \"POST\",\r\n");
      out.write("                body: JSON.stringify(oFormEntries)\r\n");
      out.write("            })\r\n");
      out.write("                .then(res => res.text()).then((jsonReturnString) => {\r\n");
      out.write("                console.log(\" -------> studentjsp fetch: \" + jsonReturnString);\r\n");
      out.write("                try {\r\n");
      out.write("\r\n");
      out.write("                    //Answer received from the servlet\r\n");
      out.write("                    const jsonObject = JSON.parse(jsonReturnString);\r\n");
      out.write("                    M.toast({\r\n");
      out.write("                        html:\r\n");
      out.write("                            jsonObject.code === 0 ? jsonObject.message : \"<table><tr><td class=\\\"center-align\\\">Student NOT UPDATED</td></tr><tr><td>CODE: \" + jsonObject.code +\r\n");
      out.write("                                \" - \" +\r\n");
      out.write("                                jsonObject.message + \"</td></tr></table>\"\r\n");
      out.write("                        , completeCallback: function(){location.reload()}\r\n");
      out.write("                    })\r\n");
      out.write("                } catch (e) {\r\n");
      out.write("                    // On Error\r\n");
      out.write("                    console.log(\"ERROR: fetchStudents/querySelector\" + e);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        } catch (e) {\r\n");
      out.write("            console.log(e);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    //Configuration of Modals\r\n");
      out.write("    document.addEventListener('DOMContentLoaded', function () {\r\n");
      out.write("        //Modal\r\n");
      out.write("        var elems = document.querySelectorAll('.modal');\r\n");
      out.write("        var options = {opacity: 0.5}//, onOpenStart: fOpenEdit};\r\n");
      out.write("        var instances = M.Modal.init(elems, options);\r\n");
      out.write("        var instance = M.Modal.getInstance(elems);\r\n");
      out.write("\r\n");
      out.write("        //Select\r\n");
      out.write("        var elems = document.querySelectorAll('.select');\r\n");
      out.write("        var options = {classes: \"\"}\r\n");
      out.write("        var instances = M.FormSelect.init(elems, options);\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/materialize.js\"></script>\r\n");
      out.write("<script src=\"js/pagination.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function createRequestObject()\r\n");
      out.write("    {\r\n");
      out.write("        var returnObj = false;\r\n");
      out.write("\r\n");
      out.write("        if(window.XMLHttpRequest) {\r\n");
      out.write("            returnObj = new XMLHttpRequest();\r\n");
      out.write("        } else if(window.ActiveXObject) {\r\n");
      out.write("            try {\r\n");
      out.write("                returnObj = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("\r\n");
      out.write("            } catch (e) {\r\n");
      out.write("                try {\r\n");
      out.write("                    returnObj = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("                }\r\n");
      out.write("                catch (e) {}\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        return returnObj;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var http = createRequestObject();\r\n");
      out.write("    var target;\r\n");
      out.write("\r\n");
      out.write("    // This is the function to call, give it the script file you want to run and\r\n");
      out.write("    // the div you want it to output to.\r\n");
      out.write("    function sendRequest(scriptFile, targetElement)\r\n");
      out.write("    {\r\n");
      out.write("        target = targetElement;\r\n");
      out.write("        try{\r\n");
      out.write("            http.open('get', scriptFile, true);\r\n");
      out.write("        }\r\n");
      out.write("        catch (e){\r\n");
      out.write("            document.getElementById(target).innerHTML = e;\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        http.onreadystatechange = handleResponse;\r\n");
      out.write("        http.send();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function handleResponse()\r\n");
      out.write("    {\r\n");
      out.write("        if(http.readyState == 4) {\r\n");
      out.write("            try{\r\n");
      out.write("                var strResponse = http.responseText;\r\n");
      out.write("                document.getElementById(target).innerHTML = strResponse;\r\n");
      out.write("            } catch (e){\r\n");
      out.write("                document.getElementById(target).innerHTML = e;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    const delay = ms => new Promise(res => setTimeout(res, ms));\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        $('#myTable').pageMe({\r\n");
      out.write("            pagerSelector:'#myPager',\r\n");
      out.write("            activeColor: 'blue',\r\n");
      out.write("            prevText:'Previous',\r\n");
      out.write("            nextText:'Next',\r\n");
      out.write("            showPrevNext:true,\r\n");
      out.write("            hidePageNumbers:false,\r\n");
      out.write("            perPage:10\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
