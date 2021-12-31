package org.apache.jsp.Guest;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Smart Trolley</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("    <link href=\"css/custom.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t<script src=\"//use.edgefonts.net/bebas-neue.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts & Icons -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,600,800' rel='stylesheet' type='text/css'>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon-social.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\n");
      out.write("\t<script src=\"js/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("        <!--[if lt IE 7]>\n");
      out.write("            <p class=\"chromeframe\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">activate Google Chrome Frame</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("        \n");
      out.write("\n");
      out.write("    <header class=\"navbar navbar-inverse navbar-fixed-top\" role=\"banner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\"><img src=\"img/logo1.png\" width=\"100\" height=\"100\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                    <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                   \n");
      out.write("                    <li><a href=\"register.jsp\">New User</a></li> \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header><!--/header-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    <section id=\"main-slider\" class=\"no-margin\">\n");
      out.write("        <div class=\"carousel slide\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"item active\" style=\"background-image: url(img/slides/pic2.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"carousel-content centered\">\n");
      out.write("                                    <h2 class=\"animation animated-item-1\"></h2>\n");
      out.write("                                    <p class=\"animation animated-item-2\"> </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("                <div class=\"item\" style=\"background-image: url(img/slides/pic5.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"carousel-content center centered\">\n");
      out.write("                                  \n");
      out.write("                                    <br>\n");
      out.write("                                   \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("                <div class=\"item\" style=\"background-image: url(img/slides/pic1.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"carousel-content center centered\">\n");
      out.write("                                  \n");
      out.write("                                    <br>\n");
      out.write("                                   \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("                <div class=\"item\" style=\"background-image: url(img/slides/pic4.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"carousel-content centered\">\n");
      out.write("                            \n");
      out.write("                                    <br>\n");
      out.write("\t\t\t\t\t\t\t\t\t                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("            </div><!--/.carousel-inner-->\n");
      out.write("        </div><!--/.carousel-->\n");
      out.write("        <a class=\"prev hidden-xs\" href=\"#main-slider\" data-slide=\"prev\">\n");
      out.write("            <i class=\"icon-angle-left\"></i>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"next hidden-xs\" href=\"#main-slider\" data-slide=\"next\">\n");
      out.write("            <i class=\"icon-angle-right\"></i>\n");
      out.write("        </a>\n");
      out.write("    </section><!--/#main-slider-->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Services -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\t    <!-- End Services -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Our Portfolio -->\t\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\t\t<!-- Our Portfolio -->\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t    <!-- Footer -->\n");
      out.write("\t    <div class=\"footer\">\n");
      out.write("\t    \t<div class=\"container\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t    \t\t<div class=\"col-footer col-md-4 col-xs-6\">\n");
      out.write("\t\t    \t\t\t<h3>Contact Us</h3>\n");
      out.write("\t\t    \t\t\t<p class=\"contact-us-details\">\n");
      out.write("\t        \t\t\t\t<b>Address:</b>MGM College of Engineering and Technology,Pampakuda<br/>\n");
      out.write("\t        \t\t\t\t<b>Phone:</b> 0485-2274455<br/>\n");
      out.write("\t        \t\t\t\t\n");
      out.write("\t        \t\t\t\t<b>Email:</b> <a href=\"mailto:mail@mgmcet.ac.in\">mail@mgmcet.ac.in</a>\n");
      out.write("\t        \t\t\t</p>\n");
      out.write("\t\t    \t\t</div>\t\t\t\t\n");
      out.write("\t\t    \t\t\n");
      out.write("\t\t    \t\t<div class=\"col-footer col-md-4 col-xs-6\">\n");
      out.write("\t\t    \t\t\t<h3>About Our Product</h3>\n");
      out.write("\t\t    \t\t\t\t<p>The main of aim of growing technology is to make life easier. Nowadays shopping mall is a place where people get their daily necessities. ... So to avoid headache like waiting in billing queue we are introducing new concept that is “SMART TROLLEY WITH INSTANT BILLING”.</p>\n");
      out.write("\t\t    \t\t</div>\n");
      out.write("\n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t    \t\t<div class=\"col-md-12\">\n");
      out.write("\t\t    \t\t\t<div class=\"footer-copyright\">&copy; 2019 <a href=\"http://www.vactualart.com/portfolio-item/basica-a-free-html5-template/\"></a>  <a href=\"http://www.vactualart.com\">MusicWorld</a>.</div>\n");
      out.write("\t\t    \t\t</div>\n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t    </div>\n");
      out.write("\n");
      out.write("        <!-- Javascripts -->\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/jquery-1.9.1.min.js\"><\\/script>')</script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Scrolling Nav JavaScript -->\n");
      out.write("\t\t<script src=\"js/jquery.easing.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/scrolling-nav.js\"></script>\t\t\n");
      out.write("\n");
      out.write("    </body>\n");
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
