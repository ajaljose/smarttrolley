package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            out.print("welcome jsp");
            int a=10;
            out.print(a);
        
      out.write("\n");
      out.write("         <form method=\"get\">\n");
      out.write("            <table border=\"0\" width=\"300\" cellpadding=\"7\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtname\" id=\"txtname\" value=\"");
 out.print(a); 
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"number\" name=\"txtcontact\" id=\"txtcontact\" value=\"");
      out.print(a );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>DOB</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"date\" name=\"txtdate\" id=\"txtdate\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Nation</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select>\n");
      out.write("                            <option value=\"0\">--------select--------</option>\n");
      out.write("                            <option value=\"1\">India</option>\n");
      out.write("                            <option value=\"2\">Pakisthan</option>\n");
      out.write("                            <option value=\"3\">China</option>\n");
      out.write("                            \n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <textarea id=\"txtaddress\" name=\"txtaddress\" cols=\"40\" rows=\"5\"></textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"radio\" name=\"Gender\" value=\"male\">Male\n");
      out.write("                        <input type=\"radio\" name=\"Gender\" value=\"female\">Female\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"file\" name=\"photo\" id=\"profilephoto\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>hobbies</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"hobbies\" value=\"reading\">reading</td>\n");
      out.write("                     <td><input type=\"checkbox\" name=\"hobbies\" value=\"swimming\">swimming</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Create Account\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
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
