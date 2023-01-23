package Barang;

import java.sql.DriverManager;

/**
 * @author MOCHAMMAD TOYIB
 */

public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_inventory";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.print("Koneksi ke Database Terhubung !!");
            } catch (Exception e) {
                System.out.println("ERROR, Koneksi Tidak Terhubung !!");
            }
        }
        return koneksi;
    }
    public static void main(String args[]){
        getKoneksi();
    }
    
}
