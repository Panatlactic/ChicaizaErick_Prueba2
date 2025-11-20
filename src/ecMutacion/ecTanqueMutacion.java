package ecMutacion;

import ecMarsupial_pk.ecMarsupial;

public class ecTanqueMutacion implements ecIA {

    // Refactorización: eliminación de atributo privado entero n

    public ecTanqueMutacion (){
    }

    public boolean ecMutar (ecMarsupial marsupial){

        if (marsupial.getMutado() == false){

            ecMarsupialChicaiza marsupialChicaiza = new ecMarsupialChicaiza();
            marsupial.setMutado(true);

            int numRandi = (int) (Math.random() * ((1000 - 100) + 1));
            String caracter = "-";
            String vacio = " ";
            for (int i = 0; i < 21; i += 1){
                try {
                    System.out.print("Mutación en proceso: " + caracter.repeat(i) + vacio.repeat(20 - i) + "]  " + ((i*numRandi)/20) + " de " + numRandi + " (mSv)\r");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
            System.out.println("\n|*|------------------------------------ Marsupial");
            System.out.println("|*|------------------------------------------- MarsupialChicaiza");

            marsupialChicaiza.saludar();

        } else {
            System.out.println("Mutación Fallida. Este marsupial ya ha mutado.");
        }

        return false;
    }
}
