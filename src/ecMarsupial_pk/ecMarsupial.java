package ecMarsupial_pk;

import ecFanerozoico.IComportamiento;

public class ecMarsupial implements IComportamiento {

    private String nombre;
    private boolean mutado;

    // get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getMutado() {
        return mutado;
    }

    public void setMutado(boolean mutado) {
        this.mutado = mutado;
    }

    // constructores

    public ecMarsupial(){
        setNombre("Marsupio");
        setMutado(false);
        System.out.println("Hola soy " + getNombre() + ". Soy un Marsupial");
    }

    public ecMarsupial(String nombre){
        setNombre(nombre);
        setMutado(false);
        System.out.println("Hola soy " + getNombre() + ". Soy un Marsupial");
    }

    // Refactorización: Se añadió el constructor con parámetros (nombre: String, mutado: boolean)

    public ecMarsupial(String nombre, boolean mutado){
        setNombre(nombre);
        setMutado(mutado);
        System.out.println("Hola soy " + getNombre() + ". Soy un Marsupial");
    }

    // metodos

    public void saludar(){
        System.out.println(getNombre() + " saludando a todos.\n" +
        getNombre() + " saludando a Panatlactic");
    }
}
