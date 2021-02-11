package Marino_Lopez_Raul_U5_T1_Entrega;

abstract public class Deporte extends Pais {
    private String nombre;
    private String nombre_pabellon;

    public Deporte(String nombre, String nombre1, String nombre_pabellon) {
        super(nombre);
        this.nombre = nombre1;
        this.nombre_pabellon = nombre_pabellon;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_pabellon() {
        return nombre_pabellon;
    }

    public void setNombre_pabellon(String nombre_pabellon) {
        this.nombre_pabellon = nombre_pabellon;
    }




    @Override
    public String toString() {
        return "Deporte{" +
                "nombre='" + nombre + '\'' +
                ", nombre_pabellon='" + nombre_pabellon + '\'' +
                '}';
    }
}
