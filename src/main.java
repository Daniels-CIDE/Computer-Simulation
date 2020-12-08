import java.util.Scanner;

public class main {



    private void ordenata() {

        System.out.println("Bienvenido a Computer Simulator!");

        Computer c1 = new Computer("c1", 4, 100, null);

        OperatingSystem os1 = new OperatingSystem("os1", "6.0", "64x", true, 20, 4);

        Software s1 = new Software("s1", "2.0", 5, 2);
        Software s2 = new Software("s2", "1.4.12", 2, 1);

        System.out.println("Primero que nada este es tu ordenador");
        enseñarOrdenador(c1);
        instalarSO();

    }
    public void instalarSO (){
        Scanner issc = new Scanner(System.in);
        System.out.println("Deseas instalar un Sistema Operativo ");
        System.out.println("  1.Si ");
        System.out.println("  2.No ");
        int op = issc.nextInt();
        boolean continuar = true;
        while (continuar == true) {
            switch (op) {
                case 1:
                    añadirSo();
                    break;
                case 2:
                    System.out.println("Pues no instalamos nada");
                    continuar = false;
                    break;
                default:
                    System.out.println("Fin de la aplicación");
                    exit();
                    break;
            }

        }
    }

    public static void enseñarOrdenador (Computer c1){
        System.out.println("Nombre del PC:    " + c1.getName());
        System.out.println("Memoria Ram:   " + c1.getRamMemory() + " GB");
        System.out.println("Espacio del disco duro: " + c1.getHardDisk() + " GB");
        System.out.println("Sistema Operativo:   " + c1.getOs());
        System.out.println();
    }

    private void añadirSo () {
        Scanner assc = new Scanner(System.in);
        System.out.println("¿Que Sistema Operativo deseas instalar?");
        System.out.println("  1.os1 ");
        System.out.println("  2.Buscar mas sistemas operativos ");
        System.out.println("  3.Atras ");
        int opcion = assc.nextInt();
        int salir = 0;
        while (salir == 0) {
            switch (opcion) {
                case 1:
                    añadirSoOs1();
                    break;
                case 2:
                    System.out.println("No se encuentran mas Sistemas Operativos");
                    añadirSo();
                    break;
                case 3:
                    instalarSO();
                    break;
                default:
                    System.out.println("Selecciona una opción del 1 al 3");
                    salir = 1;
                    break;
            }

        }

    }
    private void añadirSoOs1 () {
        System.out.println("Es el momento de instalar 'OS1' ");
    }
    public static void main(String[] args) {
        main ui = new main();
        ui.ordenata();
    }

    private void exit (){
        System.out.println("Adios!");
    }
}
