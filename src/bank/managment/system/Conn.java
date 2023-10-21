package bank.managment.system;
import java.sql.*;
public class Conn 
{
    //1st create connnection
	 Connection c;
	    Statement s;
	    public Conn(){  
	        try{  
	            Class.forName("com.mysql.cj.jdbc.Driver");  
	            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Dnyanu@123");    
	            s =c.createStatement(); 
	           
	          
	            
	        }catch(Exception e){ 
	            System.out.println(e);
	        }  
	    }  
}
