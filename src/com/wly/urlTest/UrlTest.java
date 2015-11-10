package com.wly.urlTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlTest {
	public static void main(String[] args) {
		try {
//			for(;true; ){
				String a = UrlTest.getURLByPost();
				System.out.println(a);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getURLByPost()throws Exception{
	       URL url=new URL("http://bj.jumei.com/");  
	       HttpURLConnection conn = (HttpURLConnection) url.openConnection();  
	       conn.setRequestMethod("POST");
	       conn.setDoOutput(true);
	       conn.setDoInput(true);
	       PrintWriter printWriter = new PrintWriter(conn.getOutputStream());
	       printWriter.flush();
	       BufferedReader in = null;
	       StringBuilder sb = new StringBuilder();
	       try{     
	           in = new BufferedReader( new InputStreamReader(conn.getInputStream(),"UTF-8"));   
	           String str = null;    
	           while((str = in.readLine()) != null) {    
	               sb.append( str );     
	           }     
	        } catch (Exception ex) {   
	           throw ex;   
	        } finally{    
	         try{   
	             conn.disconnect();  
	             if(in!=null){  
	                 in.close();  
	             }  
	             if(printWriter!=null){  
	                 printWriter.close();  
	             }  
	         }catch(IOException ex) {
	             throw ex;   
	         }     
	        }     
	        return sb.toString();   
	   }  
}
