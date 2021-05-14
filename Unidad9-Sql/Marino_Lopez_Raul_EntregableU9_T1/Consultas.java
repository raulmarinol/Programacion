package Marino_Lopez_Raul_EntregableU9_T1;

import Unidad9.ConexionBD;

import java.sql.*;
import java.util.Scanner;

public class Consultas {
    public static void main(String[] args) {

        Consultas.PagosCliente();
        Consultas.DatosJefe();
        Consultas.InfoPedido();

    }





    public static void PagosCliente(){

        Connection connection = null;

        try {

           connection= ConexionBD.getConnection();
            Scanner sc = new Scanner(System.in);
            int num;

            String sql = "SELECT c.contactFirstName, c.contactLastName, c.country, SUM(p.amount) as suma\n" +
                    "FROM customers c INNER JOIN payments p ON c.customerNumber=p.customerNumber\n" +
                    "WHERE c.customerNumber= ?;";
            PreparedStatement statement = connection.prepareStatement(sql);

            System.out.println("Indicame el codigo del cliente:");
            num = sc.nextInt();

            statement.setInt(1,num);


            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString(1);
                String apellido = rs.getString(2);
                String country = rs.getString(3);
                double suma = rs.getDouble(4);

                System.out.println("-------------------------");
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellidos: " + apellido);
                System.out.println("Ciudad: " + country);
                System.out.println("Suma pedidos: " + suma);
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void InfoPedido(){
        Connection connection = null;
        try {

            connection= ConexionBD.getConnection();
            Scanner sc = new Scanner(System.in);
            String num;

            String sql = "SELECT p.productName, p.buyPrice, o.quantityOrdered\n" +
                    "        FROM orderdetails o INNER JOIN products p ON o.productCode=p.productCode\n" +
                    "        WHERE o.orderNumber = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);

            System.out.println("Indicame el codigo del pedido:");
            num = sc.next();

            statement.setString(1,num);


            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString(1);
                String precio = rs.getString(2);
                String cantidad = rs.getString(3);

                System.out.println("-------------------------");
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellidos: " + precio);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void DatosJefe(){
        Connection connection = null;
        try {

            connection= ConexionBD.getConnection();
            Scanner sc = new Scanner(System.in);
            int num;

            String sql = "SELECT e.lastName, e.firstName\n" +
                    "FROM employees e\n" +
                    "WHERE e.employeeNumber = (SELECT e2.reportsTo FROM employees e2\n" +
                    "WHERE e2.employeeNumber= ?);";
            PreparedStatement statement = connection.prepareStatement(sql);

            System.out.println("Indicame el codigo del empleado:");
            num = sc.nextInt();

            statement.setInt(1,num);


            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString(1);
                String apellido = rs.getString(2);


                System.out.println("-------------------------");
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellidos: " + apellido);
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
