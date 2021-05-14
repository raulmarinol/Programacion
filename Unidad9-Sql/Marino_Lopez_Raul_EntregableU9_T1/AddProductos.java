package Marino_Lopez_Raul_EntregableU9_T1;

import Unidad9.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddProductos {
    public static void main(String[] args) throws SQLException {
        Connection connection= ConexionBD.getConnection();

        String sql="INSERT INTO productLine VALUES (?,?,null,null)";
        PreparedStatement sentencia=connection.prepareStatement(sql);

        sentencia.setString(1,"Carros");
        sentencia.setString(2,"Coches bonitos");

        sentencia.executeUpdate();
        connection.close();

    }
}
