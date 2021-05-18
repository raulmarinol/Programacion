package Ej3;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Consultas {



    static void mostrarOficinas(){

        Connection con = (Connection) new ConexionDB();

        con = null;

        String sql = "Select * from offices";
        //PreparedStatement statement =

    }
}
