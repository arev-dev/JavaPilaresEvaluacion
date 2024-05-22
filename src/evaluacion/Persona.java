package evaluacion;

public abstract class Persona {

    public int id;
    public String nombre;
    public String apellidos;
    public int edad;

    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public abstract void mostrarDatos();

    public void viajar() {
        System.out.println("Viajando...");
    }

    public void concentrarse()
    {
        System.out.println("concentrandose...");
    }
}