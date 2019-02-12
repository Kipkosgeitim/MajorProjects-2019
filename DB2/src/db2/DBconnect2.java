
package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBconnect2 {
    public class DBConnect {
   private Connection con;
   private Statement st;
   private ResultSet rs;

   
   public DBConnect() {
      try{
           Class.forName("com.mysql.cj.jdbc.Driver");
          st = con.createStatement();
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tester","root","");
       }catch(Exception ex){
           System.out.println(ex);  
       }
}
   
   
  
   public void getData(){
      
               
       try{
           String query="select *from persons";
           rs=st.executeQuery(query);
           System.out.println("records from database");
           while(rs.next()){
               String name= rs.getString("name");
               String age=rs.getString("age");
               System.out.println("name:"+name+"age:"+age);
               
           }
       }catch(Exception ex){
           System.out.println(ex);
       }
   }
    }

    
}
