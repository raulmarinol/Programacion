package Ej4;

import Ej3.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {


    public static void main(String[] args) throws SQLException {

        Connection con = (Connection) new ConexionDB();

        String sql1 = "Insert into customers values(9999,'Alixar','Pepe','Lopez','654987123','C/ Cartalla,'C/ Lepe','Huelva','An','12005','Spain',1504,21000)";
        String sql2 = "Insert into customers values(9999,'HQ339999','2021-03-24',1000)";
        String sql3 = "Insert into customers values(9999,'HQ336888','2021-03-21',1500)";

        PreparedStatement statement1 = con.prepareStatement(sql1);
        PreparedStatement statement2 = con.prepareStatement(sql2);
        PreparedStatement statement3 = con.prepareStatement(sql3);

        con.setAutoCommit(false);

        statement1.getResultSet();
        statement2.getResultSet();
        statement3.getResultSet();

        con.commit ();

    }

}
