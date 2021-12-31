/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myserv;

import DB.ConnectionClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Lenovo
 */
@WebService(serviceName = "myservice")
public class myservice {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "uname") String uname,@WebParam(name = "pwd") String pwd){
        String uid="";
        ConnectionClass obj=new ConnectionClass();
        obj.readData("select * from tb_register where username='"+uname+"' and password='"+pwd+"'");
        try{
            if(obj.rs.next())
            {
                uid=obj.rs.getString("id");
            }
            else
            {
                uid="false";
            }
        }
        catch(SQLException sql){}
       
        return uid;
    }
    @WebMethod(operationName = "signup")
    public String signup(@WebParam(name = "name") String name,@WebParam(name = "uname") String uname,@WebParam(name = "pwd") String pwd,@WebParam(name = "email") String email){
        String uid="";
        ConnectionClass obj=new ConnectionClass();
        obj.execute("insert into tb_register(name,username,password,email)values('"+name+"','"+uname+"','"+pwd+"','"+email+"')");
        
        obj.readData("select max(id) id from tb_register");
        
        
        try{
            if(obj.rs.next())
            {
                uid=obj.rs.getString("id");
            }
            else
            {
                uid="false";
            }
        }
        catch(SQLException sql){}
       
        return uid;
    }
    
    @WebMethod(operationName = "getprofile")
    public String getprofile(@WebParam(name = "uid") String id){
        String uid="";
        try{
            ConnectionClass obj=new ConnectionClass();
            obj.readData("select * from tb_register r left join tb_place p on r.placeid=p.place_id  where r.id="+id);
            if(obj.rs.next())
            {
                JSONObject jobj=new JSONObject();
                jobj.put("name", obj.rs.getString("name"));
                jobj.put("address", obj.rs.getString("address"));
                jobj.put("email", obj.rs.getString("email"));
                jobj.put("contactno", obj.rs.getString("contactno"));
                jobj.put("gender", obj.rs.getString("gender"));
               // jobj.put("username", obj.rs.getString("username"));
               // jobj.put("password", obj.rs.getString("password"));
                jobj.put("placeid", obj.rs.getString("placeid"));
                jobj.put("placename", obj.rs.getString("place_name"));
                 jobj.put("photo", obj.rs.getString("photo"));
               // jobj.put("status", obj.rs.getString("status"));
               // jobj.put("aadharno", obj.rs.getString("aadharno"));
                System.out.println(jobj.toString());
                return jobj.toString();
            }
        }catch(Exception ex){}
        return "fail";

        //return "test";
    }
    
    @WebMethod(operationName = "editprofile")
    public String editprofile(@WebParam(name = "id") String id,@WebParam(name = "name") String name,@WebParam(name = "address") String address,@WebParam(name = "email") String email,@WebParam(name = "contactno") String contactno,@WebParam(name = "gender") String gender,@WebParam(name = "place") String place){
        String uid="";
        
        ConnectionClass obj=new ConnectionClass();
        obj.execute("update tb_register set name='"+name+"',address='"+address+"',email='"+email+"',contactno="+contactno+",gender='"+gender+"',placeid='"+place+"' where id="+id+"");
        obj.readData("select max(id) id from tb_register");
        
        
        try{
            if(obj.rs.next())
            {
                uid=obj.rs.getString("id");
            }
            else
            {
                uid="false";
            }
        }
        catch(SQLException sql){}
       
        return uid;
    }
    
    @WebMethod(operationName = "changepassword")
    public String changepassword(@WebParam(name = "id") String id,@WebParam(name = "pwd") String pwd){
        String uid="";
        boolean b=false;
        try {
            
            ConnectionClass obj=new ConnectionClass();
            obj.readData("select * from tb_register where id="+id+" and password='"+pwd+"'");
            if(obj.rs.next())
            {
                uid=obj.rs.getString("id");
                b=obj.execute("update tb_register set password='"+pwd+"' where id="+id+"");
            }
            else{
                b=false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(myservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b+"";
       
    }
    
     @WebMethod(operationName = "cartlist")
     public String cartlist(@WebParam(name = "userid") String userid ){
        String uid="";
        
            ConnectionClass obj=new ConnectionClass();
            obj.readData("select * from tb_mycart m inner join tb_cartitem c on c.cart_id=m.cart_id inner join tb_product p on p.product_id=c.product_id inner join tb_brand b on b.brand_id=p.brand_id where m.user_id="+userid);
            System.out.println("select * from tb_mycart m inner join tb_cartitem c on c.cart_id=m.cart_id inner join tb_product p on p.product_id=c.product_id inner join tb_brand b on b.brand_id=p.brand_id where m.user_id="+userid);
            JSONArray jarr=new JSONArray();
        try {
            while(obj.rs.next())
            {
                 try {
             JSONObject jobj=new JSONObject();
               
                jobj.put("productimg", obj.rs.getString("product_photo"));
                jobj.put("productname", obj.rs.getString("product_name"));
                jobj.put("brand", obj.rs.getString("brand_name"));
                jobj.put("price", obj.rs.getString("price"));
                jarr.put(jobj);
                System.out.println(jobj.toString());
                } catch (JSONException ex) {
                    Logger.getLogger(myservice.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(myservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return jarr.toString();
       
       
      
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertfeedback")
    public String insertfeedback(@WebParam(name = "feedback") String feedback, @WebParam(name = "userid") String userid) {
        ConnectionClass obj=new ConnectionClass();
        obj.execute("insert into tbl_feedback(feedback_content,feedback_date,user_id)values('"+feedback+"',curdate(),'"+userid+"')");
        return "success";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "productlist")
    public String productlist(@WebParam(name = "productname") String productname) {
        ConnectionClass obj=new ConnectionClass(); 
        if(productname.equals("0")||productname.length()==0)
        {
            obj.readData("select * from tb_product p inner join tb_rack r on p.rack_id=r.rack_id inner join tb_block b on  b.block_id=r.block_id inner join tb_brand brd on brd.brand_id=p.brand_id");
        }
        else
        {
            obj.readData("select * from tb_product p inner join tb_rack r on p.rack_id=r.rack_id inner join tb_block b on  b.block_id=r.block_id inner join tb_brand brd on brd.brand_id=p.brand_id where p.product_name like '%"+ productname +"%' or brand_name like'%"+productname+"%'");
        }
        JSONArray j=new JSONArray();
    
        try {
            while(obj.rs.next())
            {
                  JSONObject jo=new JSONObject();
                   
                try {
                jo.put("productimg", obj.rs.getString("product_photo"));
                jo.put("productname", obj.rs.getString("product_name"));
                jo.put("brand", obj.rs.getString("brand_name"));
                jo.put("price", obj.rs.getString("price"));
                jo.put("block", obj.rs.getString("block_name"));
                jo.put("rack", obj.rs.getString("rack_no"));
                j.put(jo);
                    
                } catch (JSONException ex) {
                    Logger.getLogger(myservice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(myservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(j.toString());
          return j.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertbudget")
    public String insertbudget(@WebParam(name = "userid") String userid, @WebParam(name = "trollyid") String trollyid, @WebParam(name = "budget") String budget) {
       ConnectionClass obj=new ConnectionClass();
       
       String sel="select * from tb_mycart where user_id='"+userid+"' and date=curdate()";
       ResultSet rs=obj.readData(sel);
        try {
            if(rs.next())
            {
                
            }
            else{
                obj.execute("insert into tb_mycart(user_id,trolley_id,date,budget)values('"+userid+"','"+trollyid+"',curdate(),'"+budget+"')");
               
            }} catch (SQLException ex) {
            Logger.getLogger(myservice.class.getName()).log(Level.SEVERE, null, ex);
        }
         return "success";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "carttotal")
    public String carttotal(@WebParam(name = "userid") String userid) {
       String t="";
        JSONArray jarr=null;
        ConnectionClass obj=new ConnectionClass();
       String sel="select * from tb_mycart where user_id='"+userid+"' and date=curdate()";
       ResultSet rs=obj.readData(sel);
        try {
            if(rs.next()){
                t=rs.getString("total_amount");
                jarr=new JSONArray();
                JSONObject jobj=new JSONObject();
                try {
                    jobj.put("amount", t);
                     jobj.put("cartid", rs.getString("cart_id"));
                     jarr.put(jobj);
                System.out.println(jobj.toString());
                } catch (JSONException ex) {
                    Logger.getLogger(myservice.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }} catch (SQLException ex) {
            Logger.getLogger(myservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jarr.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cartpayment")
    public String cartpayment(@WebParam(name = "cartid") String cartid) {
       String s="";
           ConnectionClass obj=new ConnectionClass();
       String upqry="update tb_mycart set payment_status='1' where cart_id='"+cartid+"'";
        boolean b=obj.execute(upqry) ;
       
        return "Success";
        }
    @WebMethod(operationName = "clearcart")
    public String clearcart(@WebParam(name = "uid") String uid) {
        String id="";
        ConnectionClass obj=new ConnectionClass();
        obj.execute("delete from tb_mycart where user_id='"+uid+"'");
        return id="true";
        
    }
}
