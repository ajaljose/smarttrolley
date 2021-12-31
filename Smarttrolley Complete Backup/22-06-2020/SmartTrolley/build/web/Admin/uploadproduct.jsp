<%-- 
    Document   : uploadaction.jsp
    Created on : 8 Sep, 2016, 10:29:12 AM
    Author     : ANOOP
--%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<%@page import="org.apache.commons.fileupload.*" %>
<%@page import="org.apache.commons.fileupload.servlet.*" %>
<%@page import="org.apache.commons.fileupload.disk.*" %>
<jsp:useBean class="DB.ConnectionClass" id="obj"></jsp:useBean>
<%--<jsp:useBean class="Email.mail" id="obj1"></jsp:useBean>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctor</title>
    </head>
    <body>
        <%
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
        
       
      %> 
       <script type="text/javascript">
            alert("Inserted Successfully..");
          setTimeout(function(){window.location.href='product.jsp'},100);
        </script>
    <%
            }
%>
    </body>
</html>
