package poo1;

public class Estudiante {

    private String nombre, carne;
    private int edad;

    public Estudiante(String nombre, String carne, int edad) {
        this.nombre = nombre;
        this.carne = carne;
        this.edad = edad;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
