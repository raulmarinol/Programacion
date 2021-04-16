package U7_Examen;

public class Atleta {

    private String nombre;
    private Integer marca;
    private Categoria categoria;
    private Boolean finisher;

    public Atleta(String nombre, Categoria categoria, Boolean finisher) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.finisher = finisher;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Boolean getFinisher() {
        return finisher;
    }

    public void setFinisher(Boolean finisher) {
        this.finisher = finisher;
    }
}
