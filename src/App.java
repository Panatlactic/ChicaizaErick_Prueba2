import ecMarsupial_pk.ecMarsupial;
import ecMutacion.ecTanqueMutacion;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\nEscuela Politécnica Nacional\nProgramación II\nNombre: Erick Sebastián Chicaiza Diaz\nGrupo: GR2SW\nCédula: 1756172894\n");

        ecControlador controlador = new ecControlador();
        controlador.ecMostratProterozoico();
        controlador.ecMostrarClasificacionYAnimal();

        ecMarsupial marsupial1 = new ecMarsupial("Pepe");
        ecMarsupial marsupial2 = new ecMarsupial("Lucho", true);
        ecTanqueMutacion tanqueMutacion = new ecTanqueMutacion();

        System.out.println("\n----- Mutacion de " + marsupial1.getNombre() + " -----");
        tanqueMutacion.ecMutar(marsupial1);
        System.out.println("\n----- Mutacion de " + marsupial2.getNombre() + " -----");
        tanqueMutacion.ecMutar(marsupial2);

    }
}
