package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Teacher;
import model.Feedback;

public final class fbpageforteacher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 16px;\" lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"What We Do\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <title>FPT-home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nicepage.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Page-16.css\" media=\"screen\">\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"js/jquery-1.9.1.min.js\" defer=\"\"></script>\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"js/nicepage.js\" defer=\"\"></script>\n");
      out.write("        <meta name=\"generator\" content=\"Nicepage 5.20.8, nicepage.com\">\n");
      out.write("        <link id=\"u-theme-google-font\" rel=\"stylesheet\"\n");
      out.write("              href=\"https://fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"application/ld+json\">{\n");
      out.write("            \"@context\": \"http://schema.org\",\n");
      out.write("            \"@type\": \"Organization\",\n");
      out.write("            \"name\": \"\",\n");
      out.write("            \"url\": \"/\",\n");
      out.write("            \"logo\": \"images/default-logo.png\"\n");
      out.write("            }</script>\n");
      out.write("        <meta name=\"theme-color\" content=\"#4b7de1\">\n");
      out.write("        <meta property=\"og:title\" content=\"Page 16\">\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\n");
      out.write("        <link rel=\"canonical\" href=\"/\">\n");
      out.write("        <meta data-intl-tel-input-cdn-path=\"intlTelInput/\">\n");
      out.write("        <style>\n");
      out.write("            /* Add your CSS rules here */\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f8f8f8;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .u-sheet-1 {\n");
      out.write("                max-width: 1200px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .u-logo-vertical-center {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .u-logo-image {\n");
      out.write("                max-height: 100%;\n");
      out.write("                margin: auto;\n");
      out.write("                margin-top: -20px\n");
      out.write("            }\n");
      out.write("            .style1 {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                margin: 0 auto;\n");
      out.write("                max-width: 960px;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .col-md-8 h1 span {\n");
      out.write("                font-size: 2em;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"] {\n");
      out.write("                background-color: #007bff;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #0056b3;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .breadcrumb {\n");
      out.write("                background-color: #fff;\n");
      out.write("                padding: 8px 15px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table,\n");
      out.write("            th,\n");
      out.write("            td {\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th,\n");
      out.write("            td {\n");
      out.write("                padding: 8px;\n");
      out.write("                text-align: left;\n");
      out.write("            }</style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body data-home-page=\"https://website6008039.nicepage.io/Page-16.html?version=2cc06c66-8a77-b3b7-aa59-add009b8a2d8\"\n");
      out.write("          data-home-page-title=\"Page 16\" data-path-to-root=\"./\" data-include-products=\"false\" class=\"u-body u-xl-mode\"\n");
      out.write("          data-lang=\"en\">\n");
      out.write("        ");

            Feedback f = new Feedback();
            if(request.getAttribute("f")!= null){
            f = (Feedback)request.getAttribute("f");}
        
      out.write("\n");
      out.write("\n");
      out.write("        <header class=\"u-clearfix u-header u-header\" id=\"sec-fce5\" style=\"background-color: #3aecf8\">\n");
      out.write("            <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("                <a href=\"Studenthome.jsp\" class=\"u-image u-logo u-image-1\" >\n");
      out.write("                    <img src=\"images/default-logo.png\" class=\"u-logo-image u-logo-image-1\">\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <nav class=\"u-menu u-menu-hamburger u-offcanvas u-menu-1\" data-responsive-from=\"XL\">\n");
      out.write("                    <div class=\"menu-collapse\" style=\"font-size: 1rem; letter-spacing: 0px;\">\n");
      out.write("                        <a class=\"u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base\"\n");
      out.write("                           href=\"#\">\n");
      out.write("                            <svg class=\"u-svg-link\" viewBox=\"0 0 24 24\">\n");
      out.write("                            <use xlink:href=\"#menu-hamburger\"></use>\n");
      out.write("                            </svg>\n");
      out.write("                            <svg class=\"u-svg-content\" version=\"1.1\" id=\"menu-hamburger\" viewBox=\"0 0 16 16\" x=\"0px\" y=\"0px\"\n");
      out.write("                                 xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                            <g>\n");
      out.write("                            <rect y=\"1\" width=\"16\" height=\"2\"></rect>\n");
      out.write("                            <rect y=\"7\" width=\"16\" height=\"2\"></rect>\n");
      out.write("                            <rect y=\"13\" width=\"16\" height=\"2\"></rect>\n");
      out.write("                            </g>\n");
      out.write("                            </svg>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"u-custom-menu u-nav-container\">\n");
      out.write("                        <ul class=\"u-nav u-unstyled u-nav-1\">\n");
      out.write("                            <li class=\"u-nav-item\"><a\n");
      out.write("                                    class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base\" href=\"Teacherhome.jsp\"\n");
      out.write("                                    style=\"padding: 10px 20px;\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"u-nav-item\"><a\n");
      out.write("                                    class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base\" href=\"tofeedbackpageteacher?tid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getTeacherId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                    style=\"padding: 10px 20px;\">Student list feedback</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"u-nav-item\"><a\n");
      out.write("                                    class=\"u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base\" href=\"index.jsp\"\n");
      out.write("                                    style=\"padding: 10px 20px;\">Log out</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"u-custom-menu u-nav-container-collapse\">\n");
      out.write("                        <div class=\"u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav\">\n");
      out.write("                            <div class=\"u-inner-container-layout u-sidenav-overflow\">\n");
      out.write("                                <div class=\"u-menu-close\"></div>\n");
      out.write("                                <ul class=\"u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2\">\n");
      out.write("                                    <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Studenthome.jsp\">Home</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"tofeedbackpageteacher?tid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getTeacherId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Student list feedback</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"index.jsp\">Log out</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"u-black u-menu-overlay u-opacity u-opacity-70\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <section\n");
      out.write("            class=\"u-align-center-lg u-align-center-md u-align-center-xl u-align-left-sm u-align-left-xs u-clearfix u-container-align-center-xl u-white u-section-1\"\n");
      out.write("            id=\"sec-ba01\" data-animation-name=\"\" data-animation-duration=\"0\" data-animation-delay=\"0\"\n");
      out.write("            data-animation-direction=\"\">\n");
      out.write("            <div class=\"u-clearfix u-sheet \">\n");
      out.write("                <h2 class=\"u-align-center u-text u-text-default u-text-palette-2-base u-text-1\"\n");
      out.write("                    data-animation-name=\"customAnimationIn\" data-animation-duration=\"1500\" data-animation-delay=\"0\"> FPT University\n");
      out.write("                    Academic Portal</h2>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <form action=\"tofeedbackpageteacher\" method=\"get\" style=\"margin-top: 50px; margin-left: 200px; margin-right: 200px;\">\n");
      out.write("            <table>\n");
      out.write("                <tr style=\"border-bottom: 0 none\">\n");
      out.write("                    <td>\n");
      out.write("                        <div>\n");
      out.write("                            <center>\n");
      out.write("                                <h3>\n");
      out.write("                                    <b> STUDENT FEEDBACK FORM FOR TEACHER</b>\n");
      out.write("                                    <input name=\"tid\" value=\"");
      out.print(f.getTeacherId());
      out.write("\" hidden>\n");
      out.write("                                </h3>\n");
      out.write("                            </center>\n");
      out.write("                            <span id=\"ctl00_mainContent_lblMege\" style=\"color:Red;\"></span>\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        Batch (Lớp): \n");
      out.write("                                        <span id=\"ctl00_mainContent_lblGroup\">");
      out.print(f.getClassName());
      out.write("</span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>                               \n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        Subject(Môn học):<span id=\"ctl00_mainContent_lblSubject\">");
      out.print(f.getSubId());
      out.write("</span>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        Teacher (Giảng viên):\n");
      out.write("                                        <span id=\"ctl00_mainContent_lblTeacher\">");
      out.print(f.getTeacherId());
      out.write("</span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                            <table id=\"ctl00_mainContent_reload\" cellspacing=\"1\" cellpadding=\"2\" border=\"0\"\n");
      out.write("                                   style=\"border-width:1px;border-style:solid;width:100%;\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <table width=\"100%\" style=\"background-color: #efefef;\" border=\"0\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <font style=\"font-weight: bold\">\n");
      out.write("                                                    <span id=\"ctl00_mainContent_reload_ctl00__GroupQuestion\">Regarding the teacher's\n");
      out.write("                                                        punctuality</span>\n");
      out.write("                                                    </font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;<font style=\"font-style: italic\">(<span\n");
      out.write("                                                        id=\"ctl00_mainContent_reload_ctl00_lblNoi_dung\">Sự đúng giờ của giảng viên trong giờ\n");
      out.write("                                                        học</span>)</font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    <table id=\"ctl00_mainContent_reload_ctl00_chkList\" border=\"0\">\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>");
if(f.getPunctuality().equals("4")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" name=\"punctuality\" value=\"4\" checked><label for=\"punctuality\">Always punctual (Luôn đúng giờ)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" name=\"punctuality\" value=\"4\" disabled><label for=\"punctuality\">Always punctual (Luôn đúng giờ)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getPunctuality().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_1\" type=\"radio\" name=\"punctuality\" value=\"3\" checked><label for=\"punctuality\">Mostly punctual (Phần lớn đúng giờ)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_1\" type=\"radio\" name=\"punctuality\" value=\"3\" disabled><label for=\"punctuality\">Always punctual (Luôn đúng giờ)</label>");}

                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getPunctuality().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" name=\"punctuality\" value=\"2\" checked><label for=\"punctuality\">Rarely punctual (Ít khi đúng giờ)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" name=\"punctuality\" value=\"2\" disabled><label for=\"punctuality\">Rarely punctual (Ít khi đúng giờ)</label>");}

                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getPunctuality().equals("1")){
                                                                    out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_3\" type=\"radio\" name=\"punctuality\" value=\"1\" checked><label for=\"punctuality\">Not at all punctual (Không bao giờ đúng giờ)</label>");}
                                                                    else{
                                                                    out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_3\" type=\"radio\" name=\"punctuality\" value=\"1\" disabled><label for=\"punctuality\">Not at all punctual (Không bao giờ đúng giờ)</label>");}

                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <table width=\"100%\" style=\"background-color: #efefef;\" border=\"0\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <font style=\"font-weight: bold\">\n");
      out.write("                                                    <span id=\"ctl00_mainContent_reload_ctl01__GroupQuestion\">Teaching skills of\n");
      out.write("                                                        teacher</span>\n");
      out.write("                                                    </font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;<font style=\"font-style: italic\">(<span\n");
      out.write("                                                        id=\"ctl00_mainContent_reload_ctl01_lblNoi_dung\">Kỹ năng sư phạm của giảng viên</span>)\n");
      out.write("                                                    </font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    <table id=\"ctl00_mainContent_reload_ctl01_chkList\" border=\"0\">\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTeaching_skills().equals("4")){
                                                                    out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Very Good (Tốt)</label>");}
                                                                    else{
                                                                    out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Very Good (Tốt)</label>");}

                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTeaching_skills().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_1\" type=\"radio\" checked><label for=\"punctuality\">Good (Khá)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_1\" type=\"radio\" disabled><label for=\"punctuality\">Good (Khá)</label>");}

                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTeaching_skills().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Average (Trung bình)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Average (Trung bình)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>                                \n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTeaching_skills().equals("1")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Poor (Kém)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Poor (Kém)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <table width=\"100%\" style=\"background-color: #efefef;\" border=\"0\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <font style=\"font-weight: bold\">\n");
      out.write("                                                    <span id=\"ctl00_mainContent_reload_ctl02__GroupQuestion\">The teacher adequately covers\n");
      out.write("                                                        the topics required by the syllabus</span>\n");
      out.write("                                                    </font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;<font style=\"font-style: italic\">(<span\n");
      out.write("                                                        id=\"ctl00_mainContent_reload_ctl02_lblNoi_dung\">Đảm bảo khối lượng môn học theo chương\n");
      out.write("                                                        trình</span>)</font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    <table id=\"ctl00_mainContent_reload_ctl02_chkList\" border=\"0\">\n");
      out.write("                                                        <tr>\n");
      out.write("\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTopic_coverage().equals("4")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Fully covered (Đảm bảo hoàn toàn)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Fully covered (Đảm bảo hoàn toàn)</label>");}

                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTopic_coverage().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Mostly covered (Đảm bảo phần lớn)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Mostly covered (Đảm bảo phần lớn)</label>");}

                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTopic_coverage().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Partially covered (Chỉ đảm bảo một phần)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Partially covered (Chỉ đảm bảo một phần)</label>");}

                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTopic_coverage().equals("1")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Not at all covered (Không đảm bảo)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Not at all covered (Không đảm bảo)</label>");}

                                                                
      out.write("</td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <table width=\"100%\" style=\"background-color: #efefef;\" border=\"0\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <font style=\"font-weight: bold\">\n");
      out.write("                                                    <span id=\"ctl00_mainContent_reload_ctl03__GroupQuestion\">Support from the teacher -\n");
      out.write("                                                        guidance for practical exercises, answering questions out side of class </span>\n");
      out.write("                                                    </font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;<font style=\"font-style: italic\">(<span\n");
      out.write("                                                        id=\"ctl00_mainContent_reload_ctl03_lblNoi_dung\">Hỗ trợ của giảng viên trong và ngoài\n");
      out.write("                                                        giờ - trả lời Email, hướng dẫn thực hành, giải đáp thắc mắc…</span>)</font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    <table id=\"ctl00_mainContent_reload_ctl03_chkList\" border=\"0\">\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTeacher_support().equals("4")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Very Good (Tốt)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Very Good (Tốt)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTeacher_support().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Good (Khá)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Good (Khá)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTeacher_support().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Average (Trung bình)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Average (Trung bình)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getTeacher_support().equals("1")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Poor (Kém)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Poor (Kém)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <table width=\"100%\" style=\"background-color: #efefef;\" border=\"0\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <font style=\"font-weight: bold\">\n");
      out.write("                                                    <span id=\"ctl00_mainContent_reload_ctl04__GroupQuestion\">Teacher's response to student's\n");
      out.write("                                                        questions in class</span>\n");
      out.write("                                                    </font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;<font style=\"font-style: italic\">(<span\n");
      out.write("                                                        id=\"ctl00_mainContent_reload_ctl04_lblNoi_dung\">Đáp ứng của giảng viên về những thắc\n");
      out.write("                                                        mắc của học viên trong giờ học</span>)</font>\n");
      out.write("                                                    <br />\n");
      out.write("                                                    <table id=\"ctl00_mainContent_reload_ctl04_chkList\" border=\"0\">\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getResponse_time().equals("4")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Answered immediately or just after the session (Trả lời ngay hoặc trả lời vào cuối buổi học)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Answered immediately or just after the session (Trả lời ngay hoặc trả lời vào cuối buổi học)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getResponse_time().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Answered in the next session (Trả lời vào buổi học sau)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Answered in the next session (Trả lời vào buổi học sau)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getResponse_time().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Some queries left unanswered (Một số câu hỏi không được trả lời)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Some queries left unanswered (Một số câu hỏi không được trả lời)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
if(f.getResponse_time().equals("1")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Most queries left unanswered (Phần lớn câu hỏi không được trả lời)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Most queries left unanswered (Phần lớn câu hỏi không được trả lời)</label>");}
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                            <br>\n");
      out.write("                            <textarea name=\"comment\" rows=\"5\" cols=\"70\"\n");
      out.write("                                      id=\"ctl00_mainContent_txtComment\">");
      out.print(f.getComment());
      out.write("</textarea><br />\n");
      out.write("                            <input type=\"submit\" name=\"ctl00$mainContent$btSendFeedback\" value=\"Return\"\n");
      out.write("                                   id=\"ctl00_mainContent_btSendFeedback\" /><br />\n");
      out.write("                            <br />\n");
      out.write("                            <br />\n");
      out.write("                            <hr />\n");
      out.write("                            <center>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr style=\"border-bottom: 0 none\">\n");
      out.write("                    <td>\n");
      out.write("                        <br />\n");
      out.write("                        <table width=\"100%\" style=\"border: 1px solid transparent;\" id=\"cssTable\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <div id=\"ctl00_divSupport\">\n");
      out.write("                                        <br />\n");
      out.write("                                        <b>Mọi góp ý, thắc mắc xin liên hệ: </b><span\n");
      out.write("                                            style=\"color: rgb(34, 34, 34); font-family: arial, sans-serif; font-size: 13.333333969116211px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;\">Phòng\n");
      out.write("                                            dịch vụ sinh viên</span>: Email: <a\n");
      out.write("                                            href=\"/cdn-cgi/l/email-protection#690d000a011f1c1a0007011f000c07290f0c470c0d1c471f07\"><span\n");
      out.write("                                                class=\"__cf_email__\"\n");
      out.write("                                                data-cfemail=\"dbbfb2b8b3adaea8b2b5b3adb2beb59bbdbef5bebfaef5adb5\">[email&#160;protected]</span></a>.\n");
      out.write("                                        Điện thoại: <span class=\"style1\"\n");
      out.write("                                                          style=\"color: rgb(34, 34, 34); font-family: arial, sans-serif; font-size: 13.333333969116211px; font-style: normal; font-variant: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;\">(024)7308.13.13\n");
      out.write("                                        </span>\n");
      out.write("                                        <br />\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <p style=\"text-align: center\">\n");
      out.write("                                        © Powered by <a href=\"#\" target=\"_blank\">FPT University</a>&nbsp;|&nbsp;\n");
      out.write("                                        <a href=\"#\" target=\"_blank\">CMS</a>&nbsp;|&nbsp; <a\n");
      out.write("                                            href=\"#\" target=\"_blank\">library</a>&nbsp;|&nbsp; <a\n");
      out.write("                                            href=\"#\" target=\"_blank\">books24x7</a>\n");
      out.write("                                        <span id=\"ctl00_lblHelpdesk\"></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
