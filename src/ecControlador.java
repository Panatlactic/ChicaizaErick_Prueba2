public class ecControlador {
    public ecControlador(){

    }

    public void ecMostratProterozoico (){
        char[] figuraLoading = { '-', '\\', '|', '/'};
        int j = 0;

        try {
            for (int i = 0; i < 101; i += 1){
                if (j == 4) j = 0;
                System.out.print(figuraLoading[j] + "  " + i + "%" + "\r");
                j += 1;
                Thread.sleep(25);
            }
            System.out.println("|*|---- Gnathostomata\r");
        } catch (InterruptedException e){
        }

        try {
            for (int i = 0; i < 101; i += 1){
                if (j == 4) j = 0;
                System.out.print(figuraLoading[j] + "  " + i + "%" + "\r");
                j += 1;
                Thread.sleep(25);
            }
            System.out.println("|*|------------ Osteichthyes\r");
        } catch (InterruptedException e){
        }

        try {
            for (int i = 0; i < 101; i += 1){
                if (j == 4) j = 0;
                System.out.print(figuraLoading[j] + "  " + i + "%" + "\r");
                j += 1;
                Thread.sleep(25);
            }
            System.out.println("|*|-------------------- Sarcopterygii\r");
        } catch (InterruptedException e){
        }

        try {
            for (int i = 0; i < 101; i += 1){
                if (j == 4) j = 0;
                System.out.print(figuraLoading[j] + "  " + i + "%" + "\r");
                j += 1;
                Thread.sleep(25);
            }
            System.out.println("|*|---------------------------- Tetrapoda\r");
        } catch (InterruptedException e){
        }

        try {
            for (int i = 0; i < 101; i += 1){
                if (j == 4) j = 0;
                System.out.print(figuraLoading[j] + "  " + i + "%" + "\r");
                j += 1;
                Thread.sleep(25);
            }
            System.out.println("|*|------------------------------------ Amniota\r");
        } catch (InterruptedException e){
        }

    }

    public void ecMostrarClasificacionYAnimal (){
        System.out.println("Ingresando: Amniota ---> Marsupiales");
    }
}
