package evaluacion;

public class Entrenador extends Persona{
    
    private final int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion)
    {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos de Entrenador----");
        System.out.println("Id: "+ id);
        System.out.println("IdFederacion: "+ idFederacion);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("Edad: "+ edad);
    }

    public void dirigirPartido()
    {
        System.out.println("Entrenador dirigiendo partido...");
    }

    public void dirigirEntrenamiento()
    {
        System.out.println("Entrenador dirigiendo entrenamiento...");
    }
}
