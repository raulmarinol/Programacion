package Marino_Lopez_Raul_EntregableU9_T1;

import Unidad9.ConexionBD;
import Unidad9.Employee;
import Unidad9.EmployeeModel;
import Unidad9.Office;
import Unidad9.OfficeModel;

import java.sql.Connection;
import java.sql.SQLException;

public class main_transacciones {
    public static void main(String[] args) {
        Connection connection= ConexionBD.getConnection();

        try{
            connection.setAutoCommit(false);

            OfficeModel.insertOffice(
                    new Office(
                            "11",
                            "Huelva",
                            "+34 959 25 25 45",
                            "Avda Federico Molina",
                            "default",
                            "",
                            "España",
                            "41950",
                            "Aqui"));

            System.out.println("Insertada oficina");

            EmployeeModel.insertEmployee(
                    new Employee(
                            8001,
                            "Perez",
                            "Jorge",
                            "8181",
                            "raul@classicmodelcars.com",
                            "11",
                            1102,
                            "Comercial"));
            new Employee(
                    8002,
                    "Perez",
                    "Jorge",
                    "8181",
                    "maria@classicmodelcars.com",
                    "11",
                    1102,
                    "Comercial");
            connection.commit();
            System.out.println("Insertado empleado");
            connection.close();

        }catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (connection!=null){
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    connection.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }
}
