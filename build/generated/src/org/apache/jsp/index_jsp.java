package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>education</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/all.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/flexslider.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/owl.carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/owl.theme.default.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.rateyo.css\" />\r\n");
      out.write("        <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.mmenu.all.css\" /> -->\r\n");
      out.write("        <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"css/meanmenu.min.css\"> -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/inner-page-style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style1.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway:400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"page\" class=\"site\" itemscope itemtype=\"http://schema.org/LocalBusiness\">\r\n");
      out.write("            <header class=\"site-header\">\r\n");
      out.write("                <div class=\"top-header\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"top-header-left\">\r\n");
      out.write("                            <div class=\"top-header-block\">\r\n");
      out.write("                                <a href=\"mailto:info@educationpro.com\" itemprop=\"email\"><i class=\"fas fa-envelope\"></i>\r\n");
      out.write("                                    daihocfpt@fpt.edu.vn</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"top-header-block\">\r\n");
      out.write("                                <a href=\"tel:+9779813639131\" itemprop=\"telephone\"><i class=\"fas fa-phone\"></i> +977\r\n");
      out.write("                                    9813639131</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"top-header-right\">\r\n");
      out.write("                            <div class=\"social-block\">\r\n");
      out.write("                                <ul class=\"social-list\">\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fab fa-viber\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fab fa-google-plus-g\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fab fa-facebook-square\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fab fa-facebook-messenger\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fab fa-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fab fa-skype\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"login-block\">\r\n");
      out.write("                                <a href=\"Login.jsp\"><b style=\" font-style: italic\">Login </b></a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Top header Close -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"main-header\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"logo-wrap\" itemprop=\"logo\">\r\n");
      out.write("                            <img style=\"height: 60px;\" src=\"images/site-logo.jpg\" alt=\"Logo Image\">\r\n");
      out.write("                            <!-- <h1>Education</h1> -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"nav-wrap\">\r\n");
      out.write("                            <nav class=\"nav-desktop\">\r\n");
      out.write("                                <ul class=\"menu-list\">\r\n");
      out.write("                                    <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                                    <li class=\"menu-parent\">Majors\r\n");
      out.write("                                        <ul class=\"sub-menu\">\r\n");
      out.write("\r\n");
      out.write("                                            <li class=\"menu-parent\">Công nghệ thông tin\r\n");
      out.write("                                                <ul class=\"sub-menu\">\r\n");
      out.write("                                                    <li><a href=\"\">Kĩ thuật phần mềm</a></li>\r\n");
      out.write("                                                    <li><a href=\"\">An toàn thông tin</a></li>\r\n");
      out.write("                                                    <li><a href=\"\">Trí tuệ nhân tạo(AI)</a></li>\r\n");
      out.write("                                                    <li><a href=\"\">Thiết kế đồ họa</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            <li class=\"menu-parent\">Quản trị kinh doanh\r\n");
      out.write("                                                <ul class=\"sub-menu\">\r\n");
      out.write("                                                    <li><a href=\"\">Digital marketing</a></li>\r\n");
      out.write("                                                    <li><a href=\"\">Kinh doanh quốc tế</a></li>\r\n");
      out.write("                                                    <li><a href=\"\">Quản trị khách sạn</a></li>\r\n");
      out.write("                                                    <li><a href=\"\">Truyền thông đa phương tiện</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li><a href=\"#\">Ngôn ngữ Anh</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">Ngôn ngữ Hàn</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">Ngôn ngữ Nhật</a></li>\r\n");
      out.write("\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"menu-parent\">News\r\n");
      out.write("                                        <ul class=\"sub-menu\">\r\n");
      out.write("                                            <li><a href=\"#\">Tin tức chung</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">Hoạt động sinh viên</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">Sự kiện</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">Tuyển dụng</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">Hướng nghiệp</a></li>\r\n");
      out.write("\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"\">About</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Gallery</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Contact</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                            <div id=\"bar\">\r\n");
      out.write("                                <i class=\"fas fa-bars\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"close\">\r\n");
      out.write("                                <i class=\"fas fa-times\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- Header Close -->\r\n");
      out.write("            <div class=\"banner\">\r\n");
      out.write("                <div class=\"owl-four owl-carousel\" itemprop=\"image\">\r\n");
      out.write("                    <img src=\"images/page-banner.jpg\" alt=\"Image of Bannner\">\r\n");
      out.write("                    <img src=\"images/page-banner2.jpg\" alt=\"Image of Bannner\">\r\n");
      out.write("                    <img src=\"images/page-banner3.jpg\" alt=\"Image of Bannner\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container\" itemprop=\"description\">\r\n");
      out.write("                    <h1>FPT University Academic Portal</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"owl-four-nav\" class=\"owl-nav\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <section class=\"query-section\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <p style=\"font-size: 25px;text-align: center\">Any Queries? Ask us a question at<a href=\"tel:+9779813639131\"><i class=\"fas fa-phone\"></i> +977\r\n");
      out.write("                            9813639131</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- End of Query Section -->\r\n");
      out.write("            <footer style=\"font-size: 20px;\" class=\"page-footer\" itemprop=\"footer\" itemscope itemtype=\"http://schema.org/WPFooter\">\r\n");
      out.write("                <p style=\"text-align: center\">\r\n");
      out.write("                    © Powered by <a href=\"http://fpt.edu.vn\" target=\"_blank\">FPT University</a>&nbsp;|&nbsp;\r\n");
      out.write("                    <a href=\"http://cms.fpt.edu.vn/\" target=\"_blank\">CMS</a>&nbsp;|&nbsp; <a href=\"http://library.fpt.edu.vn\" target=\"_blank\">library</a>&nbsp;|&nbsp; <a href=\"http://library.books24x7.com\" target=\"_blank\">books24x7</a>\r\n");
      out.write("                    <span id=\"ctl00_lblHelpdesk\"></span>\r\n");
      out.write("                </p>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lightbox.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/all.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/isotope.pkgd.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/owl.carousel.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.rateyo.js\"></script>\r\n");
      out.write("        <!-- <script type=\"text/javascript\" src=\"js/jquery.mmenu.all.js\"></script> -->\r\n");
      out.write("        <!-- <script type=\"text/javascript\" src=\"js/jquery.meanmenu.min.js\"></script> -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/custom.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
