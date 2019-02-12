
package database;

import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Database {

    public Database() {
                
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(400,300);
        jFrame.setTitle("FETCH DAT FROM DATABASE");
        JButton button;
        
        
        jFrame.setVisible(true);
    }
       
    public static void main(String[] args) throws SQLException {
        
        new Database();
    
           try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tester","root",""); 
                System.out.println("Connected to database");

                PreparedStatement preparedStatement;        
                String insertTableSQL = "INSERT INTO persons"
                                        + "(name,age) VALUES"
                                        + "(?,?)";
                preparedStatement = connection.prepareStatement(insertTableSQL);
                preparedStatement.setString (1, "Barney");
                preparedStatement.setInt (2, 5);
                preparedStatement.executeUpdate();
                //preparedStatement.close();

                System.out.println("Data has been added to database");
                
                System.out.println("Creating statement...");
                 String sql = "SELECT id, age,name FROM persons";
               //STEP 5: Extract data from result set
               try (ResultSet rs = preparedStatement.executeQuery(sql)) {
                   //STEP 5: Extract data from result set
                   while(rs.next()){
                       //Retrieve by column name
                       int id  = rs.getInt("id");
                       int age = rs.getInt("age");
                       String first = rs.getString("name");
                       
                       //Display values
                       System.out.print("ID: " + id);
                       System.out.print(", Age: " + age);
                       System.out.print(", Name: " + first);
                       System.out.println("                     ");
                   }
               }       
             }catch(SQLException e){
                System.out.println(e.getMessage());
            } 
    }
}
