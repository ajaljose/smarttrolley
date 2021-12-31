package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.disk.*;

public final class uploadproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      DB.ConnectionClass obj = null;
      synchronized (_jspx_page_context) {
        obj = (DB.ConnectionClass) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Doctor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String c="";
            String field_name="";
            FileItem f_item=null;
        String file_name="";
        int idd1=6;
        int id=7;
        File savedFile=null;
        String fn="",pf="";
        String field[] = new String[20];
        String value[]=new String[20];

        //checking if request cotains multipart data
        boolean isMultipart=ServletFileUpload.isMultipartContent(request);

        if(isMultipart)
        {


            FileItemFactory factory=new DiskFileItemFactory();
            ServletFileUpload upload=new ServletFileUpload(factory);

            //declaring a list of form fields
            List items_list=null;

            //assigning fields to list 'items_list'
            try
            {
            items_list=upload.parseRequest(request);
            }
            catch(FileUploadException ex)
            {
                out.println(ex);
            }

                  //declaring iterator
           Iterator itr=items_list.iterator();
            int k=0;
            //iterating through the list 'items_list'
            while(itr.hasNext())
            {

                //typecasting next element in items_list as fileitem
                f_item=(FileItem)itr.next();

                //checking if 'f_item' contains a formfield(common controls like textbox,dropdown,radio buttonetc)
               if(f_item.isFormField())
                {

                    //getting fieldname and value
                    field[k]=f_item.getFieldName();
                    value[k]=f_item.getString();
                    k++;
                }
               else
               {
                    //f_item=(FileItem)itr.next();

                   file_name=f_item.getName();
                   field_name=f_item.getFieldName();
                   if(file_name!="")
                   {
                        if(field_name.equals("photo"))
                        {
                             String ext=file_name.substring(file_name.lastIndexOf("."));
                              //setting path to store image
                              File proj_path=new File(config.getServletContext().getRealPath("/"));
                              String file_path=proj_path.getParentFile().getParentFile().getPath()+"\\web\\ProImg\\";
                              Random r=new Random();
                               int r_num=r.nextInt(1111)+999;

                              fn="Pro_"+r_num+ext;
                              //creating a file object
                              savedFile=new File(file_path+fn);
                              try
                              {
                                  //writing the file object
                                  f_item.write(savedFile);               

                              }
                              catch(Exception ex)
                              {
                                  out.println(ex);
                              }
                         }

                   }

               }
           
            }
        }
     
        boolean status=false;
        String ins="";
        if(!value[7].equals("")){
          // out.print("update tb_product set product_name='"+value[0]+"',subcategory_id="+value[1]+",brand="+value[2]+" where product_id="+value[4]);
                status=obj.execute("update tb_product set product_name='"+value[0]+"',subcategory_id="+value[1]+",brand_id="+value[2]+",product_photo='"+fn+"',rack_id='"+value[4]+"',price='"+value[5]+"' where product_id="+value[7]);
        System.out.println("update tb_product set product_name='"+value[0]+"',subcategory_id="+value[1]+",brand_id="+value[2]+",product_photo='"+fn+"',rack_id='"+value[4]+"',price='"+value[5]+"' where product_id='"+value[7]+"'");
        }
            else{
                ins="insert into tb_product(product_name,subcategory_id,brand_id,product_photo,rack_id,price)values('"+value[0]+"',"+value[1]+","+value[2]+",'"+fn+"','"+value[4]+"','"+value[5]+"')";   
               //out.print("pppppppp"+ins);
                System.out.println(ins);
                status=obj.execute(ins);
            }
  

        
    if(status==true){
        
       
      
      out.write(" \n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("            alert(\"Inserted Successfully..\");\n");
      out.write("          setTimeout(function(){window.location.href='product.jsp'},100);\n");
      out.write("        </script>\n");
      out.write("    ");

            }

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
