/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10_1402023032;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author LUTHFI
 */
public class Connect {
    private static Connection connect;
    
    public static Connection getConnected(){
        if(connect == null){
            try{
                String url = "jdbc:mysql://localhost:3306/daftarojol";
                String user = "root";
                String password = "";
                connect = DriverManager.getConnection(url, user, password);
                System.out.println("Connected Successfully");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("Error!");
            }
        }
        return connect;
    }
}
