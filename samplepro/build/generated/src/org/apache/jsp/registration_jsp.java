package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        if(request.getParameter("btnsubmit")!=null){
            
            String name=request.getParameter("txtname");
            String age=request.getParameter("txtage");
            String email=request.getParameter("txtemail");
            boolean b=false;
            if(request.getParameter("edid")!=null){
                b=obj.execute("update tb_reg set name='"+name+"',age="+age+",email='"+email+"' where id="+request.getParameter("edid"));
            }
            else{
                b=obj.execute("insert into tb_reg(name,age,email)values('"+name+"',"+age+",'"+email+"')");
            }
            response.sendRedirect("registration.jsp");
        }
        if(request.getParameter("did")!=null){
            String did=request.getParameter("did");
            obj.execute("delete from tb_reg where id="+did);
        }
        String edid="",ename="",eage="",eemail="";
        if(request.getParameter("edid")!=null){
            edid=request.getParameter("edid");
            ename=request.getParameter("na");
            eage=request.getParameter("ag");
            eemail=request.getParameter("em");
        }
        
        
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtname\" value=\"");
      out.print(ename);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>age</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtage\" value=\"");
      out.print(eage);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>email</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtemail\" value=\"");
      out.print(eemail);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"btnsubmit\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  colspan=\"2\">\n");
      out.write("                        <table border=\"1\" cellspacing=\"0\" cellpadding=\"3\" width=\"300\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Age</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th colspan=\"2\">Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            obj.readData("select * from tb_reg");
                            String nam="",ag="",em="",id="";
                            while(obj.rs.next()){
                                id=obj.rs.getString("id");
                                nam=obj.rs.getString("name");
                                ag=obj.rs.getString("age");
                                em=obj.rs.getString("email");
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(nam );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(ag );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(em );
      out.write("</td>\n");
      out.write("                                <td><a href=\"registration.jsp?edid=");
      out.print(id);
      out.write("&na=");
      out.print(nam);
      out.write("&ag=");
      out.print(ag);
      out.write("&em=");
      out.print(em);
      out.write("\">Edit</a></td>\n");
      out.write("                                <td><a href=\"registration.jsp?did=");
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
