package koneksi;
import java.sql.*;
/**
 *
 */
public class koneksi {
     public Connection koneksi;
    public Connection connect(){
        try {
            Class.forName ("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }catch (ClassNotFoundException ex){
            System.out.println("Gagal Koneksi " +ex);
        }
        String url = "jdbc:mysql://localhost/datagor";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println(" Berhasil koneksi Database bosss");
        }catch (SQLException ex){
            System.out.println("Gagal Koneksi Database");
    }
        return koneksi;
    }
}