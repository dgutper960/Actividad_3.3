public class Abuela {

    private String nombre;
    private String apellidos;
    private  int edad;

    private int dni;

    public String getNombre() {
        return nombre;
    }

    public Abuela(int dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }
    public Abuela(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;


    }
}
