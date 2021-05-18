package Ej3;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static ConexionDB con=null;

    public static ConexionDB getConnection() {

        try {
            if (con == null) {
                con = (ConexionDB) DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3336/classicmodels?user=root&password=root"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return (con);
    }

    public static void close(){
        if (con != null) con.close();
    }
}
