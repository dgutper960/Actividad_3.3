public class Madre extends Abuela {
    private int altura;
    private int peso;

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public Madre(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.altura = altura;
        this.peso = peso;


        }

    public void mostrarDatos() {
        System.out.println("Nombre " + getNombre()+
                "\nApellidos " + getApellidos() +
                "\nEdad " + getEdad() + "\nPeso " + peso +
                "\nAltura " + altura);
    }
    public void mostrarDatos(String dni){

    }
}
