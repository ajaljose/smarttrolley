package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stock_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin/index.html");
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

      out.write('s');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      DB.ConnectionClass obj = null;
      synchronized (_jspx_page_context) {
        obj = (DB.ConnectionClass) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>smart trolley</title>\n");
      out.write("         ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("      <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>Solar</title>\r\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- FONTAWESOME STYLES-->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- MORRIS CHART STYLES-->\r\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- CUSTOM STYLES-->\r\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- GOOGLE FONTS-->\r\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("       <link href=\"form.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Admin</a> \r\n");
      out.write("            </div>\r\n");
      out.write("  <div style=\"color: white;\r\n");
      out.write("padding: 15px 50px 5px 50px;\r\n");
      out.write("float: right;\r\n");
      out.write("font-size: 16px;\">  <a href=\"../Guest/login.jsp\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\r\n");
      out.write("        </nav>   \r\n");
      out.write("           <!-- /. NAV TOP  -->\r\n");
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("            <div class=\"sidebar-collapse\">\r\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("\t\t\t\t<li class=\"text-center\">\r\n");
      out.write("                   <img src=\"assets/img/find_user.png\" class=\"user-image img-responsive\"/>\r\n");
      out.write("                  \r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"active-menu\"  href=\"index.html\"><i class=\"fa fa-dashboard fa-3x\"></i> Dashboard</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-sitemap fa-3x\"></i>Location Details<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"district.jsp\">Add District</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                           \r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"place.jsp\">Add Place</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                     \r\n");
      out.write("                    \r\n");
      out.write("                   \t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-sitemap fa-3x\"></i>Add Details<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"category.jsp\">Category</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"subcategory.jsp\">Subcategory</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                             <li>\r\n");
      out.write("                                 <a href=\"brand.jsp\">Brand</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"block.jsp\">Block</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"rack.jsp\">Rack</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      \r\n");
      out.write("                                       \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-sitemap fa-3x\"></i>Product Details<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"product.jsp\">Product</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"productlist.jsp\">Product Tag</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"stock.jsp\">Stock</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                          \r\n");
      out.write("                        </ul>\r\n");
      out.write("                        \r\n");
      out.write("                      </li> \r\n");
      out.write("                        \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-sitemap fa-3x\"></i>Settings<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"Changepassword.jsp\">Changepassword</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                             <li>\r\n");
      out.write("                                 <a href=\"ViewFeedback.jsp\">View Feedback</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"../Guest/login.jsp\">Logout</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                             \r\n");
      out.write("                          \r\n");
      out.write("                        </ul>\r\n");
      out.write("                        \r\n");
      out.write("                      </li> \r\n");
      out.write("                </ul>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </nav>  \r\n");
      out.write("        <!-- /. NAV SIDE  -->\r\n");
      out.write("        <div id=\"page-wrapper\" >\r\n");
      out.write("            <div id=\"page-inner\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                     <h2>Admin Dashboard</h2>   \r\n");
      out.write("                        <h5>Welcome Admin </h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>              \r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("                  <hr />\r\n");
      out.write("                \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                 <!-- /. ROW  -->           \r\n");
      out.write("    \r\n");
      out.write("     <!-- /. WRAPPER  -->\r\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\r\n");
      out.write("    <!-- JQUERY SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- METISMENU SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("     <!-- MORRIS CHART SCRIPTS -->\r\n");
      out.write("     <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/morris/morris.js\"></script>\r\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            ");

        if(request.getParameter("btnsubmit")!=null){
            
           // String sd=request.getParameter("txtname"); 
           // String st=request.getParameter("txtname2");
            String product=request.getParameter("product");
            String sp=request.getParameter("txtname3");
            String sed=request.getParameter("txtname4");
            String smd=request.getParameter("txtname5");
            String sb=request.getParameter("txtname6");
            String sc=request.getParameter("txtname7");
            
            boolean b=false;
            out.print("hello");
            if(request.getParameter("edid")!=null){
                b=obj.execute("update tb_stock set stock_date=curdate(),stock_time=cuttime(),product_id="+product+",stock_expirydate='"+sed+"',stock_manufacturedate='"+smd+"',stock_count='"+sc+"'where stock_id="+request.getParameter("edid"));
            }
            else{
                b=obj.execute("insert into tb_stock(stock_date,stock_time,product_id,stock_expirydate,stock_manufacturedate,stock_count)values(curdate(),curtime(),"+product+",'"+sed+"','"+smd+"',"+sc+")");
            }
            response.sendRedirect("stock.jsp");
        }
        if(request.getParameter("did")!=null){
            String did=request.getParameter("did");
            obj.execute("delete from tb_stock where stock_id="+did);
        }
        String edid="",est="",eproduct="",esp="",esed="",esmd="",esb="",esc="",esd="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            esd=request.getParameter("sd");
           est=request.getParameter("st"); 
           esp=request.getParameter("sp");
           esed=request.getParameter("sed");
           esmd=request.getParameter("smd");
           esb=request.getParameter("sb");
           esc=request.getParameter("sc");
           eproduct=request.getParameter("pdt");
        }
        
        
      out.write("  \n");
      out.write("    <center>\n");
      out.write("   \n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                 \n");
      out.write("                 <tr>\n");
      out.write("                    <td>product id</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"product\">\n");
      out.write("                            <option value=\"0\">--------select-------</option>\n");
      out.write("                           ");
 obj.readData("select * from tb_product");
                            while(obj.rs.next()){
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(obj.rs.getString("product_id"));
      out.write('"');
      out.write(' ');
 if(eproduct.equals(obj.rs.getString("product_name"))){ 
      out.write(" selected=\"selected\"m ");
}
      out.write(' ');
      out.write('>');
      out.print(obj.rs.getString("product_name"));
      out.write(" </option>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write(" \n");
      out.write("                <tr>\n");
      out.write("                    <td>stock_expirydate</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"date\" name=\"txtname4\" required=\"required\" value=\"");
      out.print(esed);
      out.write("\"/></td>                   \n");
      out.write("                </tr>   \n");
      out.write("                 <tr>\n");
      out.write("                    <td>stock_manufacturingdate</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"date\" name=\"txtname5\" required=\"required\" value=\"");
      out.print(esmd);
      out.write("\"/></td>                   \n");
      out.write("                </tr>   \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>stock_count</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtname7\" required=\"required\" value=\"");
      out.print(esc);
      out.write("\"/></td>                   \n");
      out.write("                </tr>   \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"btnsubmit\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td  colspan=\"9\">\n");
      out.write("                        <table border=\"1\" cellspacing=\"0\" cellpadding=\"3\" width=\"300\" id=\"tab\">\n");
      out.write("                            <tr>\n");
      out.write("                                 <th>stock_id</th>\n");
      out.write("                                <th>stock_date</th>\n");
      out.write("                                <th>stock_time</th>\n");
      out.write("                                <th>product_id</th>\n");
      out.write("                                <th>stock_expirydate</th>\n");
      out.write("                                <th>stock_manufacturedate</th>\n");
      out.write("                                <th>stock_count</th>\n");
      out.write("                                <th colspan=\"2\">Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            obj.readData("select * from tb_stock s,tb_product p where s.product_id=p.product_id");
                            String id="",product_id="",stock_price="",stock_date="",stock_time="",stock_expirydate="",stock_manufacturedate="",stock_batch="",stock_count="";
  
                            while(obj.rs.next()){
                                id=obj.rs.getString("stock_id");
                                stock_date=obj.rs.getString("stock_date");
                                stock_time=obj.rs.getString("stock_time");
                                product_id=obj.rs.getString("product_id");
                               // stock_price=obj.rs.getString("stock_price");
                                stock_expirydate=obj.rs.getString("stock_expirydate");
                                stock_manufacturedate=obj.rs.getString("stock_manufacturedate");
                                //stock_batch=obj.rs.getString("stock_batchno");
                                stock_count=obj.rs.getString("stock_count");
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(stock_date );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(stock_time );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(product_id);
      out.write("</td>\n");
      out.write("                             \n");
      out.write("                                <td>");
      out.print(stock_expirydate );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(stock_manufacturedate);
      out.write("</td>\n");
      out.write("                              \n");
      out.write("                                <td>");
      out.print(stock_count );
      out.write("</td>\n");
      out.write("                                <td><a href=\"stock.jsp?edid=");
      out.print(id);
      out.write("&sd=");
      out.print(stock_date);
      out.write("&st=");
      out.print(stock_time);
      out.write("&pdt=");
      out.print(product_id);
      out.write("&sed=");
      out.print(stock_expirydate);
      out.write("&smd=");
      out.print(stock_manufacturedate);
      out.write("&sc=");
      out.print(stock_count);
      out.write("\">Edit</a></td>\n");
      out.write("                                <td><a href=\"stock.jsp?did=");
      out.print(id);
      out.write("\">Delete</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            }
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
