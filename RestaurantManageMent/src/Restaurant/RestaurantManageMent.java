package Restaurant;

import java.sql.Connection;
import java.sql.Statement;

public class RestaurantManageMent {
    public RestaurantManageMent(){}//empty constructor 
    public static Connection conn=DBConnect.connect(); 
    String query=null;
    Statement st=null;
    public static void main(String[] args) {        
        new Login().setVisible(true);
    }
    
}
