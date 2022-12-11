public class Main {
    public static void main(String[] args){
        Madre  madre=new Madre("Teresa", "Rodriguez Fernandez", 35);
        Madre madre1=new Madre("Antonia", "Rodirguez", 45 );
        Hija hija=new Hija("Almudena", "Fernandez", 18);
        Hija hija1=new Hija("Rafaela", "Gonzalez Perez", 20);
        madre.mostrarDatos();
        madre.mostrarDatos("41248569P");
        hija.mostrarDatos();
        hija1.mostrarDatos("32569640D");


    }
}