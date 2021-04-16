package Marino_Lopez_Raul_U7_T1;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String dni;
    private Integer id;
    private static int num=1;


    public Alumno(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.id = num;
        num++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Alumno.num = num;
    }


}
