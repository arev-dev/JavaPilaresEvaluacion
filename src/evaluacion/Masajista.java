package evaluacion;

public class Masajista extends Persona{

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia)
    {
        super(id, nombre, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.titulacion = titulacion;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos de Masajista----");
        System.out.println("Id: "+ id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("Edad: "+ edad);
        System.out.println("Titulacion: "+ titulacion);
        System.out.println("Años de Experiencia: "+ aniosExperiencia);
    }


    public void darMasaje()
    {
        System.out.println("Masajeando...");
    }

}
