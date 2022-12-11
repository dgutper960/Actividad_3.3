public class Hija extends Madre{
    private String profesion;
    private boolean hijos;
    public Hija(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);


    }

    public void mostrarDatos(){
        System.out.println("Nombre de hija " + getNombre() +
                "\nApellido hija " + getApellidos());
    }
}
