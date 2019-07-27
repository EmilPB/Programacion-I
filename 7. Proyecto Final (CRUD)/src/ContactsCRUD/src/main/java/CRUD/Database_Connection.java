package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Database_Connection {
    
    Connection Connect;
    Statement Statement;
    ResultSet Results;
    
    public void ExecuteQuery(String Query) { 
        try {
            
            Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prog_contacts_data", "root", "");
            Statement = Connect.createStatement();
            Statement.executeUpdate(Query);
            
           } catch(SQLException Ex) { Ex.printStackTrace(); } 
    }
    
    public void LoadData(JTable Table, JLabel Label) {
           DefaultTableModel Model = (DefaultTableModel) Table.getModel();
           
            try {
                Model.setRowCount(0);
                Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prog_contacts_data", "root", "");
                Statement = Connect.createStatement();
                ResultSet Result = Statement.executeQuery("Select * From contacts_data;");
                while(Result.next()){
                    String ID = Result.getString("ID");
                    String Name = Result.getString("Nombre");                
                    String LName = Result.getString("Apellido");
                    String Emp = Result.getString("Empresa");
                    String Pos = Result.getString("Posicion");
                    String Tel = Result.getString("Telefono");
                    String Mail = Result.getString("Email");
                    String Notes = Result.getString("Notas");
                    
                    System.out.println("Data: "  + ID + ", " + Name + ", " + LName + ", " + Emp + ", " + Pos + ", " + Tel + ", " + Mail + ", " + Notes);
                    
                    Model.addRow(new Object[] {ID, Name, LName, Emp, Pos, Tel, Mail, Notes});
                }
            } catch(SQLException Ex) { Ex.printStackTrace(); } 
    }
}
     
                