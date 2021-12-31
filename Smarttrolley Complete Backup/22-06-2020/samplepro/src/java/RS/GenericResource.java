/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RS;

import DB.ConnectionClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Lenovo
 */
@Path("generic")
public class GenericResource {
    
    ConnectionClass con=new ConnectionClass();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of RS.GenericResource
     * @return an instance of java.lang.String
     */
    @POST
    @Produces("application/json")
    public String getJson(@FormParam("rfidNo") String rfno,@FormParam("device_id") String div) {
        String cid="",pid="",pname="",total="",price="",p="";
        int c=0;
        String sel="select max(cart_id) as cartid from tb_mycart where trolley_id='"+div+"' and date=curdate()";
        System.out.println(sel);
        ResultSet rs=con.readData(sel);
        try {
            if(rs.next())
            {
                cid=rs.getString("cartid");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenericResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sel1="select * from tb_producttag pt inner join tb_product p on p.product_id=pt.product_id where pt.producttag_tagid='"+rfno+"'";
        ResultSet rs1=con.readData(sel1);
              System.out.println(sel1);
        try {
            if(rs1.next()){
                
                pid=rs1.getString("product_id");
                pname=rs1.getString("product_name");
                price=rs1.getString("price");
                
                 String sel3="select * from tb_cartitem where product_id='"+pid+"' and cart_id='"+cid+"'";
        ResultSet rs3=con.readData(sel3);
              System.out.println(sel3);
        try {
            if(rs3.next())
            {
                String up="update tb_cartitem set cart_count='2' where cart_id='"+cid+"' and product_id='"+pid+"'" ;
                con.execute(up);
                      System.out.println(up);
            }
            else{
                String ins="insert into tb_cartitem(cart_id,product_id,price,cart_count) values('"+cid+"','"+pid+"','"+price+"','1')";
                con.execute(ins);
                System.out.println(ins);
                
                
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GenericResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
              String sel4="select * from tb_cartitem where product_id='"+pid+"' and cart_id='"+cid+"'";
        ResultSet rs4=con.readData(sel4);
              System.out.println(sel4);
        try {
            if(rs4.next())
            {
                c=rs4.getInt("cart_count");
                if(c==2)
                {
                    String del="delete from tb_cartitem where cart_id='"+cid+"' and product_id='"+pid+"'";
                    con.execute(del);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenericResource.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            
                String sel2="select sum(price) as p from tb_cartitem where cart_id='"+cid+"'";
                ResultSet rs2=con.readData(sel2);
                System.out.println(sel2);
                if(rs2.next())
                {
                    total=rs2.getString("p");
                    System.out.println("total:"+total);
                    
                }
                
                String upqry="update tb_mycart set total_amount='"+total+"' where cart_id='"+cid+"'";
                con.execute(upqry);
                System.out.println(upqry);
                
                
                  return "{'name':"+ "'" + pname+ "'" +",'price':"+ "'"+price +"'"+ ","+"'total':"+"'"+total+"'"+"}";
                
               
               
            }
            //throw new UnsupportedOperationException();
        } catch (SQLException ex) {
            Logger.getLogger(GenericResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        return "{'success':'success'";
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
