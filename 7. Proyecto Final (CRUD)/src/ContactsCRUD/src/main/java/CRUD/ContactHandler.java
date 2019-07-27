package CRUD;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import com.opencsv.CSVReader;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emil
 */
public class ContactHandler {
    
    final Database_Connection Data = new Database_Connection();

    public void Launcher(JDialog Dialog) { 
        Dialog.setTitle("Nuevo Contacto");
        Dialog.setSize(875, 370);
        Dialog.setVisible(true);
        Dialog.setLocationRelativeTo(null);
    }
    
    public void AddContact(JDialog Dialog, JLabel Label, JTable Table, JTextPane path, JTextPane P0, JTextPane P1, JTextPane P2, JTextPane P3, JTextPane P4, JTextPane P5, JTextPane P6, JTextPane P7) throws IOException {
        
           String ID = P0.getText();
           String Name = P1.getText();        
           String Last = P2.getText();
           String Emp = P3.getText();
           String Pos = P4.getText();
           String Num = P5.getText();
           String Mail = P6.getText();
           String Notes = P7.getText();
           
           try {
                if(!Name.isEmpty() && !Last.isEmpty() && !Emp.isEmpty() && !Pos.isEmpty() && !Num.isEmpty() && !Mail.isEmpty() && !Notes.isEmpty()){
                    Connection  Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prog_contacts_data", "root", "");
                    PreparedStatement PS = Connect.prepareStatement("Insert Into contacts_data Values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    InputStream IS = new FileInputStream(new File(path.getText()));
                    PS.setString(1, ID);                    
                    PS.setString(2, Name);
                    PS.setString(3, Last);
                    PS.setString(4, Emp);
                    PS.setString(5, Pos);
                    PS.setString(6, Num);
                    PS.setString(7, Mail);
                    PS.setString(8, Notes);
                    PS.setBlob(9, IS);
                    
                    PS.execute();

                    JOptionPane.showMessageDialog(Dialog, "El contacto ha sido agregado exitosamente"); 
                    CleanFields(P1, P2, P3, P4, P5, P6, P7);
                    Data.LoadData(Table, Label);
                } else {
                    JOptionPane.showMessageDialog(Dialog, "No puede dejar campos vacios!"); 
                }
           } catch(SQLException Ex){JOptionPane.showMessageDialog(Dialog, Ex);}
     }
    
    public void MultiPanel(JDialog Dialog, JLabel Label, JButton Search, JButton Edit, JButton Update, JButton Delete, JTextPane Text, JTextPane P0, JTextPane P1, JTextPane P2, JTextPane P3, JTextPane P4, JTextPane P5, JTextPane P6, JTextPane P7) {
        
        Dialog.setTitle("Administrar Contactos");
        Dialog.setSize(880, 380);
        Dialog.setVisible(true);
        Dialog.setLocationRelativeTo(null);
        Dialog.setResizable(false);
        Dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        Search.addActionListener((ActionEvent e) -> {
            //String fullname = "SELECT CONCAT(Nombre, \" \", Apellido) AS Fullname FROM contacts_data";
            String Query = "Select * From contacts_data Where Nombre Like '%" 
                                + Text.getText() + "%' Or Apellido Like '%" + Text.getText() 
                                + "%' Or Empresa Like '%" + Text.getText() + "%' Or Posicion Like '%" 
                                + Text.getText() + "%' Or Telefono Like '%" + Text.getText() 
                                + "%' Or Email Like '%" + Text.getText() + "%' Or Notas Like '%" + Text.getText() + "%'";
            
                        
            try {
                    Connection  Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prog_contacts_data", "root", "");
                    Statement Statement = Connect.createStatement();
                    ResultSet Result = Statement.executeQuery(Query);
                    
                     if(Result.next()){
                         P0.setText(Result.getString("ID"));
                         P1.setText(Result.getString("Nombre"));                     
                         P2.setText(Result.getString("Apellido"));
                         P3.setText(Result.getString("Empresa"));
                         P4.setText(Result.getString("Posicion"));
                         P5.setText(Result.getString("Telefono"));
                         P6.setText(Result.getString("Email"));                    
                         P7.setText(Result.getString("Notas"));
                         
                         byte[] img = Result.getBytes("Foto");
                         ImageIcon image = new ImageIcon(img);
                         Image im = image.getImage();
                         Image myImg = im.getScaledInstance(Label.getWidth(), Label.getHeight(), Image.SCALE_SMOOTH);
                         ImageIcon newImage = new ImageIcon(myImg);
                         Label.setIcon(newImage);
                         
                                 
                     } else {
                         JOptionPane.showMessageDialog(Dialog, "No se encontraron contactos con esta/s caracteristicas.");
                     }

                     Update.addActionListener((ActionEvent E) -> {
                        try {
                            Connection  connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prog_contacts_data", "root", "");
                            Statement statement = connect.createStatement();
                            ResultSet updateResult = statement.executeQuery(Query);
                            
                            
                            while(updateResult.next()){
                                    String S0 = P0.getText();

                                    Data.ExecuteQuery("Update contacts_data \n Set Nombre = '" +P1.getText()+ "' \n Where ID = '" + S0 + "';");                                        
                                    Data.ExecuteQuery("Update contacts_data \n Set Apellido = '" +P2.getText()+ "' \n Where ID = '" + S0 + "';");                                        
                                    Data.ExecuteQuery("Update contacts_data \n Set Empresa = '" +P3.getText()+ "' \n Where ID = '" + S0 + "';");                                        
                                    Data.ExecuteQuery("Update contacts_data \n Set Posicion = '" +P4.getText()+ "' \n Where ID = '" + S0 + "';");
                                    Data.ExecuteQuery("Update contacts_data \n Set Telefono = '" +P5.getText()+ "' \n Where ID = '" + S0 + "';");
                                    Data.ExecuteQuery("Update contacts_data \n Set Email = '" +P6.getText()+ "' \n Where ID = '" + S0 + "';");
                                    Data.ExecuteQuery("Update contacts_data \n Set Notas = '" +P7.getText()+ "' \n Where ID = '" + S0 + "';");
                            }
                           JOptionPane.showMessageDialog(null, "Informacion Actualizada.");
                           Dialog.dispose();
                           P1.setEnabled(false);P2.setEnabled(false);P3.setEnabled(false);P4.setEnabled(false);
                           P5.setEnabled(false);P6.setEnabled(false);P7.setEnabled(false);
                        } catch(SQLException Ex) { JOptionPane.showMessageDialog(null, Ex); }

                     });

            } catch(SQLException Ex) { JOptionPane.showMessageDialog(null, Ex); }
        });
                
        Edit.addActionListener((ActionEvent e) -> {
            P1.setEnabled(true);
            P2.setEnabled(true);
            P3.setEnabled(true);
            P4.setEnabled(true);
            P5.setEnabled(true);
            P6.setEnabled(true);
            P7.setEnabled(true);
        });
        
        Delete.addActionListener((ActionEvent e) -> {
             if (JOptionPane.showConfirmDialog(null, "Estas segur@ que quieres borrar este contacto?", "Advertencia", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                 Data.ExecuteQuery("Delete From contacts_data Where ID = '" +P0.getText()+ "' ;");
              } else { Dialog.dispose(); } 
             CleanFields(P1, P2, P3, P4, P5, P6, P7);
        });
        
        
    }
    
    public void CleanFields(JTextPane P1, JTextPane P2, JTextPane P3, JTextPane P4, JTextPane P5, JTextPane P6, JTextPane P7){
        P1.setText(null);            
        P2.setText(null);    
        P3.setText(null);    
        P4.setText(null);    
        P5.setText(null);    
        P6.setText(null);    
        P7.setText(null);  
    }
    
    public void ImportHandler(JDialog Dialog,  JTable Table, JTextPane Pane, JButton Import, JButton Save, JButton Cancel) { // Finally Working
        Dialog.setTitle("Administrar Contactos");
        Dialog.setSize(1020, 420);
        Dialog.setVisible(true);
        Dialog.setLocationRelativeTo(null);
        Dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        DefaultTableModel Model = (DefaultTableModel) Table.getModel();
        
        Import.addActionListener((ActionEvent e) -> {
            JFileChooser Chooser = new JFileChooser("C:\\Users\\Emil\\Desktop");
            Chooser.showOpenDialog(null);
            File CSV = Chooser.getSelectedFile();
            try {
                Model.setRowCount(0);
                CSVReader Reader = new CSVReader(new FileReader(Chooser.getSelectedFile()));
                String[] nextLine;
                while((nextLine = Reader.readNext()) != null) {
                    if(nextLine != null) {
                        Model.addRow(nextLine);
                    } 
                }
                Pane.setText(CSV.getAbsolutePath());
                                
            } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        });
        
        Save.addActionListener((ActionEvent E) -> {
            try {
                String pic_place_holder = "C:\\Users\\Emil\\Documents\\NetBeansProjects\\ContactsCRUD\\src\\main\\java\\CRUD\\UserPlaceholder.png";
                Connection  Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prog_contacts_data", "root", "");
                PreparedStatement PS = Connect.prepareStatement("Insert Into contacts_data(ID, Nombre, Apellido, Empresa, Posicion, Telefono, Email, Notas, Foto) Values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                InputStream IS = new FileInputStream(new File(pic_place_holder));
                int rows = Table.getRowCount();
                for(int row = 0; row<rows ; row++) {
                    PS.setString(1, (String) Table.getValueAt(row, 0));
                    PS.setString(2, (String) Table.getValueAt(row, 1));
                    PS.setString(3, (String) Table.getValueAt(row, 2));
                    PS.setString(4, (String) Table.getValueAt(row, 3));                  
                    PS.setString(5, (String) Table.getValueAt(row, 4));
                    PS.setString(6, (String) Table.getValueAt(row, 5));
                    PS.setString(7, (String) Table.getValueAt(row, 6));
                    PS.setString(8, (String) Table.getValueAt(row, 7));
                    PS.setBlob(9, IS);
                    PS.execute();
                }
                
                
                JOptionPane.showMessageDialog(null, "Contactos guardados con éxito.");
            } catch(FileNotFoundException | HeadlessException | SQLException Ex) {
                JOptionPane.showMessageDialog(null, Ex);
            }
          });
        
        Cancel.addActionListener((ActionEvent e) -> {
            Dialog.dispose();
        });
    }
}



