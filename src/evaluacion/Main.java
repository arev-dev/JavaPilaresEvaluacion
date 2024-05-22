package evaluacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoja la opcion que desea ejecutar:");
        System.out.println("1. Registrar Futbolista");
        System.out.println("2. Registrar Entrenador");
        System.out.println("3. Registrar Masajista");

        int opc = sc.nextInt();

        if(opc == 1){crearFutbolista(sc);}
        else if(opc == 2){crearEntrenador(sc);}
        else if(opc == 3){crearMasajista(sc);}
        else { System.out.println("Opcion invalida");}


    }

    public static void crearFutbolista(Scanner sc){
        System.out.println("Registrar Futbolista:");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Dorsal: ");
        String dorsal = sc.nextLine();

        System.out.print("Demarcacion: ");
        String demarcacion = sc.nextLine();

        Futbolista futbolista = new Futbolista(id, nombre, apellidos, edad, dorsal, demarcacion);

        System.out.println("Futbolista registrado con exito.");

        futbolista.mostrarDatos();

    }

    public static void crearEntrenador(Scanner sc){
        System.out.println("Registrar Entrenador:");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Id Federacion: ");
        int idFederacion = sc.nextInt();

        Entrenador entrenador = new Entrenador(id, nombre, apellidos, edad, idFederacion);

        System.out.println("Entrenador registrado con exito.");

        entrenador.mostrarDatos();

    }


    public static void crearMasajista(Scanner sc){
        System.out.println("Registrar Masajista:");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Titulacion: ");
        String titulacion = sc.nextLine();

        System.out.print("Años de Experiencia: ");
        int experiencia = sc.nextInt();

        Masajista masajista = new Masajista(id, nombre, apellidos, edad, titulacion, experiencia);

        System.out.println("Masajista registrado con exito.");

        masajista.mostrarDatos();

    }


}
