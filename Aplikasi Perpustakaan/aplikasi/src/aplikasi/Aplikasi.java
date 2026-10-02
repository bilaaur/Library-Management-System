
package aplikasi;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
public class Aplikasi {

    static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection koneksi;
    Statement stm;

    public void con (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/tb_perpustakaan","root","");
            stm = koneksi.createStatement();
        }catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
