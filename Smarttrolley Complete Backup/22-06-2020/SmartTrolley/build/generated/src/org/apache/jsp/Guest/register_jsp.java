package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Guest/header.jsp");
    _jspx_dependants.add("/Guest/footer.jsp");
  }

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
      DB.ConnectionClass obj1 = null;
      synchronized (_jspx_page_context) {
        obj1 = (DB.ConnectionClass) _jspx_page_context.getAttribute("obj1", PageContext.PAGE_SCOPE);
        if (obj1 == null){
          obj1 = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("obj1", obj1, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Smart Trolley</title>\n");
      out.write("\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <header class=\"navbar navbar-inverse navbar-fixed-top\" role=\"banner\">\n");
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
      out.write("                   <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
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
      out.write("        <!-- Page Title -->\n");
      out.write("\t\t<div class=\"section section-breadcrumbs\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("        <div class=\"section\">\n");
      out.write("\t    \t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<img class=\"img-responsive\" src=\"img/about-us.PNG\" alt=\"About Us\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Smart  Trolley</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        if(request.getParameter("btnsubmit")!=null){
            
            String name=request.getParameter("txtname");
            String address=request.getParameter("txtaddress");
            String email=request.getParameter("txtemail");
            String contactno=request.getParameter("contact");
            String gender=request.getParameter("gender");
            String uname=request.getParameter("txtuname");
            String password=request.getParameter("txtpassword");
            String aadhar=request.getParameter("aadhar");
            String placeid=request.getParameter("place");
            String photo=request.getParameter("photo");
            boolean b=false;
                b=obj1.execute("insert into tb_register(name,address,email,contactno,gender,username,password,placeid,photo,aadharno)values('"+name+"','"+address+"','"+email+"',"+contactno+",'"+gender+"','"+uname+"','"+password+"',"+placeid+",'"+photo+"',"+aadhar+")");
                 if (b==true){
                    out.print("success");
                }
                else {
                    out.print("failed");
                }
        }
        
        
      out.write("\n");
      out.write("        <form method=\"post\" enctype=\"multipart/form-data\" action=\"UploadAction.jsp\">\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <th align=\"center\">REGISTRATION</th>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtname\" required=\"required\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtaddress\" required=\"required\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtemail\" required=\"required\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact Number</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"number\" name=\"contact\" required=\"required\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"male\" required=\"required\">Male\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"female\" required=\"required\">Female\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Username</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtuname\" required=\"required\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"password\" name=\"txtpassword\" required=\"required\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>District</td>\n");
      out.write("                    \n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"district\">\n");
      out.write("                            <option value=\"0\">----------select----------</option>\n");
      out.write("                            ");

                                obj1.readData("select * from tb_district");
                                String nam="",id="";
                                while(obj1.rs.next()){
                                    
                            
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(obj1.rs.getString("district_id"));
      out.write('"');
      out.write('>');
      out.print(obj1.rs.getString("district_name"));
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Place</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"place\">\n");
      out.write("                            <option value=\"0\">----------select----------</option>\n");
      out.write("                            ");

                                obj1.readData("select * from tb_place");
                                
                                while(obj1.rs.next()){
                                    
                            
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(obj1.rs.getString("place_id"));
      out.write('"');
      out.write('>');
      out.print(obj1.rs.getString("place_name"));
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>    \n");
      out.write("                    </td>     \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Photo</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"file\" name=\"photo\" required=\"required\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Aadhar number</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"number\" name=\"aadhar\" required=\"required\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"btnsubmit\" value=\"Register\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("<hr>\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("        <div class=\"section\">\n");
      out.write("\t        <div class=\"container\">\n");
      out.write("\t        \t<div class=\"row\">\n");
      out.write("\t        \t\t<!-- Featured News -->\n");
      out.write("\t        \t\t");
      out.write("\n");
      out.write("\t        \t\t<!-- End Featured News -->\n");
      out.write("\t        \t\t<!-- Latest News -->\n");
      out.write("\t        \t\t");
      out.write("\n");
      out.write("\t        \t\t<!-- End Featured News -->\n");
      out.write("\t        \t</div>\n");
      out.write("\t        </div>\n");
      out.write("\t    </div>\n");
      out.write("\n");
      out.write("\t\t\n");
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
      out.write("\t        \t\t\t\t<b>Address:</b>Viswajyothi College of Engineering and Technology, Vazhakulam<br/>\n");
      out.write("\t        \t\t\t\t<b>Phone:</b> +91 8301092521<br/>\n");
      out.write("                                                <b>Email:</b> <a href=\"mailto:smarttrolley99@gmail\">smarttrolley99@gmail.com</a>\n");
      out.write("\t        \t\t\t</p>\n");
      out.write("\t\t    \t\t</div>\t\t\t\t\n");
      out.write("\t\t    \t\t\n");
      out.write("\t\t    \t\t\n");
      out.write("\t\t    \t\t<div class=\"col-footer col-md-4 col-xs-6\">\n");
      out.write("\t\t    \t\t\t<h3>About Our Product</h3>\n");
      out.write("\t\t    \t\t\t\t<p>The main of aim of growing technology is to make life easier. Nowadays shopping mall is a place where people get their daily necessities. ... So to avoid headache like waiting in billing queue we are introducing new concept that is “SMART TROLLEY WITH INSTANT BILLING”.</p>\n");
      out.write("\t\t    \t\t</div>\n");
      out.write("\n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t    \t\t<div class=\"col-md-12\">\n");
      out.write("\t\t    \t\t\t<div class=\"footer-copyright\">&copy; 2019 <a href=\"http://www.vactualart.com/portfolio-item/basica-a-free-html5-template/\">Basica</a> Bootstrap HTML Template. By <a href=\"http://www.vactualart.com\">HACS Art</a>.</div>\n");
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
      out.write("\t\t<script src=\"js/scrolling-nav.js\"></script>\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
