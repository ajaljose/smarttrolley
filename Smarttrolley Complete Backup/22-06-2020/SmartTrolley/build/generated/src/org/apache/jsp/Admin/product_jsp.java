package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"productcss.css\">\n");
      out.write("        ");
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
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <h1 align=\"center\">ADD PRODUCT DETAILS</h1>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(request.getParameter("btnsubmit")!=null){
            
            String name=request.getParameter("txtname");
            String sii= request.getParameter("subcategory");
            String bii=request.getParameter("brand");
            String pph=request.getParameter("photo");
            boolean b=false;
            if(request.getParameter("edid")!=null){
                b=obj.execute("update tb_product set product_name='"+name+"' where product_id="+request.getParameter("edid"));
            }
            else{
                b=obj.execute("insert into tb_product(product_name,subcategory_id,brand_id,product_photo)values('"+name+"',"+sii+","+bii+",'"+pph+"')");
            }
            response.sendRedirect("product.jsp");
        }
        if(request.getParameter("did")!=null){
            String did=request.getParameter("did");
            obj.execute("delete from tb_product where product_id="+did);
        }
        String edid="",epname="",ebid="",esid="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            epname=request.getParameter("epna");
            ebid=request.getParameter("ebna");
            esid=request.getParameter("esna");
         } 
        
      out.write("\n");
      out.write("        <form method=\"post\" enctype=\"multipart/form-data\" action=\"uploadproduct.jsp\">\n");
      out.write("            <table  align=\"center\" width=\"300\">\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <div id=\"mtab\">\n");
      out.write("                    <td>\n");
      out.write("                        <div id=\"mtab\">Product Name </div></td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtname\" value=\"");
      out.print(epname);
      out.write("\" required=\"required\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Subcategory</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"subcategory\" required=\"required\">\n");
      out.write("                            <option value=\"\">------------Select-----------</option>\n");
      out.write("                            ");
 
                                obj.readData("select * from tb_subcategory");
                               while(obj.rs.next()){ 
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(obj.rs.getString("subcategory_id"));
      out.write("\"  ");
 if(esid.equals(obj.rs.getString("subcategory_id"))){ 
      out.write(" selected=\"selected\" ");
}
      out.write(' ');
      out.write('>');
      out.print(obj.rs.getString("subcategory_name"));
      out.write("</option>\n");
      out.write("                            ");

                               }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Brand</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"brand\" required=\"required\">\n");
      out.write("                            <option value=\"\">------------Select-----------</option>\n");
      out.write("                            ");

                                 obj.readData("select * from tb_brand");
                                while(obj.rs.next()){
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(obj.rs.getString("brand_id"));
      out.write('"');
      out.write(' ');
 if(ebid.equals(obj.rs.getString("brand_id"))){ 
      out.write(" selected=\"selected\" ");
}
      out.write(' ');
      out.write('>');
      out.print(obj.rs.getString("brand_name"));
      out.write("</option>\n");
      out.write("                            ");

                              }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Product Image</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"file\" name=\"photo\" id=\"photo\" required=\"required\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"btnsubmit\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                            \n");
      out.write("                <tr>\n");
      out.write("                    <td  colspan=\"4\">\n");
      out.write("                        <table align=\"center\" class=\"content-table\"  cellspacing=\"0\" cellpadding=\"4\" >\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Product Image</th>\n");
      out.write("                                <th>Product Name</th>\n");
      out.write("                                <th>SubCategory</th>\n");
      out.write("                                <th>Brand</th>\n");
      out.write("                                <th colspan=\"2\">Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            obj.readData("select * from tb_product p,tb_subcategory s,tb_brand b where p.subcategory_id=s.subcategory_id and p.brand_id=b.brand_id");
                            String pnam="",pid="",sid="",snam="",bnam="",bid="";
                               
                            while(obj.rs.next()){ 
                                pid=obj.rs.getString("product_id");
                                pnam=obj.rs.getString("product_name");
                                sid=obj.rs.getString("subcategory_id");
                                snam=obj.rs.getString("subcategory_name");
                                bnam=obj.rs.getString("brand_name");
                                bid=obj.rs.getString("brand_id");
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><img src=\"../ProImg/");
      out.print(obj.rs.getString("product_photo"));
      out.write("\" width=\"130\"/></td>\n");
      out.write("                                <td>");
      out.print(pnam);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(snam);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(bnam);
      out.write("</td>\n");
      out.write("                                <td align=\"center\"><a href=\"product.jsp?edid=");
      out.print(pid);
      out.write("&epna=");
      out.print(pnam);
      out.write("&esna=");
      out.print(sid);
      out.write("&ebna=");
      out.print(bid);
      out.write("\"><img src=\"notebook.png\" style=\"width: 14px;height: 14px\" title=\"Edit\" alt=\"Edit\"></a></td>\n");
      out.write("                                <td align=\"center\"><a href=\"product.jsp?did=");
      out.print(pid);
      out.write("\"><img src=\"Recycle Bin.png\" style=\"width: 14px;height: 14px\" title=\"Delete\" alt=\"Remove\"></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            }
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        </td>\n");
      out.write("                </tr>\n");
      out.write("                    </table>\n");
      out.write("                        <input type=\"hidden\" name=\"hdproductid\" id=\"hdproductid\" value=\"");
      out.print(edid);
      out.write("\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
