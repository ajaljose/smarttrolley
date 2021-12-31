/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import java.util.Random;

/**
 *
 * @author user
 */
public class OTPGenerator 
{ 
    public String OTP(int len) 
    { 
        System.out.println("Generating OTP using random() : "); 
        System.out.print("You OTP is : "); 
  
        // Using numeric values 
        String numbers = "0123456789"; 
  
        // Using random method 
        Random rndm_method = new Random(); 
  
        String otp = ""; 
  
        for (int i = 0; i < len; i++) 
        { 
           
            otp= otp+
             numbers.charAt(rndm_method.nextInt(numbers.length())); 
        } 
        System.out.println(otp+"");
        return otp+""; 
    } 
    
    
//    public static void main(String[] args) {
//        OTPGenerator nn=new OTPGenerator();
//        nn.OTP(4);
//    }
  
} 