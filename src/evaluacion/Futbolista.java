package evaluacion;

public class Futbolista extends Persona {

    private String dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, String dorsal, String demarcacion)
    {
        super(id, nombre, apellidos, edad);
        this.demarcacion = demarcacion;
        this.dorsal = dorsal;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos de Futbolista----");
        System.out.println("Id: "+ id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("Edad: "+ edad);
        System.out.println("Dorsal: "+ dorsal);
        System.out.println("Posición: "+ demarcacion);
    }

    public void jugarPartido()
    {
        System.out.println("Futbolista jugando partido...");
    }

    public void entrenar()
    {
        System.out.println("Futbolista entrenando...");
    }
}
