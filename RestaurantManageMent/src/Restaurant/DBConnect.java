package Restaurant;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class DBConnect{
    public static Connection conn=null;//for connection 
    Statement st=null; //for creating statement
    ResultSet rs = null;// for saving retrived result
    String s;
    DBConnect(){};
    public static Connection connect(){
        try{
           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return conn;
    }
    public void updateQuery(String sql){//for update insert or delete
        conn=DBConnect.connect(); 
        try{
            st=conn.createStatement();
            int one=st.executeUpdate(sql);
        }  
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public ResultSet resultQuery(String sql){//to retrive result    
        conn=DBConnect.connect(); 
        try{
            st=conn.createStatement();
            rs=st.executeQuery(sql);
        }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rs;
    }
}